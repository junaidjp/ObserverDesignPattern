package com.willcode4coffee.observer;

public class ObserverDesignPattern {
	
	public static void main(String args[]) { 
		
		Customer customerone = new Customer("Juna");
		Customer customerTwo = new Customer("Saub");
		Customer customerThree = new Customer("Hamza");
		
		SeatEngine seatEngine = new SeatEngine("windowseat","Not available");
		
		seatEngine.registerObserver(customerone);
		seatEngine.registerObserver(customerTwo);
		seatEngine.registerObserver(customerThree);
		
		seatEngine.setSeatStatus("Available");
		
		
		
	}

}
