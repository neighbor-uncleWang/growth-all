package org.wjw.protocol.core;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wjw
 * @ClassName RpcRequest.java
 * @createTime 2022-05-02 18:11
 */
@Data
public class RpcRequest implements Serializable {
    private String className;

    private String methodName;

    private Object[] params;

    private Class<?> parameterTypes;
}
