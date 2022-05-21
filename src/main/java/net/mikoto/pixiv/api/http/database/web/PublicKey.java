package net.mikoto.pixiv.api.http.database.web;

import net.mikoto.pixiv.api.annotation.HttpApiPackage;

/**
 * @author mikoto
 * @date 2022/5/21 16:19
 */
@HttpApiPackage("net.mikoto.pixiv.api.http.database")
public interface PublicKey {
    /**
     * Get the public key.
     *
     * @return The public key.
     */
    String publicKeyHttpApi();
}
