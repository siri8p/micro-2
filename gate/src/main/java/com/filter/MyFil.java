package com.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.core.Ordered;

import java.util.List;
import java.util.Set;

@Component
public class MyFil implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String username = exchange.getRequest().getQueryParams().getFirst("test7777");
        String password = exchange.getRequest().getQueryParams().getFirst("123");

        // Log the values so you can see what Postman sent
        System.out.println("=== FILTER LOG ===");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("==================");

        // Continue request even if params are missing
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -1; // run early
    }
}
