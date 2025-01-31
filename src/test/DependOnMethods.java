package test;

import org.testng.annotations.Test;

public class DependOnMethods {
	
	@Test
	public void logIn() {
		System.out.println("Login Successfully");
	}
	@Test(dependsOnMethods= {"logIn","Executed"})
	public void logOff() {
		System.out.println("LogOff successfully");
	}
	@Test(dependsOnMethods= {"logIn"})
	public void Executed() {
		System.out.println("Code is executed successfully");
	}

}
