package com.willcode4coffee.observer;

import java.util.Observable;


public class Customer  implements Observer {
	
	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String name) { 
		this.name = name;
	}

	
	
	public void update(String seatStatus) {
	
		System.out.println("Hello " + name + ",Seat is now currently " + seatStatus);
	}

	
	
	
	

}
