package PageElement;

import Driver.DriverManager;
import com.maven.test.Hook;
import org.openqa.selenium.By;

public class LoginPage extends DriverManager {
    public void LogIn() {
        driver.findElement(By.className("dc-header-item__label")).click();
    }
}
