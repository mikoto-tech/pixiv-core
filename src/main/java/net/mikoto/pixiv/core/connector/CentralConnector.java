package net.mikoto.pixiv.core.connector;

import java.util.List;

public interface CentralConnector extends Connector {
    /**
     * Check the token whether it have these scopes.
     *
     * @param token The token.
     * @param scope The scopes.
     * @return The scope which this token don't have.
     */
    default List<String> checkToken(String token, List<String> scope) {
        return checkToken(token, String.join(";", scope));
    }

    /**
     * Check the token whether it have these scopes.
     *
     * @param token The token.
     * @param scope The scopes.(Need to split by ;)
     * @return The scope which this token don't have.
     */
    List<String> checkToken(String token, String scope);
}
