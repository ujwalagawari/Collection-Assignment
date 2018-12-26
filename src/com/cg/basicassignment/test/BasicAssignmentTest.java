package com.cg.basicassignment.test;
import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.basicassignment.model.Car;
import com.cg.basicassignment.model.CellPhone;
import com.cg.basicassignment.model.Laptop;
import com.cg.basicassignment.model.School;
import com.cg.basicassignment.model.Television;

/**
 * @author ugawari
 *
 */
public class BasicAssignmentTest {

	private Laptop laptop1, laptop2, laptop3, laptop4;
	private Car car1, car2, car3, car4;
	private Television television1, television2, television3, television4;
	private CellPhone cellPhone1, cellPhone2, cellPhone3;
	private School school1, school2, school3;
	
	@Before
	public void setUp(){
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testForTelevisionDuplicatesNotAllowed() {
		television1 = new Television("Samsung", "LCD", false, 10000);
		television2 = new Television("Lg ", "LED", true, 15000);
		television3 = new Television("Sony ", "Plasma", true, 20000);
		television4 = new Television("Lg ", "LED", false, 15000);
		Set<Television> set = new HashSet<Television>();
			set.add(television1);
			set.add(television2);
			set.add(television3);
			set.add(television4);
			String setOfTelevision="[Television [company=Lg , type=LED, threeD=true, price=15000.0],"
					+ " Television [company=Sony , type=Plasma, threeD=true, price=20000.0],"
					+ " Television [company=Samsung, type=LCD, threeD=false, price=10000.0]]";
			Assert.assertEquals(setOfTelevision, set.toString());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testForLaptopDuplicatesNotAllowed() {
		laptop1 = new Laptop("Dell", "A5", "Linux", "intel 5");
		laptop2 = new Laptop("Dell", "A5", "Windows 10", "intel 6");
		laptop4 = new Laptop("HP", "A5", "Windows 10", "intel 6");
		laptop3 = new Laptop("LENOVO", "Di4h", "Windows 10" , "intel core 2");
		Set<Laptop> set = new HashSet<Laptop>();
			set.add(laptop1);
			set.add(laptop2);
			set.add(laptop3);
			set.add(laptop4);
			String setOfLaptop="[Laptop [company=Dell, model=A5, operatingSystem=Linux, processor=intel 5],"
					+ " Laptop [company=HP, model=A5, operatingSystem=Windows 10, processor=intel 6],"
					+ " Laptop [company=LENOVO, model=Di4h, operatingSystem=Windows 10, processor=intel core 2]]";
			Assert.assertEquals(setOfLaptop, set.toString());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testForCellPhoneDuplicatesNotAllowed() {
		cellPhone1 = new CellPhone("Mi", "A5", "New i", "Windows", 5000);
		cellPhone2 = new CellPhone("Samsung", "s3", "gdf hgd", "Linux", 6000);
		cellPhone3 = new CellPhone("Nokia", "A10", "hf hdf", "Linux", 7000);
		Set<CellPhone> set = new HashSet<CellPhone>();
			set.add(cellPhone1);
			set.add(cellPhone2);
			set.add(cellPhone3);
			String setOfCellPhone="[CellPhone [company=Samsung, model=s3, description=gdf hgd, operatingSystem=Linux, price=6000.0],"
					+ " CellPhone [company=Nokia, model=A10, description=hf hdf, operatingSystem=Linux, price=7000.0],"
					+ " CellPhone [company=Mi, model=A5, description=New i, operatingSystem=Windows, price=5000.0]]";
			Assert.assertEquals(setOfCellPhone, set.toString());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testForSchoolDuplicatesNotAllowed() {
		school1 = new School("PJNV", "Pune", "Ambegaon", "A");
		school2 = new School("Nav bharat", "Mumbai", "Haveli", "B");
		school3 = new School("Babasaheb ambedkar", "Pune", "Thane", "A");
		school1 = new School("PJNV", "Pune", "Ambegaon", "B");
		Set<School> set = new HashSet<School>();
			set.add(school1);
			set.add(school2);
			set.add(school3);
			String setOfSchool="[School [name=PJNV, city=Pune, schoolDistrict=Ambegaon, greatSchoolRanking=B],"
					+ " School [name=Nav bharat, city=Mumbai, schoolDistrict=Haveli, greatSchoolRanking=B],"
					+ " School [name=Babasaheb ambedkar, city=Pune, schoolDistrict=Thane, greatSchoolRanking=A]]";
			Assert.assertEquals(setOfSchool, set.toString());
	}
	

	@SuppressWarnings("deprecation")
	@Test
	public void testForCarWithAscendingOrder() {
		car1 = new Car("BMW", "A5", 2018, 700000);
		car2 = new Car("BMW", "A5", 2017, 800000);
		car3 = new Car("Audi", "A7", 2017, 300000);
		car4 = new Car("Ferrari", "M5", 2018, 400000);
		Set<Car> set = new HashSet<Car>();
		set.add(car1);
		set.add(car2);
		set.add(car3);
		set.add(car4);
		String carListInAsc="[Car [make=Audi, model=A7, year=2017, price=300000.0],"
				+ " Car [make=Ferrari, model=M5, year=2018, price=400000.0],"
				+ " Car [make=BMW, model=A5, year=2018, price=700000.0]]";
		Assert.assertEquals(carListInAsc, set.toString());
	}
	
	
}
