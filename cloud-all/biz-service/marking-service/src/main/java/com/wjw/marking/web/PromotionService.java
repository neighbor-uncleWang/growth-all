package com.wjw.marking.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 促销
 *
 * @author laoWang
 * @ClassName PromotionService.java
 * @createTime 2022-05-18 21:41
 */
@RestController
public class PromotionService {

    @GetMapping("/promotion")
    public String getPromotionById() {
        return "查询到指定商品的促销信息";
    }
}
