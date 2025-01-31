package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameteriseAnnotation {

    @Test
    @Parameters({"UserID", "Password"})
    public void testEnvironment(String UserID, String Password) {
        System.out.println("LogIn userID is: " + UserID);
        System.out.println("LogIn password is: " + Password);
    }
}
