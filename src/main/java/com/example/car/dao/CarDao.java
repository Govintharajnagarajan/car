package com.example.car.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.car.entity.Car;
import com.example.car.repository.CarRepository;

@Repository
public class CarDao {
@Autowired
CarRepository cr;

public String postcar( List<Car> a) {
	cr.saveAll(a);
	 return "posted";
}
public List<Car> getall() {
	 return cr.findAll();
}
public String putthis( Car a) {
	cr.save(a);
	return "changed";
}
public String deleteid( int a) {
	cr.deleteById(a);
	 return "delete";
}

}
