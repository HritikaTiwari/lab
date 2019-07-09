package com.pdw.core;
interface vehicleone{
	void m11();
}

interface vehicletwo{
	void m21();
}

class Vehicle  implements vehicleone,vehicletwo{
	public void m21(){
		
		System.out.println("m21 method ");
	}
	public void m11() {
		System.out.println("m11 method ");
	}


	public static void main(String args[]){
		System.out.println("Vehicles");
		Vehicle obj= new Vehicle();
		obj.m21();
		obj.m11();
	}
}

