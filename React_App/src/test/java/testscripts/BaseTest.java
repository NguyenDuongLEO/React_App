package testscripts;

import core.pageobject.BasePage;
import core.pageobject.reactapp.ParentPortalPage;
import core.pageobject.reactapp.LogInPage;
import data.ReactAppData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    protected static LogInPage logInPage;
    protected static ParentPortalPage parentPortalPage;
    protected static BasePage basePage;
    protected void waitElement() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    protected void setUpMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logInPage = PageFactory.initElements(driver, LogInPage.class);
        parentPortalPage = PageFactory.initElements(driver, ParentPortalPage.class);
        driver.get(ReactAppData.URL);
        driver.manage().window().maximize();
    }
    protected void loginSuccessfully(){
        logInPage.inputEmail.sendKeys(ReactAppData.EMAILLOGIN);
        logInPage.inputPassword.sendKeys(ReactAppData.PASSWORDLOGIN);
        logInPage.submitLogInForm.click();
    }
    @AfterMethod
    protected void tearDownMethod() {
        driver.quit();
    }
}
