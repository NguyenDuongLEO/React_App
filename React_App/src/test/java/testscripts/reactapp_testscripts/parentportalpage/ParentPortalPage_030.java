package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParentPortalPage_030 extends BaseTest {
    @Test
    public void verifyStudentIDFilterWhichNOTContainsInRequestColumn(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.studentIDFilter.sendKeys("1111111");
        parentPortalPage.applyFilterButton.click();
        checkingStudentIDFilterWhichNOTContainsInRequestColumn();
    }
    public void checkingStudentIDFilterWhichNOTContainsInRequestColumn() {
        waitElement();
        int j=0;
        String[] listStringEmail = new String [25];
        for (int i = 5; i <= 245; i = i + 10) {
            listStringEmail[j] = driver.findElement(By.xpath("//tr/td[@tabindex='" + i + "']")).getText();
            j++;
        }
        Set<String> setRequestStatus = new HashSet<String>(Arrays.asList(listStringEmail));
        Set<String> studentIDCompare = new HashSet<String>();
        studentIDCompare.add("");
        if(setRequestStatus == studentIDCompare &&
                driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText().toLowerCase().trim()=="student id: 1111111"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_030 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_030 is FAILED!");
            System.out.println("======================");
            System.out.println("Query Filter is displayed: " + driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText());
            System.out.println("Student ID column is displayed: ");
            for(Object object : setRequestStatus) {
                String requestStatusOneByOne = (String) object;
                System.out.println(requestStatusOneByOne);
            }
        }
    }
}
