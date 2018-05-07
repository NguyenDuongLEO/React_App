package testscripts.reactapp_testscripts.loginpage;

import org.testng.annotations.Test;
import testscripts.BaseTest;

public class Login_005 extends BaseTest {
    @Test
    public void verifySignOutSuccessfully() {
        loginSuccessfully();
        parentPortalPage.adminButton.click();
        parentPortalPage.signOutButton.click();
        checkingSignOutSuccessfully();
    }

    public void checkingSignOutSuccessfully(){
        if(logInPage.logInTitle.getText().trim().toLowerCase().equals("log in")) {
            System.out.println("======================");
            System.out.println("Test Case Login_005 is PASS! Sign Out successfully");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case Login_005 is FAILED! Sign Out unsuccessfully");
            System.out.println("======================");
        }
    }
}
