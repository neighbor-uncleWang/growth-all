package com.wjw.portal.hear;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * 自定义心跳检测
 *
 * @author laoWang
 * @ClassName HealthChecker.java
 * @createTime 2022-05-21 17:34
 */
@Deprecated
public class HealthChecker implements IPing {
    @Override
    public boolean isAlive(Server server) {
        String url = "http://" + server.getId() + "/healthCheck";
        boolean isAlive = true;
        HttpClient httpClient = new DefaultHttpClient();
        HttpUriRequest request = new HttpGet(url);
        try {
            HttpResponse response = httpClient.execute(request);
            isAlive = response.getStatusLine().getStatusCode() == 200;
        } catch (Exception e) {
            isAlive = false;
        } finally {
            request.abort();
        }
        return isAlive;
    }
}
