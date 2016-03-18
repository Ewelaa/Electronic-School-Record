package esr;

public class Secretary extends User {
	private String name;
	private String surname;
	private String password;
	
	public void setName(String name){
		this.name = name;
	}
	public void setSurname(String surname){
		this.surname = surname;
	}
	public void setPassword(String password){
	this.password = password;
	}
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public String getPassword(){
		return password;
	}
}
