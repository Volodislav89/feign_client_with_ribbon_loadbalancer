package com.spring_cloud.feign_client_with_ribbon_loadbalancer.controller;

import com.spring_cloud.feign_client_with_ribbon_loadbalancer.config.CarFeignClient;
import com.spring_cloud.feign_client_with_ribbon_loadbalancer.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
public class CarFeignController {
    CarFeignClient carFeignClient;

    @GetMapping
    public List<Car> getAllCars() {
        return carFeignClient.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carFeignClient.getCarById(id);
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carFeignClient.saveNewCar(car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car) {
        return carFeignClient.updateCarById(id, car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carFeignClient.deleteCarById(id);
    }
}
