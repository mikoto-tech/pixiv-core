package net.mikoto.pixiv.core.model.server;

import java.util.Objects;

/**
 * @author mikoto
 * @date 2022/3/27 3:42
 */
public class ForwardServer extends HttpServer implements CurrentWeighted {
    private int weight;
    private int currentWeight = 0;
    private String key;

    public ForwardServer(String address, int weight, String key) {
        super(address);
        super.setAddress(address);
        this.weight = weight;
        this.key = key;
    }

    public ForwardServer() {
        super();
    }

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nForwardServer{" +
                "address='" + super.getAddress() + '\'' +
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
        return weight == that.weight && currentWeight == that.currentWeight && Objects.equals(super.getAddress(), that.getAddress()) && Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getAddress(), weight, currentWeight, key);
    }
    public int getWeight() {
        return weight;
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

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
