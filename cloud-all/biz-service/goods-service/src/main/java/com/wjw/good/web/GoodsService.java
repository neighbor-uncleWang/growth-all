package com.wjw.good.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wjw.api.goods.IGoodsService;

/**
 * 商品web
 *
 * @author laoWang
 * @ClassName GoodsService.java
 * @createTime 2022-05-18 21:41
 */
@Slf4j
@RestController()
@RequestMapping("/goodsService")
public class GoodsService implements IGoodsService {

    @Value("${server.port}")
    private String port;

    /**
     * 根据ID查询商品信息
     *
     * @return
     */
    @GetMapping("/goods")
    @Override
    public String getGoodsById() {
        log.info("收到请求，端口为：{}", port);
        return "返回商品信息";
    }
}
