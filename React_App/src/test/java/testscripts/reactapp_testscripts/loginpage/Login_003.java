package testscripts.reactapp_testscripts.loginpage;

import data.ReactAppData;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class Login_003 extends BaseTest {
    @Test
    public void verifyLoginSystemWithBlankPassword() {
        logInPage.inputEmail.sendKeys(ReactAppData.EMAILLOGIN);
        logInPage.inputPassword.sendKeys("");
        logInPage.submitLogInForm.click();
        checkingErrorMessage();
    }
    public void checkingErrorMessage(){
        if(logInPage.parentPortalAvailability.getText().trim().toLowerCase().equals("[ parent portal ]")) {
            System.out.println("======================");
            System.out.println("Test Case Login_003 is FAILED! Error Message is NOT displayed. Log In successfully");
            System.out.println("======================");
        }
        else if(logInPage.errorMessageShow.getText().trim().toLowerCase().equals("login error")){
            System.out.println("======================");
            System.out.println("Test Case Login_003 is PASSED! Error Message is displayed. Log In unsuccessfully");
            System.out.println("======================");
            System.out.println("Error Message is displayed '" +logInPage.errorMessageShow.getText()+"'");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case Login_003 is FAILED! Error Message is NOT displayed. Log In unsuccessfully");
            System.out.println("======================");
        }
    }
}
