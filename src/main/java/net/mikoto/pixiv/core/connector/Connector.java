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
     * @param artworkId The artworkId
     * @return An artwork object.
     */
    Artwork getArtworkById(int artworkId);
}
