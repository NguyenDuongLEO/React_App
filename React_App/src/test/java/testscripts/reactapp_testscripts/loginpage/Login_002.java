package testscripts.reactapp_testscripts.loginpage;

import data.ReactAppData;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class Login_002 extends BaseTest {
    @Test
    public void verifyLoginSystemWithBlankEmail() {
        logInPage.inputEmail.sendKeys("");
        logInPage.inputPassword.sendKeys(ReactAppData.PASSWORDLOGIN);
        logInPage.submitLogInForm.click();
        checkingErrorMessage();
    }
    public void checkingErrorMessage(){
        if(logInPage.parentPortalAvailability.getText().trim().toLowerCase().equals("[ parent portal ]")) {
            System.out.println("======================");
            System.out.println("Test Case Login_002 is FAILED! Error Message is NOT displayed. Log In successfully");
            System.out.println("======================");
        }
        else if(logInPage.errorMessageShow.getText().trim().toLowerCase().equals("login error")){
            System.out.println("======================");
            System.out.println("Test Case Login_002 is PASSED! Log In unsuccessfully");
            System.out.println("======================");
            System.out.println("Error Message is displayed '" +logInPage.errorMessageShow.getText()+"'");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case Login_002 is FAILED! Error Message is NOT displayed. Log In unsuccessfully");
            System.out.println("======================");
        }
    }
}
