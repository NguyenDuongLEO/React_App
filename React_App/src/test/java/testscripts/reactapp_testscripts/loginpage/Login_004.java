package testscripts.reactapp_testscripts.loginpage;

import org.testng.annotations.Test;
import testscripts.BaseTest;

public class Login_004 extends BaseTest {
    @Test
    public void verifyLoginSystemWithValidFields() {
        loginSuccessfully();
        checkingLogInSuccessfully();
    }

    public void checkingLogInSuccessfully(){
        waitElement();
        if(parentPortalPage.parentPortal.getText().trim().toLowerCase().equals("[ parent portal ]")&&
                parentPortalPage.filtersButton.getText().trim().toLowerCase().equals("filters")&&
                parentPortalPage.adminButton.getText().trim().toLowerCase().equals("[admin]")&&
                parentPortalPage.requestStatusColumn.getText().trim().toLowerCase().equals("request status")&&
                parentPortalPage.dateSubmittedColumn.getText().trim().toLowerCase().equals("date submitted")&&
                parentPortalPage.requesterColumn.getText().trim().toLowerCase().equals("requester")&&
                parentPortalPage.studentIDColumn.getText().trim().toLowerCase().equals("student id")&&
                parentPortalPage.firstNameColumn.getText().trim().toLowerCase().equals("first name")&&
                parentPortalPage.lastNameColumn.getText().trim().toLowerCase().equals("last name")&&
                parentPortalPage.dobColumn.getText().trim().toLowerCase().equals("dob")&&
                parentPortalPage.notesColumn.getText().trim().toLowerCase().equals("notes")&&
                parentPortalPage.userColumn.getText().trim().toLowerCase().equals("user")) {
            System.out.println("======================");
            System.out.println("Test Case Login_004 is PASS! Log In successfully");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Case Login_004 is FAILED! Log In unsuccessfully");
            System.out.println("======================");
            System.out.println("[ Parent Portal ] is displayed '" +parentPortalPage.parentPortal.getText()+"'");
            System.out.println("[Admin] is displayed '" +parentPortalPage.adminButton.getText()+"'");
            System.out.println("Filter button is displayed '" +parentPortalPage.filtersButton.getText()+"'");
            System.out.println("Request Status column is displayed '" +parentPortalPage.requestStatusColumn.getText()+"'");
            System.out.println("Date Submitted column is displayed '" +parentPortalPage.dateSubmittedColumn.getText()+"'");
            System.out.println("Requester column is displayed '" +parentPortalPage.requesterColumn.getText()+"'");
            System.out.println("Student ID column is displayed '" +parentPortalPage.studentIDColumn.getText()+"'");
            System.out.println("First Name column is displayed '" +parentPortalPage.firstNameColumn.getText()+"'");
            System.out.println("Last Name column is displayed '" +parentPortalPage.lastNameColumn.getText()+"'");
            System.out.println("DOB column is displayed '" +parentPortalPage.dobColumn.getText()+"'");
            System.out.println("Notes column is displayed '" +parentPortalPage.notesColumn.getText()+"'");
            System.out.println("User is displayed '" +parentPortalPage.userColumn.getText()+"'");
            System.out.println("======================");
        }
    }
}
