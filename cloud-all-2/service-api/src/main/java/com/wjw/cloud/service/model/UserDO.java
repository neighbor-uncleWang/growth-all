package com.wjw.cloud.service.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author laoWang
 * @ClassName User.java
 * @createTime 2022-08-21 14:09
 */
@Data
public class UserDO implements Serializable {

    private static final long serialVersionUID = 4458795687198278793L;

    private Long id;

    private String name;

    private Integer money;
}
