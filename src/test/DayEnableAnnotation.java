package test;

import org.testng.annotations.Test;

public class DayEnableAnnotation {
	
	@Test
	public void Day1() {
		System.out.println("Day1 is executed");
	}
	@Test(enabled=false)
	public void Day2() {
		System.out.println("Day2 is executed");
	}
	@Test
	public void Day3() {
		System.out.println("Day3 is executed");
	}

}
