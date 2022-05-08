package org.wjw.consumer.dubbo.javaspi;

/**
 * @author laoWang
 * @ClassName Slf4j.java
 * @createTime 2022-05-08 14:16
 */
public class Slf4j implements GLog {
    @Override
    public boolean support(String type) {
        return "Slf4j".equalsIgnoreCase(type);
    }

    @Override
    public void debug() {
        System.out.println("====Slf4j.debug======");
    }

    @Override
    public void info() {
        System.out.println("====Slf4j.info======");
    }
}
