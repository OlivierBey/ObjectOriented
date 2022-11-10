package lessons.object_oriented;

public class CargoFlight extends Flight {	//FLight is de parent class van cargoflight child class

	float maxCargoSpace= 1000;
	float usedCargoSpace;
	private int seats = 12;	//cargoflicht seatss bepalen op 12 ipv de flight class =150
	
	public void addOnepackage(float h, float w, float d) {
		float size = h*w*d;
		if (cargoHasSpace(size)) {
		usedCargoSpace+=size;
		}else {
			hasNoSpace();
		}
	}
	public boolean cargoHasSpace(float size) {
		return usedCargoSpace+size<=maxCargoSpace;
	}

	public void hasNoSpace() {
		System.out.println("Not enough space");
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
