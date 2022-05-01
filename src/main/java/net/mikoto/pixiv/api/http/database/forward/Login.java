package net.mikoto.pixiv.api.http.database.forward;

import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.database.Forward;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.DATABASE_FORWARD_LOGIN;

/**
 * @author mikoto
 * @date 2022/3/19 15:30
 */
@HttpApiPath(DATABASE_FORWARD_LOGIN)
@HttpApiParentNode(Forward.class)
public interface Login {
    /**
     * Login a Pixiv-Forward
     *
     * @param response  A http servlet response object.
     * @param accessKey An access key.
     * @param address   The address of the Pixiv-Forward
     * @return Result.
     * @throws Exception exceptions.
     */
    JSONObject loginHttpApi(HttpServletResponse response,
                            @HttpApiParameter("accessKey") String accessKey,
                            @HttpApiParameter("address") String address) throws Exception;
}
