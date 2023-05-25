package com.mldn.bootstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangwenhao
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "www.mldn.com";
    }
}
