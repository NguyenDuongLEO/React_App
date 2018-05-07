package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_039 extends BaseTest {
    @Test
    public void verifyStudentIDChanged(){
        loginSuccessfully();
        driver.findElement(By.xpath("//td[@tabindex='5']")).click();
        try {
            driver.findElement(By.xpath("//td[@tabindex='5']")).sendKeys("1234567");
        }catch (Exception ex){ }
        checkingDateSubmittedChanged();
    }
    public void checkingDateSubmittedChanged() {
        waitElement();

        if(driver.findElement(By.xpath("//td[@tabindex='5']")).getText().toLowerCase().trim() == "1234567"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_039 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_039 is FAILED!");
            System.out.println("======================");
            System.out.println("The Student ID is displayed: " + driver.findElement(By.xpath("//td[@tabindex='5']")).getText());
        }
    }
}
