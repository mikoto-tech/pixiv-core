package net.mikoto.pixiv.api.patcher.connector;

/**
 * @author mikoto
 * @date 2022/6/18 17:00
 */
public interface Connector<S> {
    /**
     * Add a server.
     *
     * @param server The source.
     */
    void addServer(S server);

    /**
     * Get the servers.
     *
     * @return The servers.
     */
    Object[] getServers();

    /**
     * Get the server.
     *
     * @return The server.
     */
    S getServer();
}
