package net.mikoto.pixiv.api.http;

/**
 * @author mikoto
 * @date 2022/3/12 22:43
 */
public class HttpApi {
    public static final String CENTRAL_PATCHER = "/patcher";
    public static final String CENTRAL_PATCHER_LOGIN = "/login";

    public static final String CENTRAL_USER = "/user";
    public static final String CENTRAL_USER_LOGIN = "/login";
    public static final String CENTRAL_USER_REGISTER = "/register";

    public static final String CENTRAL_WEB = "/web";
    public static final String CENTRAL_WEB_PUBLIC_KEY = "/publicKey";


    public static final String DATABASE_CENTRAL = "/central";
    public static final String DATABASE_CENTRAL_INSERT_USER = "/insertUser";
    public static final String DATABASE_CENTRAL_GET_USER_BY_USER_NAME = "/getUserByUserName";
    public static final String DATABASE_CENTRAL_UPDATE_USER_KEY = "/updateUserKey";
    public static final String DATABASE_CENTRAL_UPDATE_USER_NAME = "/updateUserName";
    public static final String DATABASE_CENTRAL_UPDATE_USER_PASSWORD = "/updateUserPassword";
    public static final String DATABASE_CENTRAL_UPDATE_USER_PROFILE = "/updateUserProfile";

    public static final String DATABASE_PATCHER = "/patcher";
    public static final String DATABASE_PATCHER_INSERT_PIXIV_DATA = "/insertPixivData";

    public static final String DATABASE_DATABASE = "/database";


    public static final String FORWARD_ARTWORK = "/artwork";
    public static final String FORWARD_ARTWORK_GET_IMAGE = "/getImage";
    public static final String FORWARD_ARTWORK_GET_INFORMATION = "/getInformation";
}
