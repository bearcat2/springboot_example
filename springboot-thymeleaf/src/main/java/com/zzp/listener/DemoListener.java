package com.zzp.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * <p> Description: </p>
 * <p> Title: DemoListener </p>
 * <p> Create Time: 2018/11/27 15:54 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Slf4j
public class DemoListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("容器初始化...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("容器关闭...");
    }
}
