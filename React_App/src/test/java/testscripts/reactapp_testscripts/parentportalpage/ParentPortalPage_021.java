package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParentPortalPage_021 extends BaseTest {
    @Test
    public void verifyRequestStatusFilterAll(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.requestStatusFilter.click();
        parentPortalPage.requestStatusFilterAll.click();
        parentPortalPage.applyFilterButton.click();
        checkingRequestStatusFilterAll();
    }
    public void checkingRequestStatusFilterAll(){
        waitElement();
        int j=0;
        String[] listStringRequestStatus = new String [25];
        for (int i = 2; i <= 242; i = i + 10) {
            listStringRequestStatus[j] = driver.findElement(By.xpath("//tr/td[@tabindex='" + i + "']")).getText();
            j++;
        }
        Set<String> setRequestStatus = new HashSet<String>(Arrays.asList(listStringRequestStatus));
        Set<String> compare = new HashSet<String>();
        compare.add("Rejected");
        compare.add("Inactive");
        compare.add("Approved");
        compare.add("Denied");
        compare.add("Pending");
        String result;
        boolean flag = true;
        for (String element : setRequestStatus){
            result = compare.contains(element) ? "Yes" : "No";
            if (result=="Yes"){
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_021 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_021 is FAILED!");
            System.out.println("======================");
            System.out.println("Request Status column is displayed: ");
            for(Object object : setRequestStatus) {
                String requestStatusOneByOne = (String) object;
                System.out.println(requestStatusOneByOne);
            }
        }
    }
}
