package lessons.object_oriented;

import java.security.PublicKey;

import javax.management.loading.PrivateClassLoader;

public class Passenger {

		
	private int checkBags;
	private int freeBags;
	private double perBagFee;
	
	//lege contructor
	Passenger() {
		}
	//constructor met int die wordt toegewezen aan checkBags
	public Passenger(int checkBags){
		this(checkBags <3 ? 0.50d : 0.25d); // andere constructor oproepen met resultaat een double
		this.checkBags= checkBags;
	}
		
	public Passenger(double perBagFee) {
		this.perBagFee = perBagFee;
	}
	public Passenger(int checkBags, int freeBags) {
		this(checkBags);	//andere constructor oproepen altijd op 1e lijn
		this.freeBags= freeBags;
	}
	
	public int getCheckBags() {
		return checkBags;
	}
	public void setCheckBags(int checkBags) {
		this.checkBags = checkBags;
	}

	public int getFreeBags() {
		return freeBags;
	}

	public void setFreeBags(int freeBags) {
		this.freeBags = freeBags;
	}
	public double getPerBagFee() {
		return perBagFee;
	}
	public void setPerBagFee(double perBagFee) {
		this.perBagFee = perBagFee;
	}
		
	

}
