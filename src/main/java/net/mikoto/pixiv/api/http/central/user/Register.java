package net.mikoto.pixiv.api.http.central.user;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.central.User;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.CENTRAL_USER_REGISTER;

/**
 * @author mikoto
 * @date 2022/3/12 4:01
 */
@HttpApiPath(CENTRAL_USER_REGISTER)
@HttpApiParentNode(User.class)
public interface Register {
    /**
     * Register user
     *
     * @param response          A http servlet response object.
     * @param reCaptchaResponse Re captcha response code.
     * @param userName          The name of the user need to register.
     * @param userPassword      The password of the user need to register.
     * @return Result.
     */
    @HttpApi
    JSONObject registerHttpApi(HttpServletResponse response,
                               @RequestParam @HttpApiParameter("reCaptchaResponse") String reCaptchaResponse,
                               @RequestParam @HttpApiParameter("userName") String userName,
                               @RequestParam @HttpApiParameter("userPassword") String userPassword);
}
