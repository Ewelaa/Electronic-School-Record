package esr;

public abstract class User {
	private String login;
	private String name;
	private String surname;
	private String password;
	
	public void setLogin(String login){
	this.login = login;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSurname(String surname){
		this.surname = surname;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getLogin(){
		return login;
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

	public String toString() {
		return "User [login=" + login + ", name=" + name + ", surname=" + surname + ", password=" + password + "]";
	}
	
	
}
