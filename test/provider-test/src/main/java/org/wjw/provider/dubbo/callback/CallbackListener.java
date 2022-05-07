package org.wjw.provider.dubbo.callback;

/**
 * @author laoWang
 * @ClassName CallackListener.java
 * @createTime 2022-05-07 20:50
 */
public interface CallbackListener {

    /**
     * @param msg
     */
    void changed(String msg);
}
