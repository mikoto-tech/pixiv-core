package net.mikoto.pixiv.core.connector;

import net.mikoto.pixiv.core.model.Artwork;

/**
 * @author mikoto
 */
public interface ArtworkConnector extends Connector {
    /**
     * Override the Connector interface's getArtworkById() method in order to get artwork by artwork id.
     * <b>Warning! There will throw RuntimeException instead normal exception!!! It's not safe!!!</b>
     * <b>So use this method as less as you can.</b>
     *
     * @param artworkId The artwork id.
     * @return An artwork object.
     */
    Artwork getArtworkById(int artworkId);
}
