package net.mikoto.pixiv.core.connector.impl;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.core.client.DatabaseClient;
import net.mikoto.pixiv.core.connector.DatabaseConnector;
import net.mikoto.pixiv.core.model.Artwork;
import net.mikoto.pixiv.core.model.Grade;
import net.mikoto.pixiv.core.model.server.DatabaseServer;
import net.mikoto.pixiv.core.source.StaticSource;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @author mikoto
 * @date 2022/7/3 1:53
 */
@Component("databaseConnector")
public class DatabaseConnectorImpl extends StaticSource<DatabaseServer> implements DatabaseConnector {
    /**
     * Constants
     */
    private static final String SUCCESS_KEY = "success";

    /**
     * Instances
     */
    private final DatabaseClient databaseClient;

    @Autowired
    public DatabaseConnectorImpl(DatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    /**
     * Get an artwork from database.
     * Each page can provide 12 artworks.
     *
     * @param credential The credential you need to search.
     * @param order      The order of the artworks.
     * @param properties The properties in Artwork.class
     * @param pageCount  The page of the artworks.
     * @return The artwork objects list.
     */
    @Override
    public List<Artwork> getArtworks(String credential, Sort.Direction order, String properties, int pageCount, @NotNull Grade grade) {
        JSONObject artworksJson = JSON.parseObject(databaseClient.getArtworks(getServer().getAddress(), credential, order, properties, pageCount, grade.getGrading()));

        if (artworksJson.getBooleanValue(SUCCESS_KEY)) {
            return artworksJson.getJSONArray("body").toList(Artwork.class);
        } else {
            return null;
        }
    }

    /**
     * Get an artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork object.
     */
    @Override
    public Artwork getArtwork(int artworkId) {
        JSONObject artworkJson = JSON.parseObject(databaseClient.getArtwork(getServer().getAddress(), artworkId));
        return artworkJson.getObject("body", Artwork.class);
    }

    /**
     * Insert artworks.
     *
     * @param token    The token of you.
     * @param artworks The set of artworks.
     */
    @Override
    public void insertArtworks(String token, Set<Artwork> artworks) {
        databaseClient.insertArtworks(getServer().getAddress(), token, JSONArray.of(artworks).toJSONString());
    }
}
