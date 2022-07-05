package net.mikoto.pixiv.core.connector;

import net.mikoto.pixiv.core.model.Artwork;

public interface ArtworkConnector extends Connector {
    /**
     * Get an artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork.
     */
    Artwork getArtworkById(int artworkId);
}
