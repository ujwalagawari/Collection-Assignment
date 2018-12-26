/**
 * There is parking slot available in R-Mall with 3 floors; each floor has 4 sections and each section can maximum park 20 cars.
 * You need to design one application which will maintain all car details in such way when ever 
 * car owner arrives to collect his car your application should provide details including where it is located. 
 * a.	Create class Parked_CarOwner_Details which will have field’s owerName, carModel, carNO, owerMobileNo,
 * owerAddress with setter and getter methods.
 * b.	Create class Parked_CarOwenerList which will have method’s int add_new_car(Parked_CarOwner_Details obj),
 * remove_car(), get_parked_car_location(token)
 
 */
package com.cg.rmall.model;

/**
 * @author ugawari
 *
 */
public class ParkedCarOwnerDetails implements Comparable<ParkedCarOwnerDetails>{	
	
	private String carNo;
	private String ownerName;
	private String carModel;
	private String ownerMobileNo;
	private String ownerAddress;

	private int token;
	private int section;
	private int floor;
	private int location;
	
	public ParkedCarOwnerDetails(String carNo, String ownerName, String carModel, String ownerMobileNo, String ownerAddress) {
		this.carNo = carNo;
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(String ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((carModel == null) ? 0 : carModel.hashCode());
		result = prime * result + ((carNo == null) ? 0 : carNo.hashCode());
		result = prime * result
				+ ((ownerAddress == null) ? 0 : ownerAddress.hashCode());
		result = prime * result
				+ ((ownerMobileNo == null) ? 0 : ownerMobileNo.hashCode());
		result = prime * result
				+ ((ownerName == null) ? 0 : ownerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParkedCarOwnerDetails other = (ParkedCarOwnerDetails) obj;
		if (carModel == null) {
			if (other.carModel != null)
				return false;
		} else if (!carModel.equals(other.carModel))
			return false;
		if (carNo == null) {
			if (other.carNo != null)
				return false;
		} else if (!carNo.equals(other.carNo))
			return false;
		if (ownerAddress == null) {
			if (other.ownerAddress != null)
				return false;
		} else if (!ownerAddress.equals(other.ownerAddress))
			return false;
		if (ownerMobileNo == null) {
			if (other.ownerMobileNo != null)
				return false;
		} else if (!ownerMobileNo.equals(other.ownerMobileNo))
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}

	
	public int getToken() {
		return token;
	}

	
	public void setToken(int token) {
		this.token = token;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	@Override
	public int compareTo(ParkedCarOwnerDetails carOwnerDetails) {
		return this.getToken()-carOwnerDetails.getToken();
	}

	@Override
	public String toString() {
		return "ParkedCarOwnerDetails [carNo=" + carNo + ", ownerName="
				+ ownerName + ", carModel=" + carModel + ", ownerMobileNo="
				+ ownerMobileNo + ", ownerAddress=" + ownerAddress + ", token="
				+ token + ", section=" + section + ", floor=" + floor
				+ ", location=" + location + "]";
	}

	
}
