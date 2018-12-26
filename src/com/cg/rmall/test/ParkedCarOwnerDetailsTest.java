package com.cg.rmall.test;
import org.junit.Before;
import org.junit.Test;

import com.cg.rmall.model.ParkedCarOwenerList;
import com.cg.rmall.model.ParkedCarOwnerDetails;

/**
 * @author ugawari
 *
 */
public class ParkedCarOwnerDetailsTest {

	private ParkedCarOwnerDetails carOwnerDetails1, carOwnerDetails2, carOwnerDetails3, carOwnerDetails5, carOwnerDetails4, carOwnerDetails6;
	private ParkedCarOwenerList parkedCarOwenerList;
	
	@Before
	public void setUp(){
		parkedCarOwenerList = new ParkedCarOwenerList();
		carOwnerDetails1 = new ParkedCarOwnerDetails("454", "Ujwala", "A5", "9876543210", "Vitawa");//carOwnerDetails1.setToken(5);
		carOwnerDetails2 = new ParkedCarOwnerDetails("454", "Mrudula", "A5", "9876543210", "Vitawa");//carOwnerDetails2.setToken(2);
		carOwnerDetails3 = new ParkedCarOwnerDetails("454", "Shubham", "A5", "9876543210", "Vitawa");//carOwnerDetails3.setToken(1);
		carOwnerDetails4 = new ParkedCarOwnerDetails("454", "Priyanka", "A5", "9876543210", "Vitawa");//carOwnerDetails4.setToken(4);
		carOwnerDetails5 = new ParkedCarOwnerDetails("454", "Hema", "A5", "9876543210", "Vitawa");//carOwnerDetails5.setToken(3);
		carOwnerDetails6 = new ParkedCarOwnerDetails("454", "Shrivani", "A5", "9876543210", "Vitawa");
	}
	
	@Test
	public void test() {
		System.out.println("car1 "+parkedCarOwenerList.addNewCar(carOwnerDetails1));
		System.out.println("car2 "+parkedCarOwenerList.addNewCar(carOwnerDetails2));
		System.out.println("car3 "+parkedCarOwenerList.addNewCar(carOwnerDetails3));
		System.out.println("car4 "+parkedCarOwenerList.addNewCar(carOwnerDetails4));
		System.out.println("car5 "+parkedCarOwenerList.addNewCar(carOwnerDetails5));
		parkedCarOwenerList.removeCar(4);
		System.out.println(parkedCarOwenerList.carList.toString());
		System.out.println(parkedCarOwenerList.addNewCar(carOwnerDetails6));
		System.out.println(parkedCarOwenerList.getParkedCarLocation(4));
	}

	
}
