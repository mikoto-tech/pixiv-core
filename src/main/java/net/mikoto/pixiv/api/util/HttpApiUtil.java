package net.mikoto.pixiv.api.util;

import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mikoto
 * @date 2022/3/12 3:04
 */
public class HttpApiUtil {
    public static @NotNull String getHttpApi(@NotNull Class<?> path, String... values) throws NoSuchMethodException {
        Method api = null;
        for (Method method :
                path.getMethods()) {
            for (Annotation annotation :
                    method.getAnnotations()) {
                if (annotation instanceof HttpApi) {
                    api = method;
                    break;
                }
            }
        }
        StringBuilder url = new StringBuilder(getHttpApiPath(path));
        if (values.length > 0) {
            url.append("?");

            int parameterCount = 0;
            for (int i = 0; i < api.getParameters().length; i++) {
                for (Annotation annotation :
                        api.getParameters()[i].getAnnotations()) {
                    if (annotation instanceof HttpApiParameter) {
                        url
                                .append(((HttpApiParameter) annotation).value())
                                .append("=")
                                .append(values[parameterCount]);
                        parameterCount += 1;
                    }
                }
                if (i != api.getParameters().length - 1) {
                    url.append("&");
                }
            }
        }
        return url.toString();
    }

    public static @NotNull String getHttpApiPath(Class<?> path) {
        StringBuilder url = new StringBuilder();

        // Traverse the parent node from the incoming node
        Class<?> parentNode = path;
        ArrayList<String> pathArrayList = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (Annotation annotation :
                    parentNode.getAnnotations()) {
                if (annotation instanceof HttpApiPath) {
                    pathArrayList.add(((HttpApiPath) annotation).value());
                } else if (annotation instanceof HttpApiParentNode) {
                    parentNode = ((HttpApiParentNode) annotation).value();
                    flag = true;
                }
            }
        }
        // ArrayList in reverse order and output
        Collections.reverse(pathArrayList);
        for (String pathString :
                pathArrayList) {
            url.append(pathString);
        }
        return url.toString();
    }
}
