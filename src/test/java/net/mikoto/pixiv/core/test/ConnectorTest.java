package net.mikoto.pixiv.core.test;

import com.dtflys.forest.springboot.annotation.ForestScan;
import net.mikoto.pixiv.core.connector.DirectConnector;
import net.mikoto.pixiv.core.connector.ForwardConnector;
import net.mikoto.pixiv.core.model.Artwork;
import net.mikoto.pixiv.core.model.server.ForwardServer;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author mikoto
 * @date 2022/7/1 23:17
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ComponentScan("net.mikoto.pixiv")
@ForestScan("net.mikoto.pixiv")
@TestPropertySource("classpath:test.properties")
@SpringBootApplication
public class ConnectorTest {
    @Qualifier("directConnector")
    DirectConnector directConnector;
    public static final ForwardServer FORWARD_SERVER_1 =
            new ForwardServer(
                    "https://forward-1.mikoto-pixiv.cc",
                    1,
                    ""
            );
    public static final ForwardServer FORWARD_SERVER_3 =
            new ForwardServer("https://forward-3.mikoto-pixiv.cc",
                    1,
                    ""
            );
    @Qualifier("forwardConnector")
    ForwardConnector forwardConnector;

    @Autowired
    public ConnectorTest(DirectConnector directConnector, @NotNull ForwardConnector forwardConnector) {
        this.directConnector = directConnector;
        this.forwardConnector = forwardConnector;

        forwardConnector.addServer(FORWARD_SERVER_1);
        forwardConnector.addServer(FORWARD_SERVER_3);
    }

    @Test
    void directGetArtworkTest() throws ParseException {
        Artwork artwork = directConnector.getArtwork(91262365);
        assertEquals(91262365, artwork.getArtworkId());
        assertEquals("初音ミク", artwork.getArtworkTitle());
        assertEquals(3259336, artwork.getAuthorId());
        assertEquals("/c/48x48/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg", artwork.getIllustUrlMini());
        assertEquals("/img-original/img/2021/07/16/00/48/17/91262365_p0.jpg", artwork.getIllustUrlOriginal());
        assertEquals("/img-master/img/2021/07/16/00/48/17/91262365_p0_master1200.jpg", artwork.getIllustUrlRegular());
        assertEquals("/c/540x540_70/img-master/img/2021/07/16/00/48/17/91262365_p0_master1200.jpg", artwork.getIllustUrlSmall());
        assertEquals("/c/250x250_80_a2/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg", artwork.getIllustUrlThumb());
        assertEquals("初音ミク;足裏;足指;女の子;つま先;裸足;ギリシャ型;美脚;縞パン;VOCALOID10000users入り", artwork.getTags());
    }

    @Test
    void directGetNullArtworkTest() throws ParseException {
        Artwork artwork = directConnector.getArtwork(1);
        assertNull(artwork);
    }

    @Test
    void forwardGetArtworkTest() {
        Artwork artwork = forwardConnector.getArtwork(91262365);
        assertEquals(91262365, artwork.getArtworkId());
        assertEquals("初音ミク", artwork.getArtworkTitle());
        assertEquals(3259336, artwork.getAuthorId());
        assertEquals("/c/48x48/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg", artwork.getIllustUrlMini());
        assertEquals("/img-original/img/2021/07/16/00/48/17/91262365_p0.jpg", artwork.getIllustUrlOriginal());
        assertEquals("/img-master/img/2021/07/16/00/48/17/91262365_p0_master1200.jpg", artwork.getIllustUrlRegular());
        assertEquals("/c/540x540_70/img-master/img/2021/07/16/00/48/17/91262365_p0_master1200.jpg", artwork.getIllustUrlSmall());
        assertEquals("/c/250x250_80_a2/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg", artwork.getIllustUrlThumb());
        assertEquals("初音ミク;足裏;足指;女の子;つま先;裸足;ギリシャ型;美脚;縞パン;VOCALOID10000users入り", artwork.getTags());
    }

    @Test
    void imageTest() {
        byte[] directImage = directConnector.getImage("/c/48x48/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg");
        byte[] forwardImage = forwardConnector.getImage("/c/48x48/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg");

        assertEquals(directImage[0], forwardImage[0]);
        assertEquals(directImage[1], forwardImage[1]);
        assertEquals(directImage[2], forwardImage[2]);
        assertEquals(directImage[3], forwardImage[3]);
        assertEquals(directImage[4], forwardImage[4]);
    }

    @Test
    void cookieTest() {
        String cookie = "first_visit_datetime_pc=2022-08-17+17%3A12%3A06; PHPSESSID=51815650_ZM54D2MitDMtpK10Wj5RbKf6PyzhQ8ZS; p_ab_id=6; p_ab_id_2=1; p_ab_d_id=191772842; yuid_b=NiZGkJQ; __cf_bm=hnlwKj75ha.GGvsz4Uzfjz4X7.KUH5ra841NXQ7LNQc-1660723931-0-AeL1g+PihObcGQL9qDEu8C1A5/R1/Lp9FFhBxznePf9L+w/qJA/3IhevlBXXrqFjYDJXJGA0+VRdBA/GHG4MFkmq0KhWl3Vo9gH+qXhU6oaMdbaiKo/4O4ytPlW9Ew5B+dCw/+KmDM9ZOwH9Z8Rv1iIZvas9ugxI4lxF9OQ0dLbZ4gnOD4/6YvyHngecy+EJ0Q==; _ga_75BBYNYN9J=GS1.1.1660720445.9.1.1660724233.0.0.0; __utmb=235335808.2.10.1660723993; __utmc=235335808; __utmz=235335808.1660723993.1.1.utmcsr=accounts.pixiv.net|utmccn=(referral)|utmcmd=referral|utmcct=/; _gcl_au=1.1.1419828633.1660723929; _ga=GA1.1.1649584235.1660723929; _gid=GA1.2.369717591.1660720670; device_token=4c9f2a186409ee172bc649fac9dfe8ac; c_type=90; privacy_policy_agreement=0; privacy_policy_notification=0; a_type=0; b_type=0; QSI_S_ZN_5hF4My7Ad6VNNAi=v:0:0; _fbp=fb.1.1660723939774.1945621127; _im_vid=01GANDRVFR7Z9DHQJ08VJPP5YH; _im_uid.3929=b.23789ebcd1b636fe; cto_bundle=DlN15V9vR1pRZmo0b28ySFpwV2R1Uk9kdTZHbzNrNzZGZFNXVjQxekFEWVhoWm5BVjh4NXNrZDI3NFdtOWYxQnZiQXhJM3BCb0dHems1czltJTJCOHlVUFkzRTJNaTRtUFNmaG1saXA0TWtUREhSd1FxUndmdUQ2bXV4ZlJpb2tDaWd2QXZ6cHU1VyUyRmVSQ2dTU1BJRm0lMkJRJTJCckszdyUzRCUzRA; __utma=235335808.1649584235.1660723929.1660723993.1660723993.1; __utmv=235335808.|3=plan=normal=1^6=user_id=51815650=1^11=lang=zh=1";
        boolean result = directConnector.checkCookie(cookie);
        assertTrue(result);
    }
}
