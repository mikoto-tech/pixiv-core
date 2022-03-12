package net.mikoto.pixiv.api.http.database.central;

import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.database.Central;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.DATABASE_CENTRAL_INSERT_USER;

/**
 * @author mikoto
 * @date 2022/3/12 4:13
 */
@HttpApiPath(DATABASE_CENTRAL_INSERT_USER)
@HttpApiParentNode(Central.class)
public interface InsertUser {
    /**
     * Insert a user object.
     *
     * @param response     A http servlet response object.
     * @param key          The key of Pixiv-Database.
     * @param userName     The name of user.
     * @param userPassword The password of user.
     * @param userSalt     The password salt of user.
     * @param userKey      The key of user.
     * @param profileUrl   The profile url of user.
     * @param createTime   The user object create time.
     * @param updateTime   The user object update time.
     */
    @HttpApi
    void insertUserHttpApi(HttpServletResponse response,
                           @RequestParam @HttpApiParameter("key") String key,
                           @RequestParam @HttpApiParameter("userName") String userName,
                           @RequestParam @HttpApiParameter("userPassword") String userPassword,
                           @RequestParam @HttpApiParameter("userSalt") String userSalt,
                           @RequestParam @HttpApiParameter("userKey") String userKey,
                           @RequestParam @HttpApiParameter("profileUrl") String profileUrl,
                           @RequestParam @HttpApiParameter("createTime") String createTime,
                           @RequestParam @HttpApiParameter("updateTime") String updateTime);
}
