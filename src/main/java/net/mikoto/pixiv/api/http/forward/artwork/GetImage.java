package net.mikoto.pixiv.api.http.forward.artwork;

import net.mikoto.pixiv.api.annotation.HttpApiPackage;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mikoto
 * @date 2022/3/12 21:19
 */
@HttpApiPackage("net.mikoto.pixiv.api.http.forward")
public interface GetImage {
    String PARAM_KEY = "key=";
    String PARAM_URL = "url=";

    /**
     * Get image.
     *
     * @param response A http servlet response object.
     * @param key      The key of Pixiv-Forward.
     * @param url      The url of image.
     * @return The data of the image.
     * @throws Exception exceptions.
     */
    byte[] getImageHttpApi(HttpServletResponse response,
                           String key,
                           String url) throws Exception;
}
