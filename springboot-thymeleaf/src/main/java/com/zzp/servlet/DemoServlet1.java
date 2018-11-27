package com.zzp.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * <p> Description: spring boot 中配置 servlet </p>
 * <p> Title: DemoServlet </p>
 * <p> Create Time: 2018/11/27 14:25 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Slf4j
public class DemoServlet1 extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("DemoServlet1 ServletName = {}", config.getServletName());
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String key = initParameterNames.nextElement();
            log.info("key = {} , value = {}", key, config.getInitParameter(key));
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
