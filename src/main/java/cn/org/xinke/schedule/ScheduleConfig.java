package cn.org.xinke.schedule;

import cn.org.xinke.util.CacheUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @description 定时任务配置
 * @author cinco
 * @date 2019-1-25
 */
@Slf4j
@Configuration
@EnableScheduling
public class ScheduleConfig implements SchedulingConfigurer {

    /** 线程池线程数量 */
    private static final int THREAD_COUNT = 1;

    /**
     * 清除过期的分享文件信息, 每3秒钟执行一次
     */
    @Scheduled(cron = "0/3 * * * * ?")
    public void clearShareCache() {
        Map<String, Date> dataExpireMap = CacheUtil.dataExpireMap;
        Set<String> keysExpire = dataExpireMap.keySet();
        for (String t : keysExpire) {
            Date expireDate = CacheUtil.dataExpireMap.get(t);
            if (expireDate != null && expireDate.compareTo(new Date()) < 0) {
                CacheUtil.dataMap.remove(t);
                CacheUtil.dataExpireMap.remove(t);
            }
        }
    }

    /**
     * 线程配置, 让多个定时任务在同一个线程池的不同线程中并发执行
     *
     * @param scheduledTaskRegistrar
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        // 手动创建线程, 可以规避资源耗尽, 且可以设置线程名称规则
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor( THREAD_COUNT, new BasicThreadFactory.Builder().namingPattern("Schedule-Thread-Pool-Thread%d").daemon(true).build() );
        scheduledTaskRegistrar.setScheduler(scheduledExecutorService);
    }
}