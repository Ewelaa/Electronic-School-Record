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

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public String toString() {
		return "Subject [name=" + name + ", numberOfHours=" + numberOfHours + "]";
	}
	
	
	
}
