package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	
	@Test(dataProvider="CandidateRole" )
	public void ProvideData(String NameIS, String Role) {
		System.out.println("Hello : "+  NameIS);
		System.out.println("Your role is : "+ Role);
	}
	
	@DataProvider(name="CandidateRole")
	public Object[][] getData(){
		Object[][] myData = new Object[4][2];
		myData[0][0]="Pramod";
		myData[0][1]="Automation Tester";
		
		myData[1][0]="Vijay";
		myData[1][1]="SAAP";
		
		myData[2][0]="Shubham";
		myData[2][1]="Package App Developer";
		
		myData[3][0]="Sandeep";
		myData[3][1]="Matlab Developer";
		return myData;
	}

}
