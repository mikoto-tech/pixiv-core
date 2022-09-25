package net.mikoto.pixiv.core.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author mikoto
 * {@code @time} 2022/9/25
 * Create for pixiv-core
 */
@Configuration
@ConfigurationProperties(prefix = "mikoto.pixiv.database")
public class DatabaseConfig {
    private String address;
    private String token;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
