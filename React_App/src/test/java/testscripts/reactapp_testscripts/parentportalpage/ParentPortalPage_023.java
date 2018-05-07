package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParentPortalPage_023 extends BaseTest {
    @Test
    public void verifyRequestStatusFilterDenied(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.requestStatusFilter.click();
        parentPortalPage.requestStatusFilterDenied.click();
        parentPortalPage.applyFilterButton.click();
        checkingRequestStatusFilterDenied();
    }
    public void checkingRequestStatusFilterDenied() {
        waitElement();
        int j=0;
        String[] listStringRequestStatus = new String [25];
        for (int i = 2; i <= 242; i = i + 10) {
            listStringRequestStatus[j] = driver.findElement(By.xpath("//tr/td[@tabindex='" + i + "']")).getText();
            j++;
        }
        Set<String> setRequestStatus = new HashSet<String>(Arrays.asList(listStringRequestStatus));
        Set<String> denied = new HashSet<String>();
        denied.add("Denied");
        if(setRequestStatus == denied &&
                driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText().toLowerCase().trim()=="request status: denied"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_023 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_023 is FAILED!");
            System.out.println("======================");
            System.out.println("Query Filter is displayed: " + driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText());
            System.out.println("Request Status column is displayed: ");
            for(Object object : setRequestStatus) {
                String requestStatusOneByOne = (String) object;
                System.out.println(requestStatusOneByOne);
            }
        }
    }
}
