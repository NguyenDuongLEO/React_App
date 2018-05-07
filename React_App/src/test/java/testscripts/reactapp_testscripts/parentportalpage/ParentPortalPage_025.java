package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParentPortalPage_025 extends BaseTest {
    @Test
    public void verifyRequestStatusFilterRejected(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.requestStatusFilter.click();
        parentPortalPage.requestStatusFilterRejected.click();
        parentPortalPage.applyFilterButton.click();
        checkingRequestStatusFilterRejected();
    }
    public void checkingRequestStatusFilterRejected() {
        waitElement();
        int j=0;
        String[] listStringRequestStatus = new String [25];
        for (int i = 2; i <= 242; i = i + 10) {
            listStringRequestStatus[j] = driver.findElement(By.xpath("//tr/td[@tabindex='" + i + "']")).getText();
            j++;
        }
        Set<String> setRequestStatus = new HashSet<String>(Arrays.asList(listStringRequestStatus));
        Set<String> rejected = new HashSet<String>();
        rejected.add("Rejected");
        if(setRequestStatus == rejected &&
                driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText().toLowerCase().trim()=="request status: rejected"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_025 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_025 is FAILED!");
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
