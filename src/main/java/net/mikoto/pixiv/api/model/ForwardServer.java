package net.mikoto.pixiv.api.model;

import java.util.Objects;

/**
 * @author mikoto
 * @date 2022/3/27 3:42
 */
public class ForwardServer {
    private String address;
    private int weight;
    private int currentWeight = 0;
    private String key;

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nForwardServer{" +
                "address='" + address + '\'' +
                ", weight=" + weight +
                ", currentWeight=" + currentWeight +
                ", key='" + key + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ForwardServer that = (ForwardServer) o;
        return weight == that.weight && currentWeight == that.currentWeight && Objects.equals(address, that.address) && Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, weight, currentWeight, key);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
