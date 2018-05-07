package core.pageobject.reactapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
    final WebDriver driver;

    @FindBy(xpath = "//input[@id='formHorizontalEmail']")
    public WebElement inputEmail;
    @FindBy(xpath = "//input[@id='formHorizontalPassword']")
    public WebElement inputPassword;
    @FindBy(xpath = "//a[contains(text(),'LOG IN')]")
    public WebElement submitLogInForm;
    @FindBy(xpath = "//a[contains(text(),'[ Parent Portal ]')]")
    public WebElement parentPortalAvailability;
    @FindBy(xpath = "//p[@class='login-error']/strong")
    public WebElement errorMessageShow;
    @FindBy(xpath = "//a[contains(text(),' Log In')]")
    public WebElement logInTitle;

    public LogInPage(WebDriver driver){
        this.driver = driver;
    }


}
