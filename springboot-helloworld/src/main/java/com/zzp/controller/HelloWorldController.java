package com.zzp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> Description: spring 第一个入门程序</p>
 * <p> Title: HelloWorldController </p>
 * <p> Create Time: 2018/11/15 20:42 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/helloWorld/")
public class HelloWorldController {

    @RequestMapping("hello")
    public String hello() {
        try {
            double a = 1 / 0;
        } catch (Exception e) {
            log.debug("日志测试",e);
        }
        return "spring boot 搭建成功";
    }
}