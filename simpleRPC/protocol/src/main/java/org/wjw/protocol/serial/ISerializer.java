package org.wjw.protocol.serial;

/**
 * 序列化接口
 *
 * @author wjw
 * @ClassName ISerializer.java
 * @createTime 2022-05-02 19:00
 */
public interface ISerializer {


    /**
     * 序列化
     *
     * @param obj
     * @param <T>
     * @return
     */
    <T> byte[] serialize(T obj);


    /**
     * 反序列化
     *
     * @param data
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T deserialize(byte[] data, Class<T> clazz);

    /**
     * @return
     */
    byte getType();

}
