package net.mikoto.pixiv.core.client;

import com.dtflys.forest.annotation.Address;
import com.dtflys.forest.annotation.Request;

import static net.mikoto.pixiv.core.constant.HttpApi.*;

/**
 * @author mikoto
 * @date 2022/7/1 15:20
 */
public interface PixivForwardClient {
    /**
     * Get artwork from pixiv forward.
     *
     * @param address   The address.
     * @param key       The key.
     * @param artworkId The artwork.
     * @return Artwork.
     */
    @Request(FORWARD_ARTWORK + FORWARD_ARTWORK_GET_INFORMATION + "?key={key}&artworkId={artworkId}")
    @Address(
            host = "{address}"
    )
    String getArtwork(String address, String key, String artworkId);

    /**
     * Get image from pixiv forward.
     *
     * @param address The address.
     * @param key     The key.
     * @param url     The url.
     * @return Image.
     */
    @Request(FORWARD_ARTWORK + FORWARD_ARTWORK_GET_IMAGE + "?key={key}&url={url}")
    byte[] getImage(String address, String key, String url);
}
