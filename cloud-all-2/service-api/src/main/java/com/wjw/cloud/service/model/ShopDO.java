package com.wjw.cloud.service.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author laoWang
 * @ClassName ShopDO.java
 * @createTime 2022-08-21 17:01
 */
@Data
public class ShopDO implements Serializable {

    private static final long serialVersionUID = -2743579731614291391L;
    private Long id;

    private String name;

    private Integer price;

    private Integer count;

}
