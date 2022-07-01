package net.mikoto.pixiv.core.connector;

import net.mikoto.pixiv.core.model.Artwork;

import java.text.ParseException;

/**
 * @author mikoto
 * @date 2022/6/25 1:19
 */
public interface DirectConnector {
    /**
     * Get the artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork.
     * @throws ParseException Throw this exception when time cannot parse.
     */
    Artwork getArtwork(int artworkId) throws ParseException;

    /**
     * Get the image of this url.
     *
     * @param url The url.
     * @return The image.
     */
    byte[] getImage(String url);
}
