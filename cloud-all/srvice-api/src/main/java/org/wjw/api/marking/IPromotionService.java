package org.wjw.api.marking;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author laoWang
 * @ClassName IPromotionService.java
 * @createTime 2022-05-22 15:45
 */
@FeignClient(name = "marking", value = "marking", path = "/promotionService")
public interface IPromotionService {

    @GetMapping("/promotion")
    String getPromotionById();

}
