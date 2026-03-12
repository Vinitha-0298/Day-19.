package Sampletest;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class Parameterss {
	
	@Test
	@Parameters({"userName","password","screensize"})
	public void loginTest(String userName,String password,String screensize) {
		System.out.println("Username is: "+userName);
		System.out.println("Password is: "+password);
		System.out.println("Screensize is: "+screensize);
	}
}



