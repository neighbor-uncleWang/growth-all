package org.wjw.api.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author laoWang
 * @ClassName IOrderService.java
 * @createTime 2022-05-22 15:45
 */
@FeignClient(name = "order", value = "order", path = "/orderService")
public interface IOrderService {

    /**
     * 下单
     *
     * @param goodsInfo
     * @param pomotionInfo
     * @return
     */
    @PostMapping("/order")
    String createOrder(@RequestParam String goodsInfo, @RequestParam String pomotionInfo);

}
