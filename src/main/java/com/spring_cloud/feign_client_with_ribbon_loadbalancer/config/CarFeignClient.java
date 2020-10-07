package com.spring_cloud.feign_client_with_ribbon_loadbalancer.config;

import com.spring_cloud.feign_client_with_ribbon_loadbalancer.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "car-ribbon-server/car")
public interface CarFeignClient {
    @GetMapping
    List<Car> getAllCars();

    @GetMapping("/id/{id}")
    Car getCarById(@PathVariable Long id);

    @PostMapping
    Car saveNewCar(@RequestBody Car car);

    @PutMapping("/update/{id}")
    Car updateCarById(@PathVariable Long id, @RequestBody Car car);

    @DeleteMapping("/delete/{id}")
    void deleteCarById(@PathVariable Long id);
}
