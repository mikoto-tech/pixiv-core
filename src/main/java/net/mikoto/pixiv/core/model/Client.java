package net.mikoto.pixiv.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * @author mikoto
 * Create for pixiv-core
 * Create at 2022/7/30
 * <p>
 * Sql:
 * <p>
 * create table pixiv.client
 * (
 *     pk_client_id   int           not null
 *         primary key,
 *     client_secret  varchar(64)   not null,
 *     allow_url      varchar(1000) not null,
 *     contract_scope varchar(1000) not null,
 *     constraint client_pk_client_id_uindex
 *         unique (pk_client_id)
 * );
 */
@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column(name = "pk_client_id", nullable = false, unique = true)
    private ClientId clientId;
    private String clientSecret;
    private String allowUrl;
    private String contractScope;

    public ClientId getClientId() {
        return clientId;
    }

    public void setClientId(ClientId clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getAllowUrl() {
        return allowUrl;
    }

    public void setAllowUrl(String allowUrl) {
        this.allowUrl = allowUrl;
    }

    public String getContractScope() {
        return contractScope;
    }

    public void setContractScope(String contractScope) {
        this.contractScope = contractScope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Client client = (Client) o;
        return clientId == client.clientId && clientSecret.equals(client.clientSecret) && allowUrl.equals(client.allowUrl) && contractScope.equals(client.contractScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientSecret, allowUrl, contractScope);
    }

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nClient{" +
                "clientId=" + clientId +
                ", clientSecret='" + clientSecret + '\'' +
                ", allowUrl='" + allowUrl + '\'' +
                ", contractScope='" + contractScope + '\'' +
                '}';
    }
}
