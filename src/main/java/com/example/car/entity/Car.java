package com.example.car.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slno;
	private String brand;
	private int price;
	private String model;
	private int cc;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Car [slno=" + slno + ", brand=" + brand + ", price=" + price + ", model=" + model + ", cc=" + cc + "]";
	}
	
}
