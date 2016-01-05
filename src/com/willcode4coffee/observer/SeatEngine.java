package com.willcode4coffee.observer;

import java.util.ArrayList;
import java.util.List;


public class SeatEngine {

	
	List<Observer> observers = new ArrayList<Observer>();
	public String seatType; 
	public String seatStatus;
	
	
	
	public String getSeatType() {
		return seatType;
	}



	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}





	public String getSeatStatus() {
		return seatStatus;
	}



	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
		notifyObservers();  
	}



	


	private void notifyObservers() {
		System.out.println("Notifying to all the passengers  when seat  becames available");  
        for (Observer ob : observers) {  
            ob.update(this.seatStatus);  
     }  


		
	}



	public SeatEngine(String seatType, String seatStatus) {
 
		 this.seatType = seatType;
		 this.seatStatus = seatStatus;
	}



	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

}
