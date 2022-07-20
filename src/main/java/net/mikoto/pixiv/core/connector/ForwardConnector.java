package net.mikoto.pixiv.core.connector;

import net.mikoto.pixiv.core.model.Artwork;
import net.mikoto.pixiv.core.model.server.ForwardServer;
import net.mikoto.pixiv.core.source.Source;

/**
 * @author mikoto
 * @date 2022/7/2 17:42
 */
public interface ForwardConnector extends ArtworkConnector, Source<ForwardServer> {
    /**
     * Get the artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork.
     */
    default Artwork getArtwork(int artworkId) {
        ForwardServer forwardServer = this.getServer();
        return getArtworkSingleServer(forwardServer.getAddress(), forwardServer.getKey(), artworkId);
    }

    /**
     * Get the image by url.
     *
     * @param url The url
     * @return The image bytes.
     */
    default byte[] getImage(String url) {
        ForwardServer forwardServer = this.getServer();
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

    /**
     * Override the Connector interface's getArtworkById() method in order to get artwork by artwork id.
     * <b>Warning! There will throw RuntimeException instead normal exception!!! It's not safe!!!</b>
     * <b>So use this method as less as you can.</b>
     *
     * @param artworkId The artwork id.
     * @return An artwork object.
     */
    @Override
    default Artwork getArtworkById(int artworkId) {
        return getArtwork(artworkId);
    }
}
