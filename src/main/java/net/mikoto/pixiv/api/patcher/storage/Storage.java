package net.mikoto.pixiv.api.patcher.storage;

/**
 * @author mikoto
 * @date 2022/6/12 3:42
 */
public interface Storage<D, S> {
    /**
     * Store the data to storage.
     *
     * @param data   The data.
     * @param server The server need to store.
     */
    void store(D data, S server);
}
