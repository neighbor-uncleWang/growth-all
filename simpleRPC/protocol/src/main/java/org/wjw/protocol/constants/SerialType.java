package org.wjw.protocol.constants;

/**
 * @author wjw
 * @ClassName SerialType.java
 * @createTime 2022-05-02 18:35
 */
public enum SerialType {

    /**
     *
     */
    JSON_SERIAL((byte) 0),

    JAVA_SERIAL((byte) 1),

    PING((byte) 3);

    private byte code;

    SerialType(byte code) {
        this.code = code;
    }


    public byte getCode() {
        return this.code;
    }

}
