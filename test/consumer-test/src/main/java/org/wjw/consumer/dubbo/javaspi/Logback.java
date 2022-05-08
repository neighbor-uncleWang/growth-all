package org.wjw.consumer.dubbo.javaspi;

/**
 * @author laoWang
 * @ClassName Logback.java
 * @createTime 2022-05-08 14:16
 */
public class Logback implements GLog {
    @Override
    public boolean support(String type) {
        return "Logback".equalsIgnoreCase(type);
    }

    @Override
    public void debug() {
        System.out.println("====Logback.debug======");
    }

    @Override
    public void info() {
        System.out.println("====Logback.info======");
    }
}
