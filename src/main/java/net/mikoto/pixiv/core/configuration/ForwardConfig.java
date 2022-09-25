package net.mikoto.pixiv.core.configuration;

import net.mikoto.pixiv.core.model.server.ForwardServer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author mikoto
 * {@code @time} 2022/9/25
 * Create for pixiv-core
 */
@Configuration
@ConfigurationProperties(prefix = "mikoto.pixiv.forward")
public class ForwardConfig {
    private ForwardServer[] servers;

    public ForwardServer[] getForwardServers() {
        return servers;
    }

    public void setForwardServers(ForwardServer[] servers) {
        this.servers = servers;
    }
}
