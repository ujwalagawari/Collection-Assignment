package com.cg.basicassignment.model;

/**
 * @author ugawari
 *
 * Class to create object of school and having properties name, city, school district, greatSchoolRanking 
 */
public class School {

	private String name;
	private String city;
	private String schoolDistrict;
	private String greatSchoolRanking;
	
	public School(String name, String city, String schoolDistrict, String greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public String getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(String greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

	/**
	 * Creating hash code based on City name and School name
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((schoolDistrict == null) ? 0 : schoolDistrict.hashCode());
		return result;
	}

	/**
	 * equals method to compare two object of laptop class based on city name and school name
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolDistrict == null) {
			if (other.schoolDistrict != null)
				return false;
		} else if (!schoolDistrict.equals(other.schoolDistrict))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict="
				+ schoolDistrict + ", greatSchoolRanking=" + greatSchoolRanking
				+ "]";
	}
	
}
