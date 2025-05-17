package co.allconnected.fussiontech.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        return http
            .csrf(ServerHttpSecurity.CsrfSpec::disable)
            .headers(headers -> headers.frameOptions(ServerHttpSecurity.HeaderSpec.FrameOptionsSpec::disable)) // ✅ Aquí quitamos X-Frame-Options
            .authorizeExchange(exchange -> exchange
                .pathMatchers(
                    "/api/juegos/games/**",
                    "/api/juegos/send-metrics/**",
                    "/actuator/**",
                    "/eureka/**"
                ).permitAll()
                .anyExchange().authenticated()
            )
            .build();
    }
}
