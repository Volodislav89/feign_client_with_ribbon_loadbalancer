package com.spring_cloud.feign_client_with_ribbon_loadbalancer.config;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.ribbon.LoadBalancingTarget;

@Configuration
public class CarFeignConfig {
    @Bean
    CarFeignClient carFeignClient() {
        return Feign.builder()
                .contract(new SpringMvcContract())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(LoadBalancingTarget.create(CarFeignClient.class, "https://car-ribbon-server"));
    }
}
