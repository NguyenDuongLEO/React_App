package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_041 extends BaseTest {
    @Test
    public void verifyLastNameChanged(){
        loginSuccessfully();
        driver.findElement(By.xpath("//td[@tabindex='7']")).click();
        try {
            driver.findElement(By.xpath("//td[@tabindex='7']")).sendKeys("React11");
        }catch (Exception ex){}
        checkingLastNameChanged();
    }
    public void checkingLastNameChanged() {
        waitElement();

        if(driver.findElement(By.xpath("//td[@tabindex='7']")).getText().toLowerCase().trim() == "react11"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_041 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_041 is FAILED!");
            System.out.println("======================");
            System.out.println("The Last Name is displayed: " + driver.findElement(By.xpath("//td[@tabindex='7']")).getText());
        }
    }
}
