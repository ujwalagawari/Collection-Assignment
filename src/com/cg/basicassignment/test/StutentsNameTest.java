package com.cg.basicassignment.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StutentsNameTest {

	private List<String> list;
	private TreeSet<String> set;
	private Map<String, String> map;
	
	@Before
	public void setUp(){
		list = new ArrayList<String>();
		list.add("Ujwala");
		list.add("Shubham");
		list.add("Mrudula");
		list.add("Hema");
		list.add("Shrivani");
		list.add("Priyanka");
		
		set = new TreeSet<String>();
		set.add("Ujwala");
		set.add("Shubham");
		set.add("Mrudula");
		set.add("Hema");
		set.add("Shrivani");
		set.add("Priyanka");
		
		map=new HashMap<String, String>();
		map.put("Ujwala", "Mango");
		map.put("Shubham", "Apple");
		map.put("Mrudula", "Pineple");
		map.put("Hema", "Guva");
		map.put("Shrivani", "Apple");
		map.put("Priyanka", "Mango");
	}
	
	@Test
	public void testForInsertionOrderUsingList() {
		String namesOfStudent = "[Ujwala, Shubham, Mrudula, Hema, Shrivani, Priyanka]";
		Assert.assertEquals(namesOfStudent, list.toString());
	}
	
	@Test
	public void testForAscendingOrderUsingSort() {
		Collections.sort(list);
		String namesOfStudent = "[Hema, Mrudula, Priyanka, Shrivani, Shubham, Ujwala]";
		Assert.assertEquals(namesOfStudent, list.toString());
	}
	
	// OR By using tree set
	@Test
	public void testForInsertionOrderUsingTreeset() {
		String namesOfStudent = "[Ujwala, Shubham, Mrudula, Hema, Shrivani, Priyanka]";
		Assert.assertEquals(namesOfStudent, set.toString());
	}
	
	@Test
	public void testForAscendingOrderusingTreeset() {
		String namesOfStudent = "[Hema, Mrudula, Priyanka, Shrivani, Shubham, Ujwala]";
		Assert.assertEquals(namesOfStudent, set.toString());
	}
	
	// Create a simple map to store all of our class students’ names and their favorite fruits
	
	@Test
	public void testToGetFavoriteFruitByName() {
		String expected = "Mango";
		Assert.assertEquals(expected, map.get("Ujwala"));
	}
	
	@Test
	public void testToGetFavoriteFruitByNameToAll() {
		
		for(Entry<String, String> name : map.entrySet()){
			String nameWithFruit = name.getKey()+"'s  favorite fruit is : "+name.getValue();
			//System.out.println(nameWithFruit);
		}
		
	}
	
}
