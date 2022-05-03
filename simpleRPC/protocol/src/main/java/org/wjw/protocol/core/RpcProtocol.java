package org.wjw.protocol.core;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wjw
 * @ClassName RpcProtocol.java
 * @createTime 2022-05-02 18:16
 */
@Data
public class RpcProtocol<T>  implements Serializable {

    private Header header;
    private T content;

}
