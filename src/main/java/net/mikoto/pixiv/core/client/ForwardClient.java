package net.mikoto.pixiv.core.client;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Var;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import static net.mikoto.pixiv.core.constant.HttpApi.*;

/**
 * @author mikoto
 * @date 2022/7/3 1:56
 */
@Component
public interface ForwardClient {
    /**
     * Get the artwork from forward.
     *
     * @param address   The address of the forward server.
     * @param key       The key of the forward server.
     * @param artworkId The artwork id.
     * @return The artwork JSON string.
     */
    @Get(
            url = "{address}" + FORWARD_ARTWORK + FORWARD_ARTWORK_GET_INFORMATION + "?key={key}&artworkId={artworkId}"
    )
    String getArtwork(@NotNull @Var("address") String address, @Var("key") String key, @Var("artworkId") int artworkId);

    /**
     * Get the image from forward.
     *
     * @param address The address of the forward server.
     * @param key     The key of the forward server.
     * @param url     The artwork id.
     * @return The image byte data.
     */
    @Get(
            url = "{address}" + FORWARD_ARTWORK + FORWARD_ARTWORK_GET_IMAGE + "?key={key}&url={url}"
    )
    byte[] getImage(@NotNull @Var("address") String address, @Var("key") String key, @NotNull @Var("url") String url);
}
