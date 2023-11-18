package com.heima.api.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName DefaultFeignConfig
 * @Description TODO
 * @Author QiuLiHang
 * @DATE 2023/11/17 017 19:32
 * @Version 1.0
 */

public class DefaultFeignConfig {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.FULL;
    }
}