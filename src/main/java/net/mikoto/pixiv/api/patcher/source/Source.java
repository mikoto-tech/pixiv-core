package net.mikoto.pixiv.api.patcher.source;

import net.mikoto.pixiv.api.patcher.connector.Connector;

/**
 * @author mikoto
 * @date 2022/6/12 3:40
 */
public interface Source<D, S> {
    /**
     * Obtain the data from the source.
     *
     * @param dataId    The data id.
     * @param connector The connector to obtain.
     * @return The data.
     */
    D obtain(int dataId, Connector<S> connector);
}
