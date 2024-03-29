package com.zzp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * <p> Description: 测试spring 提供的开发者工具,实现热加载功能 </p>
 * <p> Title: DevToolsController </p>
 * <p> Create Time: 2018/11/26 18:06 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Slf4j
@RestController
public class DevToolsController {

    @Value("${zzp.demo}")
    private List demo1;

    @RequestMapping("/demo1")
    public String demo1() {
        log.info("demo1 = {}", demo1.toString());
        return "demo1 method called";
    }

    @RequestMapping("/demo2")
    public String demo2() {
        return "demo2 method called";
    }
}
