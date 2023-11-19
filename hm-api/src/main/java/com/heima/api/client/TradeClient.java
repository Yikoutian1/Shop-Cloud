package com.heima.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @ClassName TradeClient
 * @Description
 * @Author QiuLiHang
 * @DATE 2023/11/19 019 19:38
 * @Version 1.0
 */
@FeignClient("trade-service")
public interface TradeClient {
    @PutMapping("/orders/{orderId}")
    public void markOrderPaySuccess(@PathVariable("orderId") Long orderId);
}
