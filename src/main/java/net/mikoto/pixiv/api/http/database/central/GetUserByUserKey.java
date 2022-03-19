package net.mikoto.pixiv.api.http.database.central;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.database.Central;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.DATABASE_CENTRAL_GET_USER_BY_USER_KEY;

/**
 * @author mikoto
 * @date 2022/3/19 1:02
 */
@HttpApiPath(DATABASE_CENTRAL_GET_USER_BY_USER_KEY)
@HttpApiParentNode(Central.class)
public interface GetUserByUserKey {
    /**
     * Get user by userKey.
     *
     * @param response A http servlet response object.
     * @param key      The key of Pixiv-Database
     * @param userKey  The userKey of the user.
     * @return Result.
     * @throws Exception exceptions.
     */
    JSONObject getUserByUserKeyHttpApi(HttpServletResponse response,
                                       @RequestParam @HttpApiParameter("key") String key,
                                       @RequestParam @HttpApiParameter("userKey") String userKey) throws Exception;
}
