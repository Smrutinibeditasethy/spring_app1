package com.mavenexample.SecondSpring;

public class Car {
public Car() {
	System.out.println("The car class constructor");
}
private DieselEngine dieselEngine;
public void setDieselengine(DieselEngine dieselengine) {
	this.dieselEngine = dieselengine;
}

public void drive() {
	int result = dieselEngine.start();
	if (result>=1) {
		System.out.println("Car started for journey");
	}else {
		System.out.println("Engine has a problem");
	}

}
}
