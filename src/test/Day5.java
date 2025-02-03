package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day5 {
	@Test
	public void levelManager() {
		System.out.println("Its a management level");
	}

	@Test
	public void levelLead() {
		System.out.println("Its Team lead level");
		System.out.println("Working on project");
		System.out.println("Working on project");
		System.out.println("Working on project");
		System.out.println("successfully pull");
	}

	@BeforeMethod
	public void beforeEveryMothod() {
		System.out.println("It will execute before every method");
	}

}
