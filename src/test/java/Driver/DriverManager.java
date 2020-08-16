package Driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.currys.co.uk");
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
