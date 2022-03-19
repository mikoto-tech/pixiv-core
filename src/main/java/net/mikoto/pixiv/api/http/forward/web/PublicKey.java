package net.mikoto.pixiv.api.http.forward.web;

import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.forward.Web;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.FORWARD_WEB_PUBLIC_KEY;

/**
 * @author mikoto
 * @date 2022/3/19 17:14
 */
@HttpApiPath(FORWARD_WEB_PUBLIC_KEY)
@HttpApiParentNode(Web.class)
public interface PublicKey {
    /**
     * Get public key.
     *
     * @param response A http servlet response object.
     * @return Public key.
     * @throws Exception exceptions.
     */
    @HttpApi
    String publicKeyHttpApi(HttpServletResponse response) throws Exception;
}
