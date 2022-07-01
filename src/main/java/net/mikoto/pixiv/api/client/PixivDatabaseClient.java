package net.mikoto.pixiv.api.client;

import com.alibaba.fastjson2.JSONObject;
import com.dtflys.forest.annotation.Address;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Request;
import org.springframework.data.domain.Sort;

import static net.mikoto.pixiv.api.constant.HttpApi.*;

/**
 * @author mikoto
 * @date 2022/7/1 17:40
 */
@Address(host = "{address}")
public interface PixivDatabaseClient {
    /**
     * Insert artworks to pixiv database.
     *
     * @param address  The address of the database.
     * @param token    The token.
     * @param artworks The artwork.
     */
    @Request(DATABASE_ARTWORK + DATABASE_ARTWORK_INSERT_ARTWORKS + "?token={token}")
    void insertArtworks(String address, String token, @JSONBody JSONObject artworks);

    /**
     * Get artwork from pixiv database.
     *
     * @param address   The address.
     * @param artworkId The artwork.
     * @return Artwork.
     */
    @Request(DATABASE_ARTWORK + DATABASE_ARTWORK_GET_ARTWORK + "?artworkId={artworkId}")
    String getArtwork(String address, String artworkId);

    /**
     * Get artworks from pixiv database.
     *
     * @param address    The address.
     * @param credential The credential you need to search.
     * @param order      Order by. [DESC,ASC]
     * @param properties [The field in Artwork.class]
     * @param pageCount  The page.
     * @return The artworks.
     */
    @Request(DATABASE_ARTWORK + DATABASE_ARTWORK_GET_ARTWORKS + "?credential={credential}&order={order}&properties={properties}&pageCount={pageCount}")
    String getArtworks(String address, String credential, Sort.Direction order, String properties, int pageCount);
}
