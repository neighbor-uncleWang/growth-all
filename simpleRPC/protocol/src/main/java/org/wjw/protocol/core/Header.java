package org.wjw.protocol.core;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author wjw
 * @ClassName Header.java
 * @createTime 2022-05-02 17:48
 */
@Data
public class Header implements Serializable {
    /**
     * 魔数 2字节
     */
    private short magic;
    /**
     * 序列化类型  1个字节
     */
    private byte serialType;
    /**
     * 消消息类型  1个字节
     */
    private byte reqType;
    /**
     * 请求id  8个字节
     */
    private long requestId;

    /**
     * 消息体长度，4个字节
     */
    private int length;


}
