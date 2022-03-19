package net.mikoto.pixiv.api.http.database.central;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.database.Central;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.DATABASE_CENTRAL_GET_USER_BY_USER_ID;

/**
 * @author mikoto
 * @date 2022/3/19 1:01
 */
@HttpApiPath(DATABASE_CENTRAL_GET_USER_BY_USER_ID)
@HttpApiParentNode(Central.class)
public interface GetUserByUserId {
    /**
     * Get user by userId
     *
     * @param response A http servlet response object.
     * @param key      The key of Pixiv-Database
     * @param userId   The userId of the user.
     * @return Result.
     * @throws Exception exceptions.
     */
    @HttpApi
    JSONObject getUserByUserIdHttpApi(HttpServletResponse response,
                                      @RequestParam @HttpApiParameter("key") String key,
                                      @RequestParam @HttpApiParameter("id") String userId) throws Exception;
}