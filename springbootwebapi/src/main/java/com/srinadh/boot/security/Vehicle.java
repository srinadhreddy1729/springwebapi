package com.srinadh.boot.security;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int Id;
private String vehicleName;
private long vehicleModel;
private long vehicleNumber;
private String vehicleEmail;
private String vehicleCompany;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
public long getVehicleModel() {
	return vehicleModel;
}
public void setVehicleModel(long vehicleModel) {
	this.vehicleModel = vehicleModel;
}
public long getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(long vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
public String getVehicleEmail() {
	return vehicleEmail;
}
public void setVehicleEmail(String vehicleEmail) {
	this.vehicleEmail = vehicleEmail;
}
public String getVehicleCompany() {
	return vehicleCompany;
}
public void setVehicleCompany(String vehicleCompany) {
	this.vehicleCompany = vehicleCompany;
}
}
