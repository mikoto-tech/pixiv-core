package net.mikoto.pixiv.api.pojo;

/**
 * @author mikoto
 * @date 2022/2/1 19:28
 */
public class Service {
    private int id;
    private ServiceType serviceType;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
