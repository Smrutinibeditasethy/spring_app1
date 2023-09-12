package com.mavenexample.SecondSpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
Car c = context.getBean("car", Car.class);
c.drive();

}
}
