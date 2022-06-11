package net.mikoto.pixiv.api.http.forward.author;

import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApiPackage;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mikoto
 * @date 2022/6/11 20:41
 */
@HttpApiPackage("net.mikoto.pixiv.api.http.forward")
public interface GetProfile {
    String PARAM_KEY = "key=";
    String PARAM_AUTHOR_ID = "authorId=";

    /**
     * Get profile
     *
     * @param response A http servlet response object.
     * @param key      The key of Pixiv-Forward.
     * @param authorId The id of the author.
     * @return Result.
     * @throws Exception exceptions.
     */
    JSONObject getProfileHttpApi(HttpServletResponse response,
                                 String key,
                                 int authorId) throws Exception;
}
