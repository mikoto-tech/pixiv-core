package net.mikoto.pixiv.core.connector;

import net.mikoto.pixiv.core.model.Artwork;
import net.mikoto.pixiv.core.model.Grade;
import net.mikoto.pixiv.core.model.server.DatabaseServer;
import net.mikoto.pixiv.core.source.Source;
import org.springframework.data.domain.Sort;

import java.util.Set;

/**
 * @author mikoto
 * @date 2022/7/2 17:42
 */
public interface DatabaseConnector extends ArtworkConnector, Source<DatabaseServer> {
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
    Artwork[] getArtworks(String credential, Sort.Direction order, String properties, int pageCount, Grade grading);

    /**
     * Get an artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork object.
     */
    Artwork getArtwork(int artworkId);

    /**
     * Insert artworks.
     *
     * @param token    The token of you.
     * @param artworks The set of artworks.
     */
    void insertArtworks(String token, Set<Artwork> artworks);

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
