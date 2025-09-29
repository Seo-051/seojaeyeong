package com.example.cardatabase4.service;

import com.example.cardatabase4.domain.Car;
import com.example.cardatabase4.domain.CarRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // 모든 자동차 목록을 조회한다고 가정함
    public List<Car> getCars(){
        return carRepository.findAll();
    }

    // 새로운 자동차 저장
    public Car addCar(Car car){
        return carRepository.save(car);
    }

    // 차량한대 조회
    public Optional<Car> getCarById(Long id){
        return carRepository.findById(id);
    }

    public boolean deleteCar(Long id){
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return true;
        }
        return  false;
    }

    @Transactional
    public Optional<Car> updateCar(Long id, Car carDetails){
        return carRepository.findById(id)
                .map(car -> {
                    car.setBrand(carDetails.getBrand());
                    car.setModel(carDetails.getModel());
                    car.setColor(carDetails.getColor());
                    car.setModelYear(carDetails.getModelYear());
                    car.setRegistrationNumber(carDetails.getRegistrationNumber());
                    car.setPrice(carDetails.getPrice());
                    return car;
                    // carRepository.save(car); 가 아닙니다.
                    // @tra
                });
    }

}
