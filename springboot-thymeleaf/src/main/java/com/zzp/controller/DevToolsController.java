package com.zzp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

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

    @Value("${zzp.names}")
    private String[] names;

    @Value("${zzp.ages}")
    private Integer[] ages;

    @RequestMapping("/demo")
    public String demo() {
        log.info("names = {}", Arrays.toString(names));
        log.info("ages = {}", Arrays.toString(ages));
        return "demo method called";
    }

    @RequestMapping("/demo1")
    public String demo1() {
        return "demo1 method called";
    }

    @RequestMapping("/demo2")
    public String demo2() {
        return "demo2 method called";
    }
}
