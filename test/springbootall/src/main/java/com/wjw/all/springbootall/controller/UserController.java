package com.wjw.all.springbootall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author laoWang
 * @ClassName UserController.java
 * @createTime 2022-05-11 22:29
 */
@Controller
public class UserController {


    @RequestMapping("/queryUser")
    public @ResponseBody String queryUser(String username,String address) {
        return "w";
    }


}
