package com.hang;

import com.heima.api.config.DefaultFeignConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName PayApplication
 * @Description TODO
 * @Author QiuLiHang
 * @DATE 2023/11/19 019 19:52
 * @Version 1.0
 */

@MapperScan("com.hang.mapper")
@EnableFeignClients(basePackages = "com.heima.api",defaultConfiguration = DefaultFeignConfig.class)
@SpringBootApplication
public class PayApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class, args);
    }
}
