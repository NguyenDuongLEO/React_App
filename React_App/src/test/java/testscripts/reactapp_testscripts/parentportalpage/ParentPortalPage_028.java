package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParentPortalPage_028 extends BaseTest {
    @Test
    public void verifyRequestFilterWhichNOTContainsInRequestColumn(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.emailFilter.sendKeys("111@gmail.com");
        parentPortalPage.applyFilterButton.click();
        checkingRequestFilterWhichNOTContainsInRequestColumn();
    }
    public void checkingRequestFilterWhichNOTContainsInRequestColumn() {
        waitElement();
        int j=0;
        String[] listStringEmail = new String [25];
        for (int i = 4; i <= 244; i = i + 10) {
            listStringEmail[j] = driver.findElement(By.xpath("//tr/td[@tabindex='" + i + "']")).getText();
            j++;
        }
        Set<String> setRequestStatus = new HashSet<String>(Arrays.asList(listStringEmail));
        Set<String> requesterEmail = new HashSet<String>();
        requesterEmail.add("");
        if(setRequestStatus == requesterEmail &&
                driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText().toLowerCase().trim()=="email: 111@gmail.com"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_028 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_028 is FAILED!");
            System.out.println("======================");
            System.out.println("Query Filter is displayed: " + driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText());
            System.out.println("Requester/Email column is displayed: ");
            for(Object object : setRequestStatus) {
                String requestStatusOneByOne = (String) object;
                System.out.println(requestStatusOneByOne);
            }
        }
    }
}
