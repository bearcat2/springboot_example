package com.zzp.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * <p> Description: 配置任务线程池及开启异步任务 </p>
 * <p> Title: TaskThreadPoolConfig </p>
 * <p> Create Time: 2018/11/22 17:11 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Data
@EnableAsync
@Configuration
@ConfigurationProperties(prefix = "threadpool")
public class TaskThreadPoolConfig {

    /** 线程池维护线程的最少数量 */
    private Integer corePoolSize;

    /** 线程池维护线程的最大数量,默认为Integer.MAX_VALUE */
    private Integer maxPoolSize;

    /** 线程池所使用的缓冲队列,默认为Integer.MAX_VALUE */
    private Integer queueCapacity;

    /** 线程池维护线程所允许的空闲时间,默认为60s */
    private Integer keepAliveSeconds;

    /** 设置线程名称前缀 */
    private String threadNamePrefix;

    /** 等待所有任务结束后再关闭线程池 */
    private Boolean waitForTasksToCompleteOnShutdown;

    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(corePoolSize);
        threadPoolTaskExecutor.setMaxPoolSize(maxPoolSize);
        threadPoolTaskExecutor.setQueueCapacity(queueCapacity);
        threadPoolTaskExecutor.setKeepAliveSeconds(keepAliveSeconds);
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolTaskExecutor.setThreadNamePrefix(threadNamePrefix);
        threadPoolTaskExecutor.setWaitForTasksToCompleteOnShutdown(waitForTasksToCompleteOnShutdown);
        return threadPoolTaskExecutor;
    }
}
