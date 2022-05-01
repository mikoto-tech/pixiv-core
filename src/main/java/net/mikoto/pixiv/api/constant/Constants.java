package net.mikoto.pixiv.api.constant;

import java.text.SimpleDateFormat;

/**
 * @author mikoto
 * @date 2022/4/23 2:20
 */
public class Constants {
    /**
     * Mikoto pixiv usual date format.
     * <p>
     * e.g.
     * 2020-03-05T01:23:36+00:00
     * 2021-07-15T15:48:17+00:00
     */
    public static final SimpleDateFormat USUAL_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
}
