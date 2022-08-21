package com.wjw.cloud.user.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author laoWang
 * @ClassName User.java
 * @createTime 2022-08-21 14:09
 */
@Data
@TableName("user")
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer money;
}
