package net.mikoto.pixiv.api.test;

import net.mikoto.pixiv.api.http.forward.artwork.GetInformation;
import org.junit.jupiter.api.Test;

import static net.mikoto.pixiv.api.util.HttpApiUtil.getHttpApi;

/**
 * @author mikoto
 * @date 2022/3/27 4:11
 */
public class HttpApiTest {
    @Test
    public void httpApiTest() throws NoSuchMethodException {
        System.out.println(getHttpApi(
                GetInformation.class,
                "a",
                "1"));
    }
}
