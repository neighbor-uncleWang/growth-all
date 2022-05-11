package com.wjw.all.springbootall;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.wjw.all.springbootall")
//@MapperScan("com.wjw.all.springbootall")
public class SpringbootallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootallApplication.class, args);
    }

}
