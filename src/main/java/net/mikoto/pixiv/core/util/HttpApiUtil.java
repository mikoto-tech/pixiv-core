package net.mikoto.pixiv.core.util;

import net.mikoto.pixiv.core.annotation.HttpApiPackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;
import java.util.StringJoiner;

/**
 * @author mikoto
 * @date 2022/3/12 3:04
 */
public class HttpApiUtil {
    public static @Nullable String getHttpApi(Class<?> httpApi, String... params) {
        String httpApiPath = getHttpApiPath(httpApi);
        if (httpApiPath != null) {
            StringJoiner httpApiJoiner = new StringJoiner("&");
            if (params.length > 0) {
                for (String param :
                        params) {
                    httpApiJoiner.add(param);
                }
                return httpApiPath + "?" + httpApiJoiner;
            }
            return httpApiPath;
        } else {
            return null;
        }
    }

    public static @Nullable String getHttpApiPath(@NotNull Class<?> httpApi) {
        for (HttpApiPackage annotation :
                httpApi.getAnnotationsByType(HttpApiPackage.class)) {
            char[] httpApiNameChars = httpApi.getSimpleName().toCharArray();
            httpApiNameChars[0] += 32;
            return httpApi
                    .getPackageName()
                    .toLowerCase(Locale.ROOT)
                    .replace(
                            annotation.value().toLowerCase(Locale.ROOT),
                            ""
                    )
                    .replace(
                            ".",
                            "/"
                    ) + "/" + String.valueOf(httpApiNameChars);
        }
        return null;
    }
}
