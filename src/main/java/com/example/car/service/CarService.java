package com.example.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.car.dao.CarDao;
import com.example.car.entity.Car;
import com.example.car.exception.PriceException;

@Service
public class CarService {
@Autowired
CarDao cd;
public String postcar( List<Car> a) {
	 return cd.postcar(a);
}
public List<Car> getall() {
	 return cd.getall();
}
public String putthis( Car a)throws Exception {
	if(a.getPrice()>2000000) {
		throw new PriceException("price not found");
	}
	return cd.putthis(a);
}
public String deleteid( int a) {
	 return cd.deleteid(a);
}


}
