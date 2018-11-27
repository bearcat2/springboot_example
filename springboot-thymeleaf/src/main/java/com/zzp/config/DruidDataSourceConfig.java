package com.zzp.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p> Description: Druid 数据源配置 </p>
 * <p> Title: DruidDataSourceConfig </p>
 * <p> Create Time: 2018/11/27 18:08 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Configuration
public class DruidDataSourceConfig {

    @Bean(initMethod = "init", destroyMethod = "close")
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DruidDataSource druidDataSource() {
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet() {
        ServletRegistrationBean<StatViewServlet> statViewServlet = new ServletRegistrationBean<>();
        statViewServlet.setServlet(new StatViewServlet());
        statViewServlet.setUrlMappings(Arrays.asList("/druid/*"));
        statViewServlet.setLoadOnStartup(0);
        Map<String, String> initParameters = new LinkedHashMap<>();
        initParameters.put("loginUsername", "zzp");
        initParameters.put("loginPassword", "123456");
        statViewServlet.setInitParameters(initParameters);
        return statViewServlet;
    }

    @Bean
    public FilterRegistrationBean<WebStatFilter> webStatFilter() {
        FilterRegistrationBean<WebStatFilter> webStatFilter = new FilterRegistrationBean<>();
        webStatFilter.setFilter(new WebStatFilter());
        webStatFilter.setUrlPatterns(Arrays.asList("/*"));
        Map<String, String> initParameters = new LinkedHashMap<>();
        initParameters.put("exclusions", "*.css,*.js,*.jpg,*.png,/druid/*");
        webStatFilter.setInitParameters(initParameters);
        return webStatFilter;
    }
}
