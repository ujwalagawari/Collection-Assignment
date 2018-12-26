package com.cg.basicassignment.model;

/**
 * @author ugawari
 *
 * Class to create object of Car and having properties make, model, year, price
 */
public class Car implements Comparable<Car>{

	private String make;
	private String model;
	private int year;
	private double price;

	/**
	 * To initialize properties of Car class
	 * @param make
	 * @param model
	 * @param year
	 * @param price
	 */
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Creating hash code based on make and model
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	/**
	 * equals method to compare two object of laptop class based on make and model
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year
				+ ", price=" + price + "]";
	}


	@Override
	public int compareTo(Car car) {
		return make.compareTo(car.make);
	}


}
