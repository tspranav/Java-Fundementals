package Week4.AssignmentsWeek4;

public class Nov29Vehicle {
	String colour;
	int wheels;
	int lights;
	private String RegNo;
	
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	Nov29Vehicle(){
		System.out.println("Trek has two wheels.");
		
	}
	Nov29Vehicle(String colour,int lights){
		System.out.println("Bike is "+colour+" in colour and has "+lights+" light.");
	}
	Nov29Vehicle(String colour,int lights,int wheels){
		System.out.println("Car is "+colour+" in colour and has "+lights+" lights and "+wheels+" wheels.");
	}

	public static void main(String[] args) {
		Nov29Vehicle trek = new Nov29Vehicle();
		Nov29Vehicle Bike = new Nov29Vehicle("Black",1);
		Nov29Vehicle Car = new Nov29Vehicle("Blue",2,4);
		Car.setRegNo("AP16 AZ2890");
		System.out.println(Car.getRegNo());
		Bike.setRegNo("TS08 NX1789");
		System.out.println(Bike.getRegNo());

	}

}
