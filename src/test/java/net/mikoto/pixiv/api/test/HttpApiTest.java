package net.mikoto.pixiv.api.test;

import net.mikoto.pixiv.api.http.forward.artwork.GetInformation;
import net.mikoto.pixiv.api.util.HttpApiUtil;
import org.junit.jupiter.api.Test;

/**
 * @author mikoto
 * @date 2022/3/27 4:11
 */
public class HttpApiTest {
    @Test
    public void httpApiTest() {
        System.out.println(HttpApiUtil.getHttpApi(GetInformation.class, "123456", "qweasd"));
    }
}
