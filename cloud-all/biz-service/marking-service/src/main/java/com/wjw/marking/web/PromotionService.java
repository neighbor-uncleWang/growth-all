package com.wjw.marking.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wjw.api.goods.IGoodsService;
import org.wjw.api.marking.IPromotionService;

/**
 * 促销
 *
 * @author laoWang
 * @ClassName PromotionService.java
 * @createTime 2022-05-18 21:41
 */
@RestController
@RequestMapping("/promotionService")
public class PromotionService implements IPromotionService {

    @Override
    @GetMapping("/promotion")
    public String getPromotionById() {
        return "查询到指定商品的促销信息";
    }
}
