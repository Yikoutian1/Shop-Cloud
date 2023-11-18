package com.heima.api.client;

import com.heima.api.dto.ItemDTO;
import com.heima.api.dto.OrderDetailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

/**
 * @ClassName ItemClient
 * @Description TODO
 * @Author QiuLiHang
 * @DATE 2023/11/16 016 21:27
 * @Version 1.0
 */
@FeignClient("item-service")
public interface ItemClient {
    @GetMapping("/items")
    public List<ItemDTO> queryItemByIds(@RequestParam("ids") Collection<Long> ids);
    @PutMapping("/items/stock/deduct")
    public void deductStock(@RequestBody Collection<OrderDetailDTO> items);
}
