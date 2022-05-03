package org.wjw.protocol.serial;

import com.alibaba.fastjson.JSON;
import org.wjw.protocol.constants.SerialType;

/**
 * @author wjw
 * @ClassName JsonSerializer.java
 * @createTime 2022-05-03 14:14
 */
public class JsonSerializer implements ISerializer {
    public <T> byte[] serialize(T obj) {
        return JSON.toJSONString(obj).getBytes();
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        return JSON.parseObject(new String(data), clazz);
    }

    public byte getType() {
        return SerialType.JSON_SERIAL.getCode();
    }
}
