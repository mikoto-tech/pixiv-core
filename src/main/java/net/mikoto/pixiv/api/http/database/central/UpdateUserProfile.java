package net.mikoto.pixiv.api.http.database.central;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.database.Central;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.DATABASE_CENTRAL_UPDATE_USER_PROFILE;

/**
 * @author mikoto
 * @date 2022/3/12 4:15
 */
@HttpApiPath(DATABASE_CENTRAL_UPDATE_USER_PROFILE)
@HttpApiParentNode(Central.class)
public interface UpdateUserProfile {
    /**
     * Update user's name.
     *
     * @param response    A http servlet response object.
     * @param key         The key of Pixiv-Database
     * @param userId      The user if of user
     * @param newUserName The userName of user.
     * @return Result.
     */
    @HttpApi
    JSONObject updateUserNameHttpApi(HttpServletResponse response,
                                     @RequestParam @HttpApiParameter("key") String key,
                                     @RequestParam @HttpApiParameter("userId") String userId,
                                     @RequestParam @HttpApiParameter("newUserName") String newUserName);
}
