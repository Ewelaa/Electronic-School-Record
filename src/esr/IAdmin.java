package esr;

import java.util.ArrayList;

public interface IAdmin {
	public User AddUser(String userType);
	public void RemoveUser(User user);	
	public ArrayList<User> showListOfUsers();
	public String toString();

}
