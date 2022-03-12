package net.mikoto.pixiv.api.http.database;

import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiPath;

import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.DATABASE_DATABASE;

/**
 * @author mikoto
 * @date 2022/3/12 11:33
 */
@HttpApiPath(DATABASE_DATABASE)
public interface Database {
    /**
     * Confirm database.
     *
     * @param response A http servlet response object.
     * @return Is ok.
     */
    @HttpApi
    String databaseHttpApi(HttpServletResponse response);
}
