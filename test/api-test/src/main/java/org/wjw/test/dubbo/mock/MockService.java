package org.wjw.test.dubbo.mock;

public interface MockService {
    String mock(String param);

    String queryArea(String areaCode);

    String queryUser(String userCode);
}
