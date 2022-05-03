package org.wjw.protocol.serial;

import org.wjw.protocol.constants.SerialType;

import java.io.*;

/**
 * @author wjw
 * @ClassName JavaSerializer.java
 * @createTime 2022-05-03 14:01
 */
public class JavaSerializer implements ISerializer {

    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        try {
            ObjectInputStream ios = new ObjectInputStream(new ByteArrayInputStream(data));
            return (T) ios.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public byte getType() {
        return SerialType.JAVA_SERIAL.getCode();
    }
}
