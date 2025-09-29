package com.example.cardatabase4.web;

import com.example.cardatabase4.domain.Car;
import com.example.cardatabase4.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {
    private final CarService carService;


    public CarController(CarService carService) {
        this.carService = carService;
    }

    // 1. 모든 자동차 정보 조회 (GET / api / cars)
    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    // 2. 차량 한대 추가 (POST / api/cars)
    @PostMapping("/cars")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        Car savedCar = carService.addCar(car);

        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }

    //3.  차량 한 대 조회
    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id){
        return carService.getCarById(id)
                .map(car -> ResponseEntity.ok().body(car)) // 차량정보가 있으면 200 ok를 반환할것.
                .orElse(ResponseEntity.notFound().build()); // 없으면 404 Not Foun를 return 시킬것
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id){
        if(carService.deleteCar(id)){
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/cars/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Long id, @RequestBody Car carDetails){
        return carService.updateCar(id, carDetails)
                .map(updateCar -> ResponseEntity.ok().body(updateCar)) //수정 성공 200ok
                .orElse(ResponseEntity.notFound().build());     // 수정할 차량 id 검색 실패시 404
    }
}
