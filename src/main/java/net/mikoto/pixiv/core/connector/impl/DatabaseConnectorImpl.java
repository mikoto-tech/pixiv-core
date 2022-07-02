package net.mikoto.pixiv.core.connector.impl;

import net.mikoto.pixiv.core.connector.DatabaseConnector;
import net.mikoto.pixiv.core.model.Artwork;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @author mikoto
 * @date 2022/7/3 1:53
 */
@Component("databaseConnector")
public class DatabaseConnectorImpl implements DatabaseConnector {
    /**
     * Get an artwork from database.
     * Each page can provide 12 artworks.
     *
     * @param credential The credential you need to search.
     * @param order      The order of the artworks.
     * @param properties The properties in Artwork.class
     * @param pageCount  The page of the artworks.
     * @return The artwork objects list.
     */
    @Override
    public List<Artwork> getArtworks(String credential, Sort.Order order, String properties, int pageCount) {
        return null;
    }

    /**
     * Get an artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork object.
     */
    @Override
    public Artwork getArtwork(int artworkId) {
        return null;
    }

    /**
     * Insert artworks.
     *
     * @param token    The token of you.
     * @param artworks The set of artworks.
     */
    @Override
    public void insertArtworks(String token, Set<Artwork> artworks) {

    }
}
