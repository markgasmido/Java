package com.qa.day4;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> list = new ArrayList<Vehicle>();

	public void calculatingBill(int ID) {
		for (Vehicle v : list) {
			if (v.getID() == ID) {
				if (v.getMaxPassengers() == 2) {
					System.out.println("Calculating for Motorbike");
					int total = (v.getMaxPassengers() + v.getNumberOfWheels()) * v.getMaxSpeed();
					System.out.println("Your total is: " + total);
				}

				if (v.getMaxPassengers() == 5) {
					System.out.println("Calculating for Car");
					int total = (v.getMaxPassengers() + v.getMaxSpeed()) / v.getNumberOfWheels();
					System.out.println("Your total is: " + total);
				}

				if (v.getMaxPassengers() == 10) {
					System.out.println("Calculating for Van");
					int total = v.getMaxPassengers() * v.getNumberOfWheels() * v.getMaxSpeed();
					System.out.println("Your total is: " + total);
				}
			}
		}
	}
	

	public void addVehicle(int wheel, int speed, int passenger, int ID) {
		Vehicle name = new Vehicle();
		name.setMaxSpeed(speed);
		name.setNumberOfWheels(wheel);
		name.setMaxPassengers(passenger);
		name.setID(ID);
		list.add(name);
	}
	
	public void addVehicle(Car car) {
		list.add(car);
	}
	
	public void addVehicle(Motorbike bike) {
		list.add(bike);
	}
	
	public void addVehicle(Van van) {
		list.add(van);
	}

	public void removeVehicle(int ID) {
		int count = 0;
		boolean flag = false;
		int point = 0;
		for (Vehicle v : list) {
			if (v.getID() == ID) {
				point = count;
				flag = true;
			}
			count++;
		}
		if (flag) {
			list.remove(point);
		}
	}
	
	public void removeVehicle(String vehicleType) {
		
	}

	public void fixVehicle(int ID) {
		System.out.println("Fixed vehicle.");
		calculatingBill(ID);
		removeVehicle(ID);
	}

	public void emptyGarage() {
		list.removeAll(list);
	}
}
