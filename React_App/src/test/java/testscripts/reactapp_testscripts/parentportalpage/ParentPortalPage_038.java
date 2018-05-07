package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_038 extends BaseTest {
    @Test
    public void verifyRequesterChanged(){
        loginSuccessfully();
        driver.findElement(By.xpath("//td[@tabindex='4']/div")).click();
        try {
            driver.findElement(By.xpath("//td[@tabindex='4']/div")).sendKeys("react@gmail.com");
        }catch (Exception ex){ }
        checkingRequesterChanged();
    }
    public void checkingRequesterChanged() {
        waitElement();

        if(driver.findElement(By.xpath("//td[@tabindex='4']/div")).getText().toLowerCase().trim() == "react@gmail.com"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_038 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_038 is FAILED!");
            System.out.println("======================");
            System.out.println("The Requester is displayed: " + driver.findElement(By.xpath("//td[@tabindex='4']/div")).getText());
        }
    }
}
