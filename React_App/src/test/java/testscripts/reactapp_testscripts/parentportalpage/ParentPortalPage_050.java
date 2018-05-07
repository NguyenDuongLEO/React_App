package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_050 extends BaseTest {
    @Test
    public void verifyDateSubmittedChanged(){
        loginSuccessfully();
        driver.findElement(By.xpath("//td[@tabindex='3']/div")).click();
        try {
            driver.findElement(By.xpath("//td[@tabindex='3']/div")).sendKeys("03/01/2018 07:45 AM");
        }catch (Exception ex){ }
        checkingDateSubmittedChanged();
    }
    public void checkingDateSubmittedChanged() {
        waitElement();

        if(driver.findElement(By.xpath("//td[@tabindex='3']/div")).getText().toLowerCase().trim() == "03/01/2018 07:45 am"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_050 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_050 is FAILED!");
            System.out.println("======================");
            System.out.println("The Date Submitted is displayed: " + driver.findElement(By.xpath("//td[@tabindex='3']/div")).getText());
        }
    }
}
