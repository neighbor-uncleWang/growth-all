package com.wjw.portal.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单web
 *
 * @author laoWang
 * @ClassName OrderController.java
 * @createTime 2022-05-18 21:37
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadbalancerClient;

  /*  @Value("${goodsService.serverList}.split(',')")
    private List<String> goodsList;*/

   /* private String getGoodsServer(){
        String serverList="http://localhost:9090/goods,http://localhost:9093/goods";
        String servers[]=serverList.split(",");
        Random random=new Random();
        return servers[random.nextInt(servers.length)];
    }*/

    @GetMapping
    public String order() {
        log.info("begin do order");

       /* ServiceInstance si=loadbalancerClient.choose("goods-service");
        String url=String.format("http://%s:%s",si.getHost(),si.getPort());
        log.info("ribbon-url:{}",url);*/

        String url = "http://goods-service/goods";
        String goodsInfo = restTemplate.getForObject(url, String.class);
        String promotionInfo = restTemplate.getForObject("http://marking-service/promotion", String.class);
        MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
        param.add("goodsInfo", goodsInfo);
        param.add("pomotionInfo", promotionInfo);

        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(param, new HttpHeaders());
        ResponseEntity<String> response = restTemplate.postForEntity("http://order-service/order", httpEntity, String.class);
        return response.getBody();
    }
}
