package lessons.object_oriented;

public class auto {

	
	
//	maak deze oefening. maak een klasse auto auto dat  benzine consumeert als hij rijdt. 
//	maak methodes aan dat de auto zal rijden voor een aantal kilometers. en ook om de huidige afstand 
//	en het huidige benzine-niveau in de tank te verkrijgen. 
//	specifiëer het benzine verbruik (km per liter) in de constructor. 
	
	
	private double km=0.0d;
	private double usagePerKm = 0.0d;
	private double literintank = 0.0d;
	private double distance = 0.0d;
	private double maxLiters = 60.0d;
	
	public auto(){}

	
	public auto(double usagePerKm, double literInTank) {
		this.usagePerKm=usagePerKm;
		this.literintank= literInTank;
	}
	
	public void litersLeft() {
		literintank-=gasUsed();
	}
	
	public void drive(double km) {
		this.km = km;
		double maxDistance= literintank*usagePerKm;
		if (maxDistance>=km) {
		distance+=km;
		literintank-=gasUsed();
		System.out.println("Drive safe!");
		}
		else {
			System.err.println("Not enough fuel!!");
			
		}
	}
	
	public double gasUsed() {
		double result = km/usagePerKm;
		return result;
	}
	public double distanceInTank(auto auto1) {
		double result = auto1.getLiterintank()*auto1.getUsagePerKm();
		return result;
		
	}
	public void getFuel(double fuelAdded) {
		if (getMaxLiters()<literintank+fuelAdded) {
		literintank+=fuelAdded;
		}else {
			System.out.println("Tank not big enough");
		}
	}
	
	public double getLiterintank() {
		return literintank;
	}

	public void setLiterintank(double literintank) {
		this.literintank = literintank;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getUsagePerKm() {
		return usagePerKm;
	}

	public void setUsagePerKm(double usagePerKm) {
		this.usagePerKm = usagePerKm;
	}


	public double getMaxLiters() {
		return maxLiters;
	}
	
	
	
	
}
