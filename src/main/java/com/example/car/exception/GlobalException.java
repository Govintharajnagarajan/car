package com.example.car.exception;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;




@RestControllerAdvice
public class GlobalException {
	static Logger log=Logger.getLogger(GlobalException.class);
	@ExceptionHandler(PriceException.class) 
	public ResponseEntity<String> accex(PriceException ae) {
		PropertyConfigurator.configure("log4jcar.property");
		log.error(ae);
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
