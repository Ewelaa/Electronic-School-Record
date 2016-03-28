package esr;

import java.util.ArrayList;

public interface IAdmin {
	public static User AddUser(String userType)
	  {
	    if ( userType.equals("student") )
	    	return new Student();
	    else if ( userType.equals("teacher") )
	    	return new Teacher();
	    else if ( userType.equals("seretary") )
	    	return new Secretary();
	    
	    return null;
	  }
	
	public void RemoveUser();	
	public ArrayList<User> ListOfUsers();
	public String toString();

}
