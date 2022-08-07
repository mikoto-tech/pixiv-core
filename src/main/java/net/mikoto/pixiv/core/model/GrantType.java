package net.mikoto.pixiv.core.model;

public enum GrantType {
    GetAuthorizationCode("code"),
    GetTokenByAuthorizationCode("authorization_code"),
    GetTokenDirectly("token"),
    RefreshToken("refresh_token"),
    GetTokenByPassword("password"),
    GetClientToken("client_credentials");
    private final String type;

    GrantType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
