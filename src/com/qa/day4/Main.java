package com.qa.day4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Garage garage = new Garage();
//		garage.addVehicle(2, 1000, 2, 1);
//		garage.addVehicle(2, 2, 2, 2);
//		garage.addVehicle(2, 2, 2, 3);
//		garage.addVehicle(2, 2, 2, 4);
//		garage.fixVehicle(2);

		Van van = new Van(2,12345);
		garage.addVehicle(van);
		
		Van van2 = new Van(50,1234);
		garage.addVehicle(van2);
		
		garage.fixVehicle(1234);
		garage.emptyGarage();
		garage.fixVehicle(1234);
		garage.emptyGarage();
		System.out.println(garage);
	}

}
