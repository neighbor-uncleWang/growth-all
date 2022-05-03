package org.wjw.protocol.constants;

/**
 * @author wjw
 * @ClassName ReqType.java
 * @createTime 2022-05-02 18:33
 */
public enum ReqType {
    /**
     * 请求
     */
    REQ((byte) 0),
    /**
     * 响应
     */
    RES((byte) 1),
    /**
     * 响应
     */
    PING((byte) 2);

    private byte code;

    ReqType(byte code) {
        this.code = code;
    }


    public byte getCode() {
        return this.code;
    }

    public static ReqType findByCode(byte code) {
        ReqType[] values = ReqType.values();
        for (ReqType value : values) {
            if (value.getCode() == code) {
                return value;
            }
        }
        return null;
    }

}
