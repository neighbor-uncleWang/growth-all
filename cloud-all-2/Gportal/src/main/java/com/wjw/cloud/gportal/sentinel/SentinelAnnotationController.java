package com.wjw.cloud.gportal.sentinel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laoWang
 * @ClassName SentinelAnnotaionController.java
 * @createTime 2022-08-01 20:52
 */
@RestController
@RequestMapping("/sentinel")
public class SentinelAnnotationController {

    @Autowired
    private SentinelAnnotationService sentinelAnnotationService;

    @GetMapping("/test01")
    public String test01(){
        String str = sentinelAnnotationService.test01();

        return str;
    }

}
