package net.mikoto.pixiv.core.connector.impl;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.core.client.ForwardClient;
import net.mikoto.pixiv.core.connector.ForwardConnector;
import net.mikoto.pixiv.core.model.Artwork;
import net.mikoto.pixiv.core.model.server.ForwardServer;
import net.mikoto.pixiv.core.source.SmoothWeightedSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mikoto
 * @date 2022/7/3 1:53
 */
@Component("forwardConnector")
public class ForwardConnectorImpl extends SmoothWeightedSource<ForwardServer> implements ForwardConnector {
    /**
     * Constants
     */
    private static final String SUCCESS_KEY = "success";
    /**
     * Instances
     */
    private final ForwardClient forwardClient;

    @Autowired
    public ForwardConnectorImpl(ForwardClient forwardClient) {
        this.forwardClient = forwardClient;
    }

    /**
     * Get artwork at single server.
     *
     * @param address   The address of the server.
     * @param key       The key of the server.
     * @param artworkId The artwork id.
     * @return The artwork.
     */
    @Override
    public Artwork getArtworkSingleServer(String address, String key, int artworkId) {
        JSONObject artworkJson = JSON.parseObject(forwardClient.getArtwork(address, key, artworkId));
        if (artworkJson.getBooleanValue(SUCCESS_KEY)) {
            return artworkJson.getObject("body", Artwork.class);
        } else {
            return null;
        }
    }

    /**
     * Get image at single server.
     *
     * @param address The address of the server.
     * @param key     The key of the server.
     * @param url     The artwork id.
     * @return The artwork.
     */
    @Override
    public byte[] getImageSingleServer(String address, String key, String url) {
        return forwardClient.getImage(address, key, url);
    }
}
