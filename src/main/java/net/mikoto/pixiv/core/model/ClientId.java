package net.mikoto.pixiv.core.model;

/**
 * @author mikoto
 * Create for pixiv-core
 * Create at 2022/7/30
 */
public enum ClientId {
    /**
     * The database application, please view at <a href="https://github.com/mikoto-tech/pixiv-database">Pixiv-Database</a>.
     * For the version newer than 1.0.0.
     */
    Database(1),

    /**
     * The frontend application, please view at <a href="https://github.com/mikoto-tech/pixiv-frontend">Pixiv-Frontend</a>.
     * For the version newer than 1.0.0.
     */
    Frontend(2),

    /**
     * The patcher application, please view at <a href="https://github.com/mikoto-tech/pixiv-patcher">Pixiv-Patcher</a>.
     * For the version newer than 1.2.0.
     */
    Patcher(3),

    /**
     * The forward application, please view at <a href="https://github.com/mikoto-tech/pixiv-forward">Pixiv-Forward</a>.
     * For the version newer than 1.3.4.
     */
    Forward(4);

    private final int clientId;

    ClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }
}
