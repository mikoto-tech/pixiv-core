package net.mikoto.pixiv.core.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author mikoto
 * {@code @time} 2022/9/25
 * Create for pixiv-core
 */
@Configuration
@ConfigurationProperties(prefix = "mikoto.pixiv.central")
public class CentralConfig {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
