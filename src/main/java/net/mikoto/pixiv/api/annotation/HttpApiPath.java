package net.mikoto.pixiv.api.annotation;

import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mikoto
 * @date 2022/3/12 3:11
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpApiPath {
    String value();

    RequestMethod method() default RequestMethod.GET;
}
