package lessons.object_oriented;

import java.security.PublicKey;
import static lessons.object_oriented.Passenger.*;

public class Flight { //public is overal bruikbaar // acces modifiers= public - private
//fields	
	private int passengers, totalCheckedBags,
				seats=150; //fields
	 private int flightNumber;
	 private char flightClass;
	 private boolean[] isSeatAvailable = new boolean[seats];
	 private static int allPassengers, maxPassengerPerFlight;
	
	 {	//Initialization blocks worden altijd uitgevoerd als er een nieuw object van die class wordt aangemaakt
		 for (int i = 0; i < isSeatAvailable.length; i++) {
			isSeatAvailable[i]= true;
		}
	 }
	 
	 static {
		 maxPassengerPerFlight=80;
	 }
	 
//constructor worden uitgevoerd adhv signature tussen haakjes (type en aantal)
	 
	 public Flight() 	{}
	
	 public Flight(int flightNumber) {
		 this.flightNumber= flightNumber;
	 }
	 public Flight(char flightClass) {
		 this.flightClass=flightClass;
	 }
	 
//methods	
	 public boolean hasSeating() {
		if(getPassengers()<getSeats()) {
		return true;}
		return false;
		//return getPassengers()<getSeats() ;	//kortere methode
	}	
		
	public boolean hasSeating(int count) {
		return getPassengers()+ count<=getSeats();
	}
	
	public void addOnePassenger() {
		if(hasSeating()) {
			passengers +=1;
			setAllPassengers(getAllPassengers() + 1);
		} else {
			handleTooMany();
			
		}
	}
		//overloaden door dezelfde methodenaam met een andere signature, andere parameters
	public void addOnePassenger(int bags) {
		if(hasSeating()) {	//eerst checken of er plaats is voor de passagier anders ook geen bagage inchecken
		addOnePassenger();
		setTotalCheckedBags(getTotalCheckedBags() + bags);
		}
	}
	
	public void addOnePassenger(Passenger passengerObject) {
		addOnePassenger(passengerObject.getCheckBags());
	}
		
	public void addOnePassenger(int bags, int carryOns) {//meerdan 2 carryons worden checked bags
		if (carryOns<=2) {
			addOnePassenger(bags);
		} else {
			addOnePassenger(bags+= carryOns-2);
		}
	}

	public void addOnePassenger(Passenger passengerObject, int carryOns) {
		addOnePassenger(passengerObject.getCheckBags(),carryOns);
	}
		
		
		//private want enkel toepasbaar in deze class, niemand kan dit uitvoeren hierdoor
	private void handleTooMany() {
		System.out.println("Too much passengers");
	}
	
	public boolean hasRoom(Flight f2) {
		int total= this.passengers + f2.passengers;	//verwijst naar variabele in de class vanboven
		
//		if (seats>total) {
//			return true;
//		}
//		return false;	hetzelfde hieronder
		return total <= seats;	//resulteert een true/false
	}
	
	public static void swapFlight(Flight f1, Flight f2) {//werkt niet want waarden worden niet gekopieerd
		Flight f3 = f1;
		f1=f2;
		f2=f3;
	}
	
	public static void swapFlightNumbers(Flight f1, Flight f2) {//waarden worden uit flightnumber getrokken en omgewisseld
		int tempFlightNumber= f1.getFlightNumber();					// dmv hulpvariabele
		f1.setFlightNumber(f2.getFlightNumber());
		f2.setFlightNumber(tempFlightNumber);
	}
	//public void addPassengers(Passenger[] passengerList) {
	public void addPassengers(Passenger... passengerList) {
		if(hasSeating(passengerList.length)) {
			passengers+=passengerList.length;
			for (Passenger p1 : passengerList) {
				totalCheckedBags+=p1.getCheckBags();
			}
		}
	}
	
	
	public static void resetAllpassengers() {
		allPassengers=0;
	}
	
	@Override		//override methode
	public boolean equals(Object o) {
		if(o instanceof Flight) {
		Flight flight= (Flight) o;
		return flight.getFlightNumber()==this.flightNumber;
		}
		return false;
	}
	
	
	
//GETTER & SETTER
	public int getPassengers() {
		return this.passengers;
	}
	public void SetPassengers(int passengers) {
		this.passengers = passengers;
	}
	public int getSeats() {
		return this.seats;
	}
	public void SetSeats(int seats) {
		this.seats = seats;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public char getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(char flightClass) {
		this.flightClass = flightClass;
	}
	public boolean[] getIsSeatAvailable() {
		return isSeatAvailable;
	}
	public void setIsSeatAvailable(boolean[] isSeatAvailable) {
		this.isSeatAvailable = isSeatAvailable;
	}
	public static int getAllPassengers() {
		return allPassengers;
	}
	public static void setAllPassengers(int allPassengers) {
		Flight.allPassengers = allPassengers;
	}
	
	public int getTotalCheckedBags() {
		return totalCheckedBags;
	}
	public void setTotalCheckedBags(int totalCheckedBags) {
		this.totalCheckedBags = totalCheckedBags;
	}
	
	
	
	
	
}
