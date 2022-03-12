package net.mikoto.pixiv.api.http.central.web;

import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.central.Web;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.CENTRAL_WEB_PUBLIC_KEY;

/**
 * @author mikoto
 * @date 2022/3/12 4:09
 */
@HttpApiPath(CENTRAL_WEB_PUBLIC_KEY)
@HttpApiParentNode(Web.class)
public interface PublicKey {
    /**
     * Get public key.
     *
     * @param response A http servlet response object.
     * @return Public key.
     */
    @HttpApi
    String getPublicKeyHttpApi(HttpServletResponse response);
}
