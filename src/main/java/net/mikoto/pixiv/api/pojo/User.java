package net.mikoto.pixiv.api.pojo;

import com.alibaba.fastjson.JSONObject;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;

/**
 * @author mikoto
 * @date 2022/2/1 19:22
 */
public class User {
    private int id;
    private String userName;
    private String userPassword;
    private String userSalt;
    private String userKey;
    private String profileUrl;
    private String createTime;
    private String updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
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

    public User loadJson(@NotNull JSONObject jsonObject) throws IllegalAccessException {
        for (Field field :
                this.getClass().getDeclaredFields()) {
            field.set(this, jsonObject.get(field.getName()));
        }

        return this;
    }
}
