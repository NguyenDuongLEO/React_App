package testscripts.reactapp_testscripts.parentportalpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testscripts.BaseTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParentPortalPage_027 extends BaseTest {
    @Test
    public void verifyRequesterFilterWhichContainsInRequesterColumn(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.emailFilter.sendKeys("tuan1@gmail.com");
        parentPortalPage.applyFilterButton.click();
        checkingRequesterFilterWhichContainsInRequesterColumn();
    }
    public void checkingRequesterFilterWhichContainsInRequesterColumn() {
        waitElement();
        int j=0;
        String[] listStringRequester = new String [25];
        for (int i = 4; i <= 244; i = i + 10) {
            listStringRequester[j] = driver.findElement(By.xpath("//tr/td[@tabindex='" + i + "']")).getText();
            j++;
        }
        Set<String> setRequester = new HashSet<String>(Arrays.asList(listStringRequester));
        Set<String> requesterEmail = new HashSet<String>();
        requesterEmail.add("tuan1@gmail.com");
        if(setRequester == requesterEmail &&
                driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText().toLowerCase().trim()=="email: tuan1@gmail.com"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_027 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_027 is FAILED!");
            System.out.println("======================");
            System.out.println("Query Filter is displayed: " + driver.findElement(By.xpath("//div[@class='query__filter']/a")).getText());
            System.out.println("Requester/Email column is displayed: ");
            for(Object object : setRequester) {
                String requestStatusOneByOne = (String) object;
                System.out.println(requestStatusOneByOne);
            }
        }
    }
}
