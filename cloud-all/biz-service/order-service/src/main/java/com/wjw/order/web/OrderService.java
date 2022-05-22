package com.wjw.order.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wjw.api.goods.IGoodsService;
import org.wjw.api.order.IOrderService;

/**
 * 订单web
 *
 * @author laoWang
 * @ClassName PromotionService.java
 * @createTime 2022-05-18 21:41
 */
@Slf4j
@RestController
public class OrderService implements IOrderService {

    /**
     * 下单
     * @param goodsInfo
     * @param pomotionInfo
     * @return
     */
//    @PostMapping("/order")
    @Override
    public String createOrder(@RequestParam String goodsInfo, @RequestParam String pomotionInfo) {
        log.info("开始创建订单,请求参数,{},{}", goodsInfo, pomotionInfo);
        return "订单创建成功";
    }
}
