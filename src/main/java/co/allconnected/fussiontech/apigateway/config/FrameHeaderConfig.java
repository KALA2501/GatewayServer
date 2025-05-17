package co.allconnected.fussiontech.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.WebFilter;

@Configuration
public class FrameHeaderConfig {

    @Bean
    public WebFilter allowIframe() {
        return (exchange, chain) -> {
            exchange.getResponse().getHeaders().remove("X-Frame-Options"); // 🧨 Fuerza su eliminación
            return chain.filter(exchange);
        };
    }
}
