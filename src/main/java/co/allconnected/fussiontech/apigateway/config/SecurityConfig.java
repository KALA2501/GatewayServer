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
            .authorizeExchange(exchange -> exchange
                .pathMatchers(
                    "/api/juegos/games/**",           // ✅ permite acceso al juego en iframe
                    "/api/juegos/send-metrics/**",    // ✅ permite envío de métricas
                    "/eureka/**",                     // opcional para Eureka
                    "/actuator/**"                    // opcional para monitoreo
                ).permitAll()
                .anyExchange().authenticated()
            )
            .build();
    }
}
