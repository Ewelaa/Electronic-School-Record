package esr;

import java.util.ArrayList;

public class Admin extends User implements IAdmin {

	public User AddUser(String userType)
	  {
	    if ( userType.equals("student") )
	    	return new Student();
	    else if ( userType.equals("teacher") )
	    	return new Teacher();
	    else if ( userType.equals("seretary") )
	    	return new Secretary();
	    
	    return null;
	  }

	public void RemoveUser(User user) {
		(AuxClass.getCentralizer()).getAllUsers().remove(user);
	}
	
	public ArrayList<User> showListOfUsers() {
		//System.out.println((AuxClass.getCentralizer()).getAllUsers());
		return AuxClass.getCentralizer().getAllUsers() ;
	}

}
