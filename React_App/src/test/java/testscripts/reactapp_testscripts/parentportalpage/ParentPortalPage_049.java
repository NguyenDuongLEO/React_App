package testscripts.reactapp_testscripts.parentportalpage;

import org.testng.annotations.Test;
import testscripts.BaseTest;

public class ParentPortalPage_049 extends BaseTest {
    @Test
    public void verifyRequestStatusChanged(){
        loginSuccessfully();
        parentPortalPage.rejectedRequestStatus.click();
        try {
            parentPortalPage.approvedRequestStatus.click();
        }catch (Exception ex){}
        checkingRequestStatusChanged();
    }
    public void checkingRequestStatusChanged() {
        waitElement();

        if(parentPortalPage.rejectedRequestStatus.getText().toLowerCase().trim() == "approved"){
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_049 is PASSED!");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case ParentPortalPage_049 is FAILED!");
            System.out.println("======================");
            System.out.println("The Request Status is displayed: " + parentPortalPage.rejectedRequestStatus.getText());
        }
    }
}
