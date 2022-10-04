package net.mikoto.pixiv.core.client;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Post;
import com.dtflys.forest.annotation.Var;
import org.springframework.stereotype.Component;

/**
 * @author mikoto
 * @date 2022/7/1 17:40
 */
@Component
public interface DatabaseClient {
    /**
     * Insert artworks to pixiv database.
     *
     * @param address  The address of the database.
     * @param token    The token.
     * @param artworks The artwork.
     */
    @Post(
            "{address}/artwork/insertArtworks?token={token}"
    )
    void insertArtworks(@Var("address") String address, @Var("token") String token, @JSONBody String artworks);

    /**
     * Get artwork from pixiv database.
     *
     * @param address   The address.
     * @param artworkId The artwork.
     * @return Artwork.
     */
    @Get(
            "{address}/artwork/getArtwork?artworkId={artworkId}"
    )
    String getArtwork(@Var("address") String address, @Var("artworkId") int artworkId);

    /**
     * Get artworks from pixiv database.
     *
     * @param address    The address.
     * @param tag        The tag need to search.
     * @param properties [The field in Artwork.class]
     * @param pageCount  The page.
     * @return The artworks.
     */
    @Post(
            "{address}/artwork/getArtworks?tag={tag}&properties={properties}&pageCount={pageCount}&grading={grading}&size=12"
    )
    String getArtworks(@Var("address") String address, @Var("tag") String tag, @Var("properties") String properties, @Var("pageCount") int pageCount, @Var("grading") int grading);
}
