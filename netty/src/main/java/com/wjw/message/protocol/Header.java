package com.wjw.message.protocol;

import lombok.Data;

/**
 * 报文头模型
 *
 * @author wjw
 * @ClassName Header.java
 * @createTime 2022-04-29 21:12
 */
@Data
public class Header {

    /**
     * 会话id  8个字节
     */
    private long sessionId;
    /**
     * 消息类型 1字节
     */
    private byte erqType;
    /**
     * 消息提的长度 4字节
     */
    private int length;
}
