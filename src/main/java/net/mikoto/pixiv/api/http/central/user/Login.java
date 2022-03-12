package net.mikoto.pixiv.api.http.central.user;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.central.User;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.CENTRAL_USER_LOGIN;

/**
 * @author mikoto
 * @date 2022/3/12 4:07
 */
@HttpApiPath(CENTRAL_USER_LOGIN)
@HttpApiParentNode(User.class)
public interface Login {
    /**
     * Login user
     *
     * @param response          A http servlet response object.
     * @param reCaptchaResponse Re captcha response code.
     * @param userName          The name of the user need to log.
     * @param userPassword      The password of the user need to log.
     * @return Result.
     */
    @HttpApi
    JSONObject loginHttpApi(HttpServletResponse response,
                            @RequestParam @HttpApiParameter("reCaptchaResponse") String reCaptchaResponse,
                            @RequestParam @HttpApiParameter("userName") String userName,
                            @RequestParam @HttpApiParameter("userPassword") String userPassword);
}
