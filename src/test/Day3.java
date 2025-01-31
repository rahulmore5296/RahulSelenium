package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void levelManager() {
		System.out.println("Its a management level");
	}

	@Test
	public void levelLead() {
		System.out.println("Its Team lead level");
	}

	@BeforeMethod
	public void beforeEveryMothod() {
		System.out.println("It will execute before every method");
	}
	
	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("I will execute after every method");
	}
	@BeforeSuite
	public void beforeSuiteRun() {
		System.out.println("It will execute before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("It will run after suite");
	}

	@Test
	public void teamMember() {
		System.out.println("All are team member");
		Assert.assertTrue(false);
	}

	@Test
	public void projectGroup() {
		System.out.println("Its a whole project");
	}

}
