package org.wjw.test.dubbo.callback;

public interface CallbackService {
    void addListener(String key, CallbackListener listener);
}
