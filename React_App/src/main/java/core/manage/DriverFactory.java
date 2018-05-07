package core.manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private static Map<String, WebDriver> driverMapping = new HashMap<String, WebDriver>();

    public static WebDriver getDriver(){
        return driverMapping.get(Thread.currentThread().getName());
    }

    public static void setDriver(WebDriver driver){
        driverMapping.put(Thread.currentThread().getName(), driver);
    }

    public static WebDriver getDriverInstance (){
        System.getProperty("user.dir");

        return new ChromeDriver();
    }
}
