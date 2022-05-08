package org.wjw.consumer.dubbo.javaspi;

/**
 * @author laoWang
 * @ClassName Log4j.java
 * @createTime 2022-05-08 14:16
 */
public class Log4j implements GLog {
    @Override
    public boolean support(String type) {
        return "log4j".equalsIgnoreCase(type);
    }

    @Override
    public void debug() {
        System.out.println("====log4j.debug======");
    }

    @Override
    public void info() {
        System.out.println("====log4j.info======");
    }
}
