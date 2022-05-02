package com.wjw.message.enums;

/**
 * 消息类型
 *
 * @author wjw
 * @ClassName OpCode.java
 * @createTime 2022-04-30 09:34
 */
public enum OpCode {
    /**
     *请求
     */
    REQ((byte) 0),
    /**
     *响应
     */
    RES((byte) 1),
    /**
     *ping
     */
    PING((byte) 2),
    /**
     *
     */
    PONG((byte) 3);

    private byte code;

    OpCode(byte code) {

    }

    public byte code() {

        return this.code;
    }

}
