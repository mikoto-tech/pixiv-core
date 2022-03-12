package net.mikoto.pixiv.api.http.central.patcher;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.central.Patcher;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.CENTRAL_PATCHER_LOGIN;

/**
 * @author mikoto
 * @date 2022/3/12 3:22
 */
@HttpApiPath(CENTRAL_PATCHER_LOGIN)
@HttpApiParentNode(Patcher.class)
public interface Login {
    /**
     * Login http api.
     *
     * @param response A http servlet response object.
     * @param address  The address of patcher.
     * @param userKey  The key of the user.
     * @return Token and database address.
     */
    @HttpApi
    JSONObject loginHttpApi(HttpServletResponse response,
                            @RequestParam @HttpApiParameter("address") String address,
                            @RequestParam @HttpApiParameter("userKey") String userKey);
}
