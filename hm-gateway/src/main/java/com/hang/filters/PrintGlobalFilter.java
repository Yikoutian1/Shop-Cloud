package com.hang.filters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName PrintGlobalFilter
 * @Description TODO
 * @Author QiuLiHang
 * @DATE 2023/11/21 021 20:46
 * @Version 1.0
 */
@Component
@Slf4j
public class PrintGlobalFilter implements GlobalFilter , Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("PrintGlobalFilter 执行了");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
