package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_044 extends BaseTest {
    @Test
    public void verifyUserChanged(){
        loginSuccessfully();
        driver.findElement(By.xpath("//td[@tabindex='10']")).click();
        try {
            driver.findElement(By.xpath("//td[@tabindex='10']")).sendKeys("ADMIN");
        }catch (Exception ex){}
        checkingUserChanged();
    }
    public void checkingUserChanged() {
        waitElement();

        if(driver.findElement(By.xpath("//td[@tabindex='10']")).getText().toLowerCase().trim() == "admin"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_044 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_044 is FAILED!");
            System.out.println("======================");
            System.out.println("The User is displayed: " + driver.findElement(By.xpath("//td[@tabindex='10']")).getText());
        }
    }
}
