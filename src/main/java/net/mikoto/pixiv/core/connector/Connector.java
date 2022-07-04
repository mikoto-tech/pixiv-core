package net.mikoto.pixiv.core.connector;

import net.mikoto.pixiv.core.model.Artwork;

/**
 * @author mikoto
 * @date 2022/7/2 17:42
 */
public interface Connector {
    /**
     * Get an artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork.
     */
    Artwork getArtworkById(int artworkId);
}
