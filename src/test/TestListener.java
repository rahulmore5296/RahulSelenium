package test;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is started successfully");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed");
	}

	

}
