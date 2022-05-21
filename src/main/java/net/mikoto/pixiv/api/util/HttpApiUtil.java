package net.mikoto.pixiv.api.util;

import net.mikoto.pixiv.api.annotation.HttpApiPackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;

/**
 * @author mikoto
 * @date 2022/3/12 3:04
 */
public class HttpApiUtil {
    public static @Nullable String getHttpApi(Class<?> httpApi, String... params) {
        String httpApiPath = getHttpApiPath(httpApi);
        if (httpApiPath != null) {
            StringBuilder httpApiBuilder = new StringBuilder();
            if (params.length > 0) {
                httpApiBuilder.append("?");
                for (String param :
                        params) {
                    httpApiBuilder.append(param);
                }
            }
            return httpApiBuilder.toString();
        } else {
            return null;
        }
    }

    public static @Nullable String getHttpApiPath(@NotNull Class<?> httpApi) {
        for (HttpApiPackage annotation :
                httpApi.getAnnotationsByType(HttpApiPackage.class)) {
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
                    );
        }
        return null;
    }
}
