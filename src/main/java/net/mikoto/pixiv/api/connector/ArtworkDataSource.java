package net.mikoto.pixiv.api.connector;

import net.mikoto.pixiv.api.pojo.Artwork;

import java.util.List;

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

    /**
     * Get artworks.
     *
     * @param orderBy Order by.
     * @param order   Order.
     * @param page    Page.
     * @return Artworks.
     * @throws Exception Exception.
     */
    List<Artwork> getArtworks(OrderBy orderBy, Order order, int page) throws Exception;
}
