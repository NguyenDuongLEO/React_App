package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParentPortalPage_032 extends BaseTest {
    @Test
    public void verifyStudentFNFilterWhichNOTContainsInRequestColumn(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.studentFirstNameFilter.sendKeys("Tuan111");
        parentPortalPage.applyFilterButton.click();
        checkingStudentFNFilterWhichNOTContainsInRequestColumn();
    }
    public void checkingStudentFNFilterWhichNOTContainsInRequestColumn() {
        waitElement();
        int j=0;
        String[] listStringEmail = new String [25];
        for (int i = 6; i <= 246; i = i + 10) {
            listStringEmail[j] = driver.findElement(By.xpath("//tr/td[@tabindex='" + i + "']")).getText();
            j++;
        }
        Set<String> setRequestStatus = new HashSet<String>(Arrays.asList(listStringEmail));
        Set<String> studentFNCompare = new HashSet<String>();
        studentFNCompare.add("");
        if(setRequestStatus == studentFNCompare &&
                driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText().toLowerCase().trim()=="student first name: tuan111"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_032 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_032 is FAILED!");
            System.out.println("======================");
            System.out.println("Query Filter is displayed: " + driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText());
            System.out.println("First Name column is displayed: ");
            for(Object object : setRequestStatus) {
                String requestStatusOneByOne = (String) object;
                System.out.println(requestStatusOneByOne);
            }
        }
    }
}
