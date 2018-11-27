package com.zzp.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * <p> Description: spring boot 中配置 filter </p>
 * <p> Title: DemoFilter </p>
 * <p> Create Time: 2018/11/27 14:49 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Slf4j
public class DemoFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info(" DemoFilter init method called  ==============");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("DemoFilter called =============== ");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
