package net.mikoto.pixiv.api.http.forward.artwork;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.forward.Artwork;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.FORWARD_ARTWORK_GET_INFORMATION;

/**
 * @author mikoto
 * @date 2022/3/12 21:23
 */
@HttpApiPath(FORWARD_ARTWORK_GET_INFORMATION)
@HttpApiParentNode(Artwork.class)
public interface GetInformation {
    /**
     * Get information
     *
     * @param response  A http servlet response object.
     * @param key       The key of Pixiv-Forward.
     * @param artworkId The id of the artwork.
     * @return Result.
     */
    @HttpApi
    JSONObject getInformationHttpApi(HttpServletResponse response,
                                     @RequestParam @HttpApiParameter("key") String key,
                                     @RequestParam @HttpApiParameter("artworkId") String artworkId);
}
