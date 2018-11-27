package com.zzp.config;

import com.zzp.filter.DemoFilter;
import com.zzp.filter.DemoFilter1;
import com.zzp.listener.DemoListener;
import com.zzp.servlet.DemoServlet;
import com.zzp.servlet.DemoServlet1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p> Description: 配置 Servlet 、Filter 、Listener </p>
 * <p> Title: WebXmlConfig </p>
 * <p> Create Time: 2018/11/27 14:21 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Configuration
public class WebXmlConfig {

    @Bean
    public ServletListenerRegistrationBean<DemoListener> demoListener() {
        ServletListenerRegistrationBean<DemoListener> listenerRegistrationBean = new ServletListenerRegistrationBean<>();
        listenerRegistrationBean.setListener(new DemoListener());
        return listenerRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<DemoFilter> demoFilter() {
        FilterRegistrationBean<DemoFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new DemoFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<DemoFilter1> demoFilter1() {
        FilterRegistrationBean<DemoFilter1> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new DemoFilter1());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean<DemoServlet> demoServlet() {
        Map<String, String> initParameters = new LinkedHashMap<>();
        initParameters.put("charsetEncoding", "UTF-8");
        initParameters.put("demoKey", "demoValue");
        ServletRegistrationBean<DemoServlet> servletRegistrationBean = new ServletRegistrationBean<>();
        servletRegistrationBean.setServlet((new DemoServlet()));
        servletRegistrationBean.setUrlMappings(Arrays.asList("/servlet/demoServlet"));
        servletRegistrationBean.setInitParameters(initParameters);
        servletRegistrationBean.setLoadOnStartup(0);
        return servletRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean<DemoServlet1> demoServlet1() {
        Map<String, String> initParameters = new LinkedHashMap<>();
        initParameters.put("charsetEncoding", "UTF-8");
        initParameters.put("demoKey", "demoValue");
        ServletRegistrationBean<DemoServlet1> servletRegistrationBean = new ServletRegistrationBean<>();
        servletRegistrationBean.setServlet(new DemoServlet1());
        servletRegistrationBean.setUrlMappings(Arrays.asList("/servlet/demoServlet1"));
        servletRegistrationBean.setInitParameters(initParameters);
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }
}
