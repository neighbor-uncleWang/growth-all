package org.wjw.provider.dubbo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wjw.provider.dubbo.config.ProviderConfiguration;

import java.util.concurrent.CountDownLatch;

/**
 * 启动
 */
@Slf4j
public class App {

    public static void main(String[] args) throws InterruptedException {
        new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        log.info("dubbo service start.");
        new CountDownLatch(1).wait();
    }
}
