package com.spring_cloud.feign_client_with_ribbon_loadbalancer;

import com.spring_cloud.feign_client_with_ribbon_loadbalancer.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@RibbonClient(name = "car-ribbon-balancer", configuration = RibbonConfiguration.class)
@EnableFeignClients
public class FeignClientWithRibbonLoadbalancerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientWithRibbonLoadbalancerApplication.class, args);
    }

}
