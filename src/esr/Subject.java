package esr;

public class Subject {
	private String subjectName;
	private int nrOfHours; //per week

	public String getName() {
		return subjectName;
	}

	public void setName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getNumberOfHours() {
		return nrOfHours;
	}

	public void setNumberOfHours(int nrOfHours) {
		this.nrOfHours = nrOfHours;
	}

	public String toString() {
		return "Subject [name=" + subjectName + ", numberOfHours=" + nrOfHours + "]";
	}
	
	
	
}
