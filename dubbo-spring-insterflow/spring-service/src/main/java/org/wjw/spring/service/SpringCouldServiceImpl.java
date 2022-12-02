package org.wjw.spring.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wjw.api.SpringCouldService;

/**
 * @author laoWang
 * @ClassName SpringCloudServiceImpl.java
 * @createTime 2022-12-02 19:46
 */
@RestController
@RequestMapping("/springCouldService")
public class SpringCouldServiceImpl implements SpringCouldService {

    @GetMapping("/service")
    public String getService() {
        return "this is spring could service;";
    }

}
