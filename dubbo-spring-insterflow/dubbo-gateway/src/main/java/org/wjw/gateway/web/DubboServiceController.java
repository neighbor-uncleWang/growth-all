package org.wjw.gateway.web;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wjw.api.DubboCloudService;

import static org.apache.dubbo.common.constants.ClusterRules.FAIL_BACK;

/**
 * @author laoWang
 * @ClassName DubboServiceController.java
 * @createTime 2022-12-02 20:25
 */
@RestController
@RequestMapping("/dubboService")
public class DubboServiceController {

    @DubboReference(version = "1.0.0", cluster = FAIL_BACK)
    private DubboCloudService dubboCloudService;

//    @Autowired
//    private SpringCouldService springCouldService;

    @GetMapping("/service")
    public String service() {
        //dubboCloudService.getService()
        String str = dubboCloudService.getService();
        return str;
    }
}