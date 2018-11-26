package com.zzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p> Description: thymeleaf 测试 </p>
 * <p> Title: ThymeleafController </p>
 * <p> Create Time: 2018/11/26 18:59 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
