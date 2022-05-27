package net.mikoto.pixiv.api.http.database.artwork;

import net.mikoto.pixiv.api.annotation.HttpApiPackage;

/**
 * @author mikoto
 * @date 2022/5/28 4:03
 */
@HttpApiPackage("net.mikoto.pixiv.api.http.database")
public interface InsertArtworks {
    /**
     * Insert artworks.
     *
     * @param data The data.
     */
    void insertArtworks(String data);
}
