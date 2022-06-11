package net.mikoto.pixiv.api.http;

/**
 * @author mikoto
 * @date 2022/3/12 22:43
 */
public class HttpApi {
    public static final String FORWARD_ARTWORK = "/artwork";
    public static final String FORWARD_ARTWORK_GET_IMAGE = "/getImage";
    public static final String FORWARD_ARTWORK_GET_INFORMATION = "/getInformation";

    public static final String FORWARD_SERIES = "/series";
    public static final String FORWARD_SERIES_GET_INFORMATION = "/getInformation";

    public static final String FORWARD_AUTHOR = "/author";
    public static final String FORWARD_AUTHOR_GET_INFORMATION = "/getInformation";
    public static final String FORWARD_AUTHOR_GET_PROFILE = "/getProfile";


    public static final String DATABASE_ARTWORK = "/artwork";
    public static final String DATABASE_ARTWORK_INSERT_ARTWORKS = "/insertArtworks";
    public static final String DATABASE_ARTWORK_GET_ARTWORK = "/getArtwork";
    public static final String DATABASE_ARTWORK_GET_ARTWORKS = "/getArtworks";
}
