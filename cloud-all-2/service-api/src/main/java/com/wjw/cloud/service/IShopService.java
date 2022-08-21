package com.wjw.cloud.service;

import com.wjw.cloud.service.model.ShopDO;

/**
 * @author laoWang
 * @ClassName IShopService.java
 * @createTime 2022-08-21 16:59
 */
public interface IShopService {

    /**
     * @param id
     * @return
     */
    public ShopDO getShop(Long id);

    /**
     * @param shop
     * @return
     */
    public int updateShop(ShopDO shop);

}
