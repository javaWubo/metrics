package com.ub8.config;

import com.ub8.service.MetricsService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * @author ：wubo
 * @date ：Created in 2023/2/3 5:20 PM
 * @description：
 * @version: 1.0
 */
@Configurable
@ConditionalOnClass(value = {MetricsService.class})
public class Ub8AutoConfiguration {

    @Bean
    public MetricsService metricsService(){
        MetricsService metricsService = new MetricsService();
        return metricsService;
    }
}
