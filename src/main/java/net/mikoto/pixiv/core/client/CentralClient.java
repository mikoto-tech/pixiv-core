package net.mikoto.pixiv.core.client;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Var;
import net.mikoto.pixiv.core.model.Client;
import net.mikoto.pixiv.core.model.GrantType;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component
public interface CentralClient {
    @Get(
            url = "{address}/oauth2/token" +
                    "?grant_type=${grantType.getType()}" +
                    "&client_id=${client.getClientId()}" +
                    "&client_secret=${client.getClientSecret()}" +
                    "&code={code}" +
                    "&state=LoveYouForever_Lin."
    )
    String getToken(
            @NotNull @Var("address") String address,
            @NotNull @Var("grantType") GrantType grantType,
            @NotNull @Var("client") Client client,
            @NotNull @Var("code") String code
    );

    @Get(
            url = "{address}/oauth2/refresh" +
                    "?grant_type=${grantType.getType()}" +
                    "&client_id=${client.getClientId()}" +
                    "&client_secret=${client.getClientSecret()}" +
                    "&refresh_token={refreshToken}"
    )
    String refreshToken(
            @Var("address") String address,
            @Var("grantType") GrantType grantType,
            @Var("client") Client client,
            @Var("refreshToken") String refreshToken
    );

    @Get(
            url = "{address}/oauth2/revoke" +
                    "&client_id=${client.getClientId()}" +
                    "&client_secret=${client.getClientSecret()}" +
                    "&refresh_token={refreshToken}"
    )
    String revokeToken(
            @Var("address") String address,
            @Var("client") Client client,
            @Var("refreshToken") String refreshToken
    );

    @Get(
            url = "{address}/oauth2/check" +
                    "&token={token}" +
                    "&scope={scope}"
    )
    String checkToken(
            @Var("address") String address,
            @NotNull @Var("token") String token,
            @NotNull @Var("scope") String scope
    );
}
