package net.mikoto.pixiv.core.model;

/**
 * @author mikoto
 * @date 2022/6/18 14:17
 */
public interface CurrentWeighted extends Weighted {
    /**
     * Get the current weight.
     *
     * @return The current weight.
     */
    int getCurrentWeight();

    /**
     * Set the current weight.
     *
     * @param currentWeight The current weight.
     */
    void setCurrentWeight(int currentWeight);
}
