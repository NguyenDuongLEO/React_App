package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParentPortalPage_033 extends BaseTest {
    @Test
    public void verifyStudentLNFilterWhichContainsInRequestColumn(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.studentLastNameFilter.sendKeys("Nguyen");
        parentPortalPage.applyFilterButton.click();
        checkingStudentLNFilterWhichContainsInRequestColumn();
    }
    public void checkingStudentLNFilterWhichContainsInRequestColumn() {
        waitElement();
        int j=0;
        String[] listStringEmail = new String [25];
        for (int i = 7; i <= 247; i = i + 10) {
            listStringEmail[j] = driver.findElement(By.xpath("//tr/td[@tabindex='" + i + "']")).getText();
            j++;
        }
        Set<String> setRequestStatus = new HashSet<String>(Arrays.asList(listStringEmail));
        Set<String> studentLNAdded = new HashSet<String>();
        studentLNAdded.add("Nguyen");
        if(setRequestStatus == studentLNAdded &&
                driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText().toLowerCase().trim()=="student last name: nguyen"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_033 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_033 is FAILED!");
            System.out.println("======================");
            System.out.println("Query Filter is displayed: " + driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText());
            System.out.println("Last Name column is displayed: ");
            for(Object object : setRequestStatus) {
                String requestStatusOneByOne = (String) object;
                System.out.println(requestStatusOneByOne);
            }
        }
    }
}
