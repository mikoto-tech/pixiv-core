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

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mikoto
 * @date 2022/7/1 23:17
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ComponentScan("net.mikoto.pixiv")
@ForestScan("net.mikoto.pixiv")
@SpringBootApplication
@TestPropertySource("classpath:test.properties")
public class ConnectorTest {
    @Qualifier("directConnector")
    DirectConnector directConnector;
    public static final ForwardServer FORWARD_SERVER_1 =
            new ForwardServer(
                    "https://forward-1.mikoto-pixiv.cc",
                    1,
                    ""
            );
    public static final ForwardServer FORWARD_SERVER_2 =
            new ForwardServer("https://forward-2.mikoto-pixiv.cc",
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
        forwardConnector.addServer(FORWARD_SERVER_2);
    }

    @Test
    void directGetArtworkTest() throws ParseException {
        Artwork artwork = directConnector.getArtwork(91262365);
        assertEquals(91262365, artwork.getArtworkId());
        assertEquals("????????????", artwork.getArtworkTitle());
        assertEquals(3259336, artwork.getAuthorId());
        assertEquals("/c/48x48/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg", artwork.getIllustUrlMini());
        assertEquals("/img-original/img/2021/07/16/00/48/17/91262365_p0.jpg", artwork.getIllustUrlOriginal());
        assertEquals("/img-master/img/2021/07/16/00/48/17/91262365_p0_master1200.jpg", artwork.getIllustUrlRegular());
        assertEquals("/c/540x540_70/img-master/img/2021/07/16/00/48/17/91262365_p0_master1200.jpg", artwork.getIllustUrlSmall());
        assertEquals("/c/250x250_80_a2/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg", artwork.getIllustUrlThumb());
        assertEquals("????????????;??????;??????;?????????;?????????;??????;???????????????;??????;?????????;VOCALOID10000users??????", artwork.getTags());
    }

    @Test
    void forwardGetArtworkTest() {
        Artwork artwork = forwardConnector.getArtwork(91262365);
        assertEquals(91262365, artwork.getArtworkId());
        assertEquals("????????????", artwork.getArtworkTitle());
        assertEquals(3259336, artwork.getAuthorId());
        assertEquals("/c/48x48/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg", artwork.getIllustUrlMini());
        assertEquals("/img-original/img/2021/07/16/00/48/17/91262365_p0.jpg", artwork.getIllustUrlOriginal());
        assertEquals("/img-master/img/2021/07/16/00/48/17/91262365_p0_master1200.jpg", artwork.getIllustUrlRegular());
        assertEquals("/c/540x540_70/img-master/img/2021/07/16/00/48/17/91262365_p0_master1200.jpg", artwork.getIllustUrlSmall());
        assertEquals("/c/250x250_80_a2/custom-thumb/img/2021/07/16/00/48/17/91262365_p0_custom1200.jpg", artwork.getIllustUrlThumb());
        assertEquals("????????????;??????;??????;?????????;?????????;??????;???????????????;??????;?????????;VOCALOID10000users??????", artwork.getTags());
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
}
