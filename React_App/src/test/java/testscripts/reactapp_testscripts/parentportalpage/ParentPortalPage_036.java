package testscripts.reactapp_testscripts.parentportalpage;

import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_036 extends BaseTest {
    @Test
    public void verifyAllFilterWhichContainsInTableData(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.requestStatusFilterApproved.click();
        parentPortalPage.emailFilter.sendKeys("1111111@karrostech.com");
        parentPortalPage.studentIDFilter.sendKeys("111111");
        parentPortalPage.studentFirstNameFilter.sendKeys("aaa");
        parentPortalPage.studentLastNameFilter.sendKeys("aaa");
        parentPortalPage.applyFilterButton.click();
        checkingAllFilterWhichContainsInTableData();
    }
    public void checkingAllFilterWhichContainsInTableData() {
        waitElement();
        ParentPortalPage_022 parentPortalPage_022 = new ParentPortalPage_022();
        ParentPortalPage_027 parentPortalPage_027 = new ParentPortalPage_027();
        ParentPortalPage_029 parentPortalPage_029 = new ParentPortalPage_029();
        ParentPortalPage_031 parentPortalPage_031 = new ParentPortalPage_031();
        ParentPortalPage_033 parentPortalPage_033 = new ParentPortalPage_033();
        parentPortalPage_022.checkingRequestStatusFilterApproved();
        parentPortalPage_027.checkingRequesterFilterWhichContainsInRequesterColumn();
        parentPortalPage_029.checkingStudentIDFilterWhichContainsInRequestColumn();
        parentPortalPage_031.checkingStudentFNFilterWhichContainsInRequestColumn();
        parentPortalPage_033.checkingStudentLNFilterWhichContainsInRequestColumn();
    }
}
