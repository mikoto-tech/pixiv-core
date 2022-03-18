package net.mikoto.pixiv.api.http.database.central;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.database.Central;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.DATABASE_CENTRAL_GET_USER_BY_USER_NAME;

/**
 * @author mikoto
 * @date 2022/3/12 4:14
 */
@HttpApiPath(DATABASE_CENTRAL_GET_USER_BY_USER_NAME)
@HttpApiParentNode(Central.class)
public interface GetUserByUserName {
    /**
     * Get user by userName.
     *
     * @param response A http servlet response object.
     * @param key      The key of Pixiv-Database
     * @param userName The userName of user.
     * @return Result.
     * @throws Exception exceptions.
     */
    @HttpApi
    JSONObject getUserByUserNameHttpApi(HttpServletResponse response,
                                        @RequestParam @HttpApiParameter("key") String key,
                                        @RequestParam @HttpApiParameter("userName") String userName) throws Exception;
}
