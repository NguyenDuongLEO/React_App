package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_040 extends BaseTest {
    @Test
    public void verifyFirstNameChanged(){
        loginSuccessfully();
        driver.findElement(By.xpath("//td[@tabindex='6']")).click();
        try {
            driver.findElement(By.xpath("//td[@tabindex='6']")).sendKeys("React11");
        }catch (Exception ex){}
        checkingFirstNameChanged();
    }
    public void checkingFirstNameChanged() {
        waitElement();

        if(driver.findElement(By.xpath("//td[@tabindex='6']")).getText().toLowerCase().trim() == "react11"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_040 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_040 is FAILED!");
            System.out.println("======================");
            System.out.println("The First Name is displayed: " + driver.findElement(By.xpath("//td[@tabindex='6']")).getText());
        }
    }
}
