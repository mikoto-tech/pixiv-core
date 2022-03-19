package net.mikoto.pixiv.api.pojo;

import com.alibaba.fastjson.JSONObject;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;

/**
 * @author mikoto
 * @date 2022/2/1 19:28
 */
public class Service {
    private ServiceType serviceType;
    private String address;
    private String createTime;
    private String updateTime;

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public JSONObject toJsonObject() throws IllegalAccessException {
        JSONObject outputJsonObject = new JSONObject();

        for (Field field :
                this.getClass().getDeclaredFields()) {
            outputJsonObject.put(field.getName(), field.get(this));
        }

        return outputJsonObject;
    }

    public Service loadJson(@NotNull JSONObject jsonObject) throws IllegalAccessException {
        for (Field field :
                this.getClass().getDeclaredFields()) {
            field.set(this, jsonObject.get(field.getName()));
        }

        return this;
    }
}
