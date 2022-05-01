package net.mikoto.pixiv.api.http.forward.series;

import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.forward.Series;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.FORWARD_SERIES_GET_INFORMATION;

/**
 * @author mikoto
 * @date 2022/5/1 14:11
 */
@HttpApiPath(FORWARD_SERIES_GET_INFORMATION)
@HttpApiParentNode(Series.class)
public interface GetInformation {
    /**
     * Get information
     *
     * @param response A http servlet response object.
     * @param key      The key of Pixiv-Forward.
     * @param seriesId The id of the series.
     * @return Result.
     * @throws Exception exceptions.
     */
    @HttpApi
    JSONObject getInformationHttpApi(HttpServletResponse response,
                                     @RequestParam @HttpApiParameter("key") String key,
                                     @RequestParam @HttpApiParameter("seriesId") int seriesId) throws Exception;
}