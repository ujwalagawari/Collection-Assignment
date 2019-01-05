package com.cg.rmall.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ugawari
 *
 * Create class ParkedCarOwenerList which will have method’s int addNewCar(ParkedCarOwnerDetails obj),
 * removeCar(), getParkedCarLocation(token)
 */
public class ParkedCarOwenerList {

	public List<ParkedCarOwnerDetails> carList = new LinkedList<ParkedCarOwnerDetails>();
	
	
	private static final int TOTAL_TOKEN = 240;

	/**
	 * Adding new car to parking and assign token, location, section, floor to car 
	 * @param parkedCarOwnerDetails
	 * @return
	 */
	public int addNewCar(ParkedCarOwnerDetails parkedCarOwnerDetails){
		Collections.sort(carList);
		
		int section=0;
		outerloop:
		for(int tokens = 1; tokens <= TOTAL_TOKEN; tokens++){
			if(carList.isEmpty()){ //if their is no car in parking at that time assign then for first 
							//car token=1, location=1, section=1, floor=1 to car 
				parkedCarOwnerDetails.setToken(1);
				parkedCarOwnerDetails.setFloor(1);
				parkedCarOwnerDetails.setSection(1);
				parkedCarOwnerDetails.setLocation(1);
				break outerloop;
			}else{
				if(carList.size()>=tokens){
					if(tokens != carList.get(tokens-1).getToken()){
						setCarLocation(parkedCarOwnerDetails, tokens);
						break outerloop;
					}
				}else if(carList.size()+1 == tokens){
						setCarLocation(parkedCarOwnerDetails, tokens);
						break outerloop;
				}
			}
		}
		carList.add(parkedCarOwnerDetails);
		return parkedCarOwnerDetails.getToken();
	}
	
	private void setCarLocation(ParkedCarOwnerDetails parkedCarOwnerDetails, int tokens) {
		int section=0;
		parkedCarOwnerDetails.setToken(tokens);
		float sec =  ((float) tokens)/20;
		section = (int) Math.ceil(sec);
		if(section<=4){
			parkedCarOwnerDetails.setFloor(1);
			parkedCarOwnerDetails.setSection(section);
			while(tokens>20){
				tokens-=20;
			}
			parkedCarOwnerDetails.setLocation(tokens);
		}else if(section<=8 && section>4){
			parkedCarOwnerDetails.setFloor(2);
			parkedCarOwnerDetails.setSection(section-4);
			while(tokens>20){
				tokens-=20;
			}
			parkedCarOwnerDetails.setLocation(tokens);
		}else if(section<=12 && section>9){
			parkedCarOwnerDetails.setFloor(3);
			parkedCarOwnerDetails.setSection(section-8);
			while(tokens>20){
				tokens-=20;
			}
			parkedCarOwnerDetails.setLocation(tokens);
		}
	}

	/**
	 * Remove car from parking
	 * @param parkedCarOwnerDetails
	 */
	public void removeCar(int token){//by token
		for(ParkedCarOwnerDetails carDetails :  carList){
			if(carDetails.getToken() == token){
				carList.remove(carDetails);
				break;
			}
		}
	}
	/*public void removeCar(ParkedCarOwnerDetails parkedCarOwnerDetails){//by object
		carList.remove(parkedCarOwnerDetails);
	}*/
	
	/**
	 * Get details of parked car by using token number.
	 * @param token
	 * @return
	 */
	public ParkedCarOwnerDetails getParkedCarLocation(int token){
		 ParkedCarOwnerDetails parkedCarOwnerDetails = null;
		 for(ParkedCarOwnerDetails carDetails :  carList){
			 if(carDetails.getToken() == token){
				 //System.out.println(carDetails.toString());
				 parkedCarOwnerDetails = carDetails;
				 break;
			 }
		 }
		return parkedCarOwnerDetails;
	}
}



/*
public int addNewCar(ParkedCarOwnerDetails parkedCarOwnerDetails){
	Collections.sort(carList);
	
	int section=0;
	outerloop:
	for(int tokens = 1; tokens <= TOTAL_TOKEN; tokens++){
		if(carList.isEmpty()){ //if their is no car in parking at that time assign then for first 
						//car token=1, location=1, section=1, floor=1 to car 
			parkedCarOwnerDetails.setToken(1);
			parkedCarOwnerDetails.setFloor(1);
			parkedCarOwnerDetails.setSection(1);
			parkedCarOwnerDetails.setLocation(1);
			break outerloop;
		}else{
			if(carList.size()>=tokens){
				if(tokens != carList.get(tokens-1).getToken()){
					
					setCarLocation(parkedCarOwnerDetails, tokens);
					
					parkedCarOwnerDetails.setToken(tokens);
					float sec =  ((float) tokens)/20;
					section = (int) Math.ceil(sec);
					if(section<=4){
						parkedCarOwnerDetails.setFloor(1);
						parkedCarOwnerDetails.setSection(section);
						while(tokens>20){
							tokens-=20;
						}
						parkedCarOwnerDetails.setLocation(tokens);
					}else if(section<=8 && section>4){
						parkedCarOwnerDetails.setFloor(2);
						parkedCarOwnerDetails.setSection(section-4);
						while(tokens>20){
							tokens-=20;
						}
						parkedCarOwnerDetails.setLocation(tokens);
					}else if(section<=12 && section>9){
						parkedCarOwnerDetails.setFloor(3);
						parkedCarOwnerDetails.setSection(section-8);
						while(tokens>20){
							tokens-=20;
						}
						parkedCarOwnerDetails.setLocation(tokens);
					}
					break outerloop;
				}
			}else if(carList.size()+1 == tokens){
					parkedCarOwnerDetails.setToken(tokens);
					float sec =  ((float) tokens)/20;
					section = (int) Math.ceil(sec);
					if(section<=4){
						parkedCarOwnerDetails.setFloor(1);
						parkedCarOwnerDetails.setSection(section);
						while(tokens>20){
							tokens-=20;
						}
						parkedCarOwnerDetails.setLocation(tokens);
					}else if(section<=8 && section>4){
						parkedCarOwnerDetails.setFloor(2);
						parkedCarOwnerDetails.setSection(section-4);
						while(tokens>20){
							tokens-=20;
						}
						parkedCarOwnerDetails.setLocation(tokens);
					}else if(section<=12 && section>9){
						parkedCarOwnerDetails.setFloor(3);
						parkedCarOwnerDetails.setSection(section-8);
						while(tokens>20){
							tokens-=20;
						}
						parkedCarOwnerDetails.setLocation(tokens);
					}
					break outerloop;
			}
		}
	}
	
	carList.add(parkedCarOwnerDetails);
	return parkedCarOwnerDetails.getToken();
}*/
