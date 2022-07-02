package net.mikoto.pixiv.core.connector.impl;

import net.mikoto.pixiv.core.connector.ForwardConnector;
import net.mikoto.pixiv.core.model.Artwork;
import net.mikoto.pixiv.core.model.ForwardServer;
import net.mikoto.pixiv.core.source.SmoothWeightedSource;

/**
 * @author mikoto
 * @date 2022/7/3 1:53
 */
public class ForwardConnectorImpl extends SmoothWeightedSource<ForwardServer> implements ForwardConnector {
    /**
     * Get the artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork.
     */
    @Override
    public Artwork getArtwork(int artworkId) {
        ForwardServer forwardServer = getServer();
        return getArtworkSingleServer(forwardServer.getAddress(), forwardServer.getKey(), artworkId);
    }

    /**
     * Get the image by url.
     *
     * @param url The url
     * @return The image bytes.
     */
    @Override
    public byte[] getImage(String url) {
        ForwardServer forwardServer = getServer();
        return getImageSingleServer(forwardServer.getAddress(), forwardServer.getKey(), url);
    }

    /**
     * Get artwork at single server.
     *
     * @param address   The address of the server.
     * @param key       The key of the server.
     * @param artworkId The artwork id.
     * @return The artwork.
     */
    @Override
    public Artwork getArtworkSingleServer(String address, String key, int artworkId) {
        return null;
    }

    /**
     * Get image at single server.
     *
     * @param address The address of the server.
     * @param key     The key of the server.
     * @param url     The artwork id.
     * @return The artwork.
     */
    @Override
    public byte[] getImageSingleServer(String address, String key, String url) {
        return new byte[0];
    }
}
