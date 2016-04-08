package esr;

public class AuxClass {
	private static Centralizer c;
	public AuxClass(){
		c = Centralizer.getInstance();
	}
	public static Centralizer getCentralizer(){
		return c;
	}

	
}
