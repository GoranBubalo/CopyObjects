package copyObjects;

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	//Constructor 
	Car(){};
	
	Car(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	};
	
	
	//Getter method 
	public String getMake(){
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	//Setter method 
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//Copy method
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
	//Overloaded constructor
	Car(Car x ){
		//copy method 
		this.copy(x);
	}
	
	
}
