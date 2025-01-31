package test;

import org.testng.annotations.Test;

public class Day4 {
	
	@Test(groups= {"Smoke"})
	public void smoke1() {
		System.out.println("Run smoke1");
	}
	@Test(groups= {"Smoke"})
	public void smoke2() {
		System.out.println("Run smoke2");
	}
	@Test(groups= {"Smoke1"})
	public void regression() {
		System.out.println("Run Smoke1");
	}
	@Test(groups= {"Smoke1"})
	public void regression1() {
		System.out.println("Run Regression1");
	}

}
