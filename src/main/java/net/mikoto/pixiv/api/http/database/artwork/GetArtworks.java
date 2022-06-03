package net.mikoto.pixiv.api.http.database.artwork;

import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApiPackage;
import org.springframework.data.domain.Sort;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mikoto
 * @date 2022/5/28 4:03
 */
@HttpApiPackage("net.mikoto.pixiv.api.http.database")
public interface GetArtworks {
    String PARAM_CREDENTIAL = "credential=";
    String PARAM_ORDER = "order=";
    String PARAM_PROPERTIES = "properties=";
    String PARAM_PAGE_COUNT = "pageCount=";

    /**
     * Get artworks.
     *
     * @param response   The http servlet response.
     * @param credential The credential.
     * @param order      The order.
     * @param properties The properties.
     * @param pageCount  The pageCount.
     * @return The artworks.
     */
    JSONObject getArtworksHttpApi(HttpServletResponse response, String credential, Sort.Direction order, String properties, int pageCount);
}
