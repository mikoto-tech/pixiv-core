package net.mikoto.pixiv.core.test;

import net.mikoto.pixiv.core.connector.DirectConnector;
import net.mikoto.pixiv.core.model.Artwork;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mikoto
 * @date 2022/7/1 23:17
 */
@SpringBootTest
@SpringBootApplication
public class DirectConnectorTest {
    @Autowired
    DirectConnector directConnector;

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
}
