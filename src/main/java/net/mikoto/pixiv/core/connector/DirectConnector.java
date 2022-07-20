package net.mikoto.pixiv.core.connector;

import net.mikoto.pixiv.core.model.Artwork;

import java.text.ParseException;

/**
 * @author mikoto
 * @date 2022/6/25 1:19
 */
public interface DirectConnector extends ArtworkConnector {
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

    /**
     * Override the Connector interface's getArtworkById() method in order to get artwork by artwork id.
     * <b>Warning! There will throw RuntimeException instead normal exception!!! It's not safe!!!</b>
     * <b>So use this method as less as you can.</b>
     *
     * @param artworkId The artwork id.
     * @return An artwork object.
     */
    @Override
    default Artwork getArtworkById(int artworkId) {
        try {
            return getArtwork(artworkId);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
