package net.mikoto.pixiv.core.connector;

import net.mikoto.pixiv.core.model.Artwork;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * @author mikoto
 * @date 2022/7/2 17:42
 */
public interface DatabaseConnector extends Connector {
    /**
     * Get an artwork from database.
     * Each page can provide 12 artworks.
     *
     * @param credential The credential you need to search.
     * @param order      The order of the artworks.
     * @param properties The properties in Artwork.class
     * @param pageCount  The page of the artworks.
     * @return Artworks list.
     */
    List<Artwork> getArtworks(String credential, Sort.Order order, String properties, int pageCount);
}
