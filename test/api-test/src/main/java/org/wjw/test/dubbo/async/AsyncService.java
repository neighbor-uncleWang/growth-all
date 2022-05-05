package org.wjw.test.dubbo.async;

import java.util.concurrent.CompletableFuture;

public interface AsyncService {
    String asynctoDo(String name);

    CompletableFuture<String> doOne(String name);

    String doTwo(String name);
}
