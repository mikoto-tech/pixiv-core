package net.mikoto.pixiv.core.test;

import net.mikoto.pixiv.core.http.forward.artwork.GetInformation;
import net.mikoto.pixiv.core.util.HttpApiUtil;
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
