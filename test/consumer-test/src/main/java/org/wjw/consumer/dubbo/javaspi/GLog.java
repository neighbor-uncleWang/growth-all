package org.wjw.consumer.dubbo.javaspi;

public interface GLog {
    boolean support(String type);
    void debug();
    void info();
}
