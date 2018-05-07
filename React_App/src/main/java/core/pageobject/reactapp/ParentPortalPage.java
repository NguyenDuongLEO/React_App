package core.pageobject.reactapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParentPortalPage {
    final WebDriver driver;

    //===Top Bar Web Element===
    @FindBy(xpath = "//a[@id='basic-nav-dropdown']")
    public WebElement adminButton;
    @FindBy(xpath = "//a[@id='basic-nav-dropdown']/..//ul/li/a[@role='menuitem']")
    public WebElement signOutButton;
    @FindBy(xpath = "//a[contains(text(),'[ Parent Portal ]')]")
    public WebElement parentPortal;

    //===Table Data Web Element===
    @FindBy(xpath = "//th[@title='Request Status']")
    public WebElement requestStatusColumn;
    @FindBy(xpath = "//th[@title='Date Submitted']")
    public WebElement dateSubmittedColumn;
    @FindBy(xpath = "//th[@title='Requester']")
    public WebElement requesterColumn;
    @FindBy(xpath = "//th[@title='Student ID']")
    public WebElement studentIDColumn;
    @FindBy(xpath = "//th[@title='First Name']")
    public WebElement firstNameColumn;
    @FindBy(xpath = "//th[@title='Last Name']")
    public WebElement lastNameColumn;
    @FindBy(xpath = "//th[@title='DOB']")
    public WebElement dobColumn;
    @FindBy(xpath = "//th[@title='Notes']")
    public WebElement notesColumn;
    @FindBy(xpath = "//th[@title='User']")
    public WebElement userColumn;
    @FindBy(xpath = "//td[@tabindex='2']/div/p")
    public WebElement rejectedRequestStatus;
    //td[@tabindex='2']/div/p/../ul/li/a[@tabindex='-1']/p
    @FindBy(xpath = "//td[@tabindex='2']/div/p/../ul/li/a[@tabindex='-1']/p")
    public WebElement approvedRequestStatus;

    //===Filters section Web Element===
    @FindBy(xpath = "//button[@type='button']")
    public WebElement filtersButton;
    @FindBy(xpath = "//select[@id='formControlsSelect']")
    public WebElement requestStatusFilter;
    @FindBy(xpath = "//select[@id='formControlsSelect']/option[1]")
    public WebElement requestStatusFilterAll;
    @FindBy(xpath = "//select[@id='formControlsSelect']/option[2]")
    public WebElement requestStatusFilterApproved;
    @FindBy(xpath = "//select[@id='formControlsSelect']/option[3]")
    public WebElement requestStatusFilterDenied;
    @FindBy(xpath = "//select[@id='formControlsSelect']/option[4]")
    public WebElement requestStatusFilterPending;
    @FindBy(xpath = "//select[@id='formControlsSelect']/option[5]")
    public WebElement requestStatusFilterRejected;
    @FindBy(xpath = "//select[@id='formControlsSelect']/option[6]")
    public WebElement requestStatusFilterInactive;
    @FindBy(xpath = "//input[@id='formHorizontalEmail']")
    public WebElement emailFilter;
    @FindBy(xpath = "//input[@id='formHorizontalStudentID']")
    public WebElement studentIDFilter;
    @FindBy(xpath = "//input[@id='formHorizontalStudentFN']")
    public WebElement studentFirstNameFilter;
    @FindBy(xpath = "//input[@id='formHorizontalStudentLN']")
    public WebElement studentLastNameFilter;
    @FindBy(xpath = "//button[contains(text(),'Apply Filters')]")
    public WebElement applyFilterButton;
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    //===Paging Web Element===
    @FindBy(xpath = "//button[@id='dropdown-basic-Default']")
    public WebElement pagingDropDown;
    @FindBy(xpath = "//button[@id='dropdown-basic-Default']/../ul/li/a[contains(text(),'25')]")
    public WebElement pagingNumber25;
    @FindBy(xpath = "//button[@id='dropdown-basic-Default']/../ul/li/a[contains(text(),'50')]")
    public WebElement pagingNumber50;
    @FindBy(xpath = "//button[@id='dropdown-basic-Default']/../ul/li/a[contains(text(),'100')]")
    public WebElement pagingNumber100;

    //===Pagination Web Element===
    @FindBy(xpath = "//div[@class='paging-container']/ul/li[1]/a")
    public WebElement paginationFirstPage;
    @FindBy(xpath = "//div[@class='paging-container']/ul/li[2]/a")
    public WebElement paginationPreviousPage;
    @FindBy(xpath = "//div[@class='paging-container']/ul/li[6]/a")
    public WebElement paginationNextPage;
    @FindBy(xpath = "//div[@class='paging-container']/ul/li[7]/a")
    public WebElement paginationLastPage;
    @FindBy(xpath = "//div[@class='paging-container']/ul/li[3]/a")
    public WebElement paginationPageNumber1;
    @FindBy(xpath = "//div[@class='paging-container']/ul/li[4]/a")
    public WebElement paginationPageNumber2;
    @FindBy(xpath = "//div[@class='paging-container']/ul/li[5]/a")
    public WebElement paginationPageNumber3;

    public ParentPortalPage(WebDriver driver){
        this.driver = driver;
    }
}
