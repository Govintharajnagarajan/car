package com.example.car.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.entity.Car;
import com.example.car.service.CarService;


@RestController
public class CarController {
	@Autowired
	CarService cs;

	static Logger log = Logger.getLogger(CarController.class);

	@PostMapping(value = "/postcar")
	public String postcar(@RequestBody List<Car> a) {
		PropertyConfigurator.configure("log4jpost.Properties");
		log.info(cs.postcar(a));
		return cs.postcar(a);
	}

	@GetMapping(value = "/getall")
	public List<Car> getall() {
		PropertyConfigurator.configure("log4jget.Properties");
		log.info(cs.getall());
		return cs.getall();
	}

	@PutMapping(value = "/putid")
	public String putthis(@RequestBody Car a) throws Exception {
		return cs.putthis(a);
	}

	@DeleteMapping(value = "/deleteid/{a}")
	public String deleteid(@PathVariable int a) {
		PropertyConfigurator.configure("log4jdelete.Properties");
		log.info(cs.deleteid(a));
		return cs.deleteid(a);
	}

}
