package net.mikoto.pixiv.api.http.database.artwork;

import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApiPackage;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mikoto
 * @date 2022/5/28 4:03
 */
@HttpApiPackage("net.mikoto.pixiv.api.http.database")
public interface GetArtwork {
    String PARAM_ARTWORK_ID = "artworkId=";

    /**
     * Get artwork by artwork id.
     *
     * @param response  The http servlet response.
     * @param artworkId The artwork id.
     * @return The artwork object.
     */
    JSONObject getInformationHttpApi(HttpServletResponse response, int artworkId);
}
