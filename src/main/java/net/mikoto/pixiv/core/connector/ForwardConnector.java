package net.mikoto.pixiv.core.connector;

import net.mikoto.pixiv.core.model.Artwork;

/**
 * @author mikoto
 * @date 2022/7/2 17:42
 */
public interface ForwardConnector extends Connector {
    /**
     * Get the artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork.
     */
    Artwork getArtwork(int artworkId);

    /**
     * Get the image by url.
     *
     * @param url The url
     * @return The image bytes.
     */
    byte[] getImage(String url);

    /**
     * Get artwork at single server.
     *
     * @param address   The address of the server.
     * @param key       The key of the server.
     * @param artworkId The artwork id.
     * @return The artwork.
     */
    Artwork getArtworkSingleServer(String address, String key, int artworkId);

    /**
     * Get image at single server.
     *
     * @param address The address of the server.
     * @param key     The key of the server.
     * @param url     The artwork id.
     * @return The artwork.
     */
    byte[] getImageSingleServer(String address, String key, String url);
}
