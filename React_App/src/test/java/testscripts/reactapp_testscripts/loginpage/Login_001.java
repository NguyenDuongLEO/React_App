package testscripts.reactapp_testscripts.loginpage;

import org.testng.annotations.Test;
import testscripts.BaseTest;

public class Login_001 extends BaseTest {
    @Test
    public void verifyLoginSystemWithBlankFields() {
        logInPage.inputEmail.sendKeys("");
        logInPage.inputPassword.sendKeys("");
        logInPage.submitLogInForm.click();
        checkingErrorMessage();
    }
    public void checkingErrorMessage(){
        if(logInPage.parentPortalAvailability.getText().trim().toLowerCase().equals("[ parent portal ]")) {
            System.out.println("======================");
            System.out.println("Test Case Login_001 is FAILED! Error Message is NOT displayed. Log In successfully");
            System.out.println("======================");
        }
        else if(logInPage.errorMessageShow.getText().trim().toLowerCase().equals("login error")){
            System.out.println("======================");
            System.out.println("Test Case Login_001 is PASSED! Error Message is displayed. Log In unsuccessfully");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case Login_001 is FAILED! Error Message is NOT displayed. Log In unsuccessfully");
            System.out.println("======================");
        }
    }
}
