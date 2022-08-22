package com.wjw.cloud.shop.service;

import com.wjw.cloud.service.IShopService;
import com.wjw.cloud.service.model.ShopDO;
import com.wjw.cloud.shop.dto.Shop;
import com.wjw.cloud.shop.dto.ShopDTO;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;


/**
 * @author laoWang
 * @ClassName ShopServiceImpl.java
 * @createTime 2022-08-21 09:36
 */
@DubboService(loadbalance = "random")
public class ShopServiceImpl implements IShopService {

    @Autowired
    private ShopDTO shopDTO;


    @Override
    public ShopDO getShop(Long id) {

        Shop shop = shopDTO.selectById(id);
        ShopDO shopDO = new ShopDO();

        BeanUtils.copyProperties(shop, shopDO);

        return shopDO;
    }

    @Override
    @Transient
    public int updateShop(ShopDO shopDO) {
        Shop shop = new Shop();
        BeanUtils.copyProperties(shopDO, shop);
//        shop = null; //手动异常
        return shopDTO.updateById(shop);
    }
}
