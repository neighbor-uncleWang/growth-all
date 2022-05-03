package org.wjw.protocol.serial;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wjw
 * @ClassName SerializerManager.java
 * @createTime 2022-05-03 14:24
 */
public class SerializerManager {

    private final static ConcurrentHashMap<Byte, ISerializer> serializer = new ConcurrentHashMap<Byte, ISerializer>();

    static {
        ISerializer java = new JavaSerializer();
        ISerializer json = new JsonSerializer();
        serializer.put(java.getType(), java);
        serializer.put(json.getType(), json);
    }

    public static ISerializer getSerializer(byte key) {
        ISerializer serialize = serializer.get(key);
        if (serialize == null) {
            return new JavaSerializer();
        }
        return serialize;
    }

}
