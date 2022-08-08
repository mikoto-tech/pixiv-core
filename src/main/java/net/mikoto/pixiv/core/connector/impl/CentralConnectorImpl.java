package net.mikoto.pixiv.core.connector.impl;

import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.core.client.CentralClient;
import net.mikoto.pixiv.core.connector.CentralConnector;
import net.mikoto.pixiv.core.model.server.HttpServer;
import net.mikoto.pixiv.core.source.StaticSource;

import java.util.List;

public class CentralConnectorImpl extends StaticSource<HttpServer> implements CentralConnector {
    /**
     * Instances.
     */
    private final CentralClient centralClient;

    public CentralConnectorImpl(CentralClient centralClient) {
        this.centralClient = centralClient;
    }

    /**
     * Check the token whether it have these scopes.
     *
     * @param token The token.
     * @param scope The scopes.(Need to split by ;)
     * @return The scope which this token don't have.
     */
    @Override
    public List<String> checkToken(String token, String scope) {
        JSONObject checkTokenResult = JSONObject.parseObject(
                centralClient.checkToken(getServer().getAddress(), token, scope)
        );
        return checkTokenResult.getList("failedScope", String.class);
    }
}
