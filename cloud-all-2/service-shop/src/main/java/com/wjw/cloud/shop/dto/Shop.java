package com.wjw.cloud.shop.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author laoWang
 * @ClassName Shop.java
 * @createTime 2022-08-21 14:28
 */
@Data
public class Shop {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer price;

    private Integer count;

}
