package net.mikoto.pixiv.api.http.forward.artwork;

import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.forward.Artwork;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mikoto
 * @date 2022/3/12 21:19
 */
@HttpApiPath("/getImage")
@HttpApiParentNode(Artwork.class)
public interface GetImage {
    /**
     * Get image.
     *
     * @param response A http servlet response object.
     * @param key      The key of Pixiv-Forward.
     * @param url      The url of image.
     * @return The data of the image.
     */
    @HttpApi
    byte[] getImageHttpApi(HttpServletResponse response,
                           String key,
                           String url);
}
