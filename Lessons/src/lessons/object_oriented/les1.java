package lessons.object_oriented;

import static lessons.object_oriented.Flight.*;

import javax.management.loading.PrivateClassLoader;
import javax.swing.SwingConstants;

import CalcEngineClass.CalculateBase;
import operations.Adder;
import operations.Divider;



public class les1 {

	
	public static void main(String[] args) {
		//flight is een referenced type naar een aparte class
		Flight nycToLv= new Flight();
		nycToLv.addOnePassenger();
	//	System.out.println(nycToLv.passengers);
	
		Flight flight1 = new Flight();
		Flight flight2 = new Flight();
		
		flight2.addOnePassenger();
		flight1=flight2;	//waarde wordt niet gekopieerd maar verwijst naar
		
		flight1.addOnePassenger(); //zowel bij flight1 en flight2
		
		
	//	System.out.println(flight1.passengers);	
	//	System.out.println(flight2.passengers);	

	
	//this
		//System.out.println(flight1.hasRoom(flight2));
		
	//null
		Flight flight3 = new Flight();
		Flight flight4 = new Flight();
	
		Flight combinedFlight = null;
		
//		if (flight3.hasRoom(flight4)){
//			combinedFlight= flight3.createNewWithBoth(flight4);
//		}
	
//		if(combinedFlight != null) {
//			System.out.println("Flights combined");
//		}
	
	
	
	//nieuwe variabele van type passenger, in een andere class
	Passenger bob = new Passenger();
	Passenger oscaré = new Passenger(3);
	
//	System.out.println(oscar.getCheckBags());
//	System.out.println(oscar.getPerBagFee());
	
	Flight f1= new Flight('c');
	Flight f2= new Flight(8);
	
	Flight f3 = new Flight();
	Flight f4 = new Flight();
	f3.addOnePassenger();
	f4.addOnePassenger();
	
	System.out.println(Flight.getAllPassengers());
	Flight.resetAllpassengers();
	System.out.println(Flight.getAllPassengers());
	
	Flight f5= new Flight(10);	//variabele f5 wijst naar object f5
	Flight f6= new Flight(20);
	//f5=f6; 				//waarde wordt niet gekopieerd maar naar gereferentieerd variabele f5 wijst naar object f6
	
	f5.addOnePassenger();
	f5.addOnePassenger();
	f6.addOnePassenger();//aantal passengers in f6 =3
	
	System.out.println(f6.getPassengers());
	
	swapFlight(f5,f6);	//werkt niet correct 
	System.out.println();
	
	swapFlightNumbers(f5, f6);
	
	System.out.println(f5.getFlightNumber());
	System.out.println(f6.getFlightNumber());
	
	System.out.println("***********");
	
	Flight ff3= new Flight();
	ff3.addOnePassenger();
	System.out.println(ff3.getPassengers());
	
	ff3.addOnePassenger(3);
	System.out.println(ff3.getTotalCheckedBags());
	
	Passenger p1= new Passenger(1,0);
	ff3.addOnePassenger(p1);
	System.out.println(ff3.getPassengers());
	
	Passenger p2= new Passenger(2,0);
	ff3.addOnePassenger(p2, 4);
	System.out.println(ff3.getPassengers());
	
	short threeBags = 3;
	ff3.addOnePassenger(threeBags,2);//wordt automatisch geconverteerd naar int
	
	double fourBags = 4;
	int convertedFourbags = (int)fourBags;
	ff3.addOnePassenger(convertedFourbags,2);//wordt gecast naar int
	
	Passenger oscar = new Passenger(1,0);
	Passenger bjorn = new Passenger(2,0);
	Flight ff9= new Flight();
	
	
	//Passenger luc = new Passenger(3,0);
	//ff9.addPassengers(new Passenger[] {oscar,bjorn});
	//ff9.addPassengers(oscar,bjorn,luc);	//zonder specificatie array
	System.out.println(ff9.getPassengers()+" passagiers met "+ff9.getTotalCheckedBags()+" stukken bagage");
	
	
	System.out.println("*******inheritence******");
	CargoFlight cf1= new CargoFlight();
	cf1.addOnepackage(10.0f, 2.5f, 3.0f);
	System.out.println(cf1.usedCargoSpace);
	
	Passenger luc= new Passenger(2,0);
	cf1.addOnePassenger(luc);	//alle methods van de parent class werken ook in de child
	System.out.println(cf1.getTotalCheckedBags());
	
	Flight ff4 = new CargoFlight();	//ff4 kent enkel de fields van de Flight class
	
	Flight[] squadron = new Flight[5];	//mogelijkheid om binnen dezelfde array verschillende parent/child class objecten
	squadron[0]= new Flight();
	squadron[1]= new CargoFlight();
	squadron[2] = new CargoFlight();
	squadron[3]= new Flight();
	squadron[4] = new CargoFlight();
	
	Flight ff5 = new Flight();
	System.out.println(ff5.getSeats());		//print seats 150 van Flight
	
	CargoFlight cf2 = new CargoFlight();
	System.out.println(cf2.getSeats());	//print 12 van cargoflight
	
	Flight ff6 = new CargoFlight();
	//System.out.println(ff6.seats());	//print 150 van flightclass als niet private object
	System.out.println(ff6.getSeats());	//print 12 van child

	cf1.addOnePassenger();
	//eerst wordt gezocht naar method binnen de child, indien niet gevonden wordt in de parent class gezocht
	
	
	
	
	
	System.out.println("******** gebruik van classes adder/divider/subtracter/multiplier **********");
	
	Divider divider = new Divider();
	doCalculations(divider, 100.0d, 50.0d);
	
	Adder adder = new Adder();
	doCalculations(adder, 25.0, 92.0);
	
	System.out.println("*****object class staat boven elke aangemaakte class*******");
	
	Object[] stuff = new Object[3];	//objectarray aanmaken zonder gedefinieerde objecten
	stuff[0] = new Flight();	//toewijzing van verschillende variabele van verschillende classes
	stuff[1] = new Passenger(2,0);
	stuff[2] = new CargoFlight();
	
	Object o = new Passenger();
	o= new Flight();	//object verwijst eerst naar passenger daarna naar flight
	o= new Flight[5];
	

	Object obj1 = new CargoFlight();
	//obj1.addOnePackage(); methods niet op te roepen
	if (obj1 instanceof CargoFlight) {
	CargoFlight cf4 = (CargoFlight) obj1;	//casten naar het type om methods op te roepen
	cf4.addOnepackage(1.0f, 2.5f, 3.0f);
	}
	
	Flight f11= new Flight(175);
	Flight f12= new Flight(175);
	
	if(f11==f12) {
		System.out.println("equals");
	} else{
		System.out.println("false");
	}
	if(f11.equals(f12)) {
		System.out.println("equal flightnumbers");
	} else{
		System.out.println("false");
	}
	
	System.out.println("------ Oefening auto class --------");
	auto lambo = new auto(16,30);
	System.out.println(lambo.distanceInTank(lambo));
	lambo.drive(100);
	System.out.println(lambo.gasUsed());
	System.out.println(lambo.getLiterintank());
	
	
	
	
	
	
	
	
	
	
	
	
	}
	private static void doCalculations(CalculateBase calculation, double leftVal, double rightVal) {
		calculation.setLeftVal(leftVal);
		calculation.setRightVal(rightVal);
		calculation.Calculate();		//voert de juiste methode uit adhv objecttype
		System.out.println(calculation.getResult());
	}
	
	}

