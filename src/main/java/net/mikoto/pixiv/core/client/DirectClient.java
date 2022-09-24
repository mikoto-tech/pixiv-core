package net.mikoto.pixiv.core.client;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Var;
import org.springframework.stereotype.Component;

/**
 * @author mikoto
 * @date 2022/6/25 1:11
 */
@Component
public interface DirectClient {
    /**
     * Get the artwork(raw) from pixiv.
     *
     * @param artworkId The artwork id.
     * @return Result.
     */
    @Get(
            url = "https://www.pixiv.net/ajax/illust/{artworkId}",
            headers = {
                    "Cookie: {cookie}"
            }
    )
    String getArtwork(@Var("artworkId") int artworkId, @Var("cookie") String cookie);

    /**
     * Get the image from pixiv.
     *
     * @param url The image url.
     * @return Result.
     */
    @Get(
            url = "https://i.pximg.net{url}",
            headers = {
                    "Referer: https://www.pixiv.net"
            }
    )
    byte[] getImage(@Var("url") String url);
}
