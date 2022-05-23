package org.wjw.api.goods;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 商品
 * @author laoWang
 * @ClassName IGoodsService.java
 * @createTime 2022-05-22 15:43
 */
@FeignClient(name = "goods",path = "/goodsService")
public interface IGoodsService {
    /**
     * 根据ID查询商品信息
     *
     * @return
     */
    @GetMapping("/goods")
    public String getGoodsById();
}
