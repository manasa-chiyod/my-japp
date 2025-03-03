package jproject_java;

import java.util.ResourceBundle;

public class japp {
	public int userlogin(String inuser, String inpwd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("conf");
		String un=rb.getString("username");
		String pwd=rb.getString("pass");
		if(inuser.equals(un)&&inpwd.equals(pwd))
			return 1;
		else
			return 0;
	}
}
