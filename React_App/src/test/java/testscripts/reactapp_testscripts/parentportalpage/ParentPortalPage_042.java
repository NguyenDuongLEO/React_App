package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_042 extends BaseTest {
    @Test
    public void verifyDOBChanged(){
        loginSuccessfully();
        driver.findElement(By.xpath("//td[@tabindex='8']/div")).click();
        try {
            driver.findElement(By.xpath("//td[@tabindex='8']/div")).sendKeys("09/18/2017");
        }catch (Exception ex){}
        checkingDOBChanged();
    }
    public void checkingDOBChanged() {
        waitElement();

        if(driver.findElement(By.xpath("//td[@tabindex='8']/div")).getText().toLowerCase().trim() == "09/18/2017"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_042 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_042 is FAILED!");
            System.out.println("======================");
            System.out.println("The DOB is displayed: " + driver.findElement(By.xpath("//td[@tabindex='8']/div")).getText());
        }
    }
}
