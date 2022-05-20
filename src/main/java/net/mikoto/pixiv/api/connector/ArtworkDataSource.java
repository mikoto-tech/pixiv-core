package net.mikoto.pixiv.api.connector;

import net.mikoto.pixiv.api.model.Artwork;

/**
 * @author mikoto
 * @date 2022/5/15 3:03
 */
public interface ArtworkDataSource {
    /**
     * Get an artwork.
     *
     * @param artworkId The artwork id.
     * @return An artwork.
     * @throws Exception Exception.
     */
    Artwork getArtworkById(int artworkId) throws Exception;
}
