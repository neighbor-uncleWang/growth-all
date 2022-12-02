package org.wjw.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author laoWang
 * @ClassName SpringCouldService.java
 * @createTime 2022-11-29 22:54
 */
@FeignClient(name = "spring-service", value = "spring-service", path = "/springCouldService")
public interface SpringCouldService {

    @GetMapping("/service")
    public String getService();
}
