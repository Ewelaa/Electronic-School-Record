package esr;

public class Subject {
	private String name;
	private int numberOfHours; //per week

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Subject [name=" + name + ", numberOfHours=" + numberOfHours + "]";
	}
	
	
}
