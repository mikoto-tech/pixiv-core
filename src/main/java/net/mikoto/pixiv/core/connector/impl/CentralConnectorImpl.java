package net.mikoto.pixiv.core.connector.impl;

import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.core.client.CentralClient;
import net.mikoto.pixiv.core.configuration.CentralConfig;
import net.mikoto.pixiv.core.connector.CentralConnector;
import net.mikoto.pixiv.core.model.server.HttpServer;
import net.mikoto.pixiv.core.source.StaticSource;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("centralConnector")
public class CentralConnectorImpl extends StaticSource<HttpServer> implements CentralConnector {
    /**
     * Instances.
     */
    private final CentralClient centralClient;

    @Autowired
    public CentralConnectorImpl(CentralClient centralClient, @NotNull CentralConfig centralConfig) {
        this.centralClient = centralClient;

        this.addServer(new HttpServer(centralConfig.getAddress()));
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
