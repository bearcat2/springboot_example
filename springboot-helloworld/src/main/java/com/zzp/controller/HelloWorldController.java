package com.zzp.controller;

import com.zzp.entity.system.SysUser;
import com.zzp.service.system.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
public class HelloWorldController {

    @Autowired
    private SysUserService sysUserService;

    private Map<String, SysUser> map = new HashMap<>();

    private String key = "/demo";

    public HelloWorldController() {
        SysUser sysUser = new SysUser();
        sysUser.setSuId(1);
        map.put(key, sysUser);
    }

    @RequestMapping("/hello")
    public String hello() {
        try {
            double a = 1 / 0;
        } catch (Exception e) {
            log.debug("日志测试", e);
        }
        return "spring boot 搭建成功";
    }

    @RequestMapping("/asyncTask")
    public String asyncTask() {
        for (int i = 0; i < 60; i++) {
            this.sysUserService.asyncTask();
        }
        log.info("异步任务执行下一步..");
        return "request success";
    }
}
