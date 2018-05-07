package testscripts.reactapp_testscripts.parentportalpage;

import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_035 extends BaseTest {
    @Test
    public void verifyAllFilterWhichContainsInTableData(){
        loginSuccessfully();
        parentPortalPage.filtersButton.click();
        parentPortalPage.requestStatusFilterApproved.click();
        parentPortalPage.emailFilter.sendKeys("tnguyen@karrostech.com");
        parentPortalPage.studentIDFilter.sendKeys("987321654");
        parentPortalPage.studentFirstNameFilter.sendKeys("MOON");
        parentPortalPage.studentLastNameFilter.sendKeys("MOON");
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
