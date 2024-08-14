package com.example.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.car.entity.Car;

public interface CarRepository extends JpaRepository<Car,Integer> {

}
