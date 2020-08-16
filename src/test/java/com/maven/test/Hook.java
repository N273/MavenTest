package com.maven.test;

import Driver.DriverManager;
import cucumber.api.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hook {

    private DriverManager driverManager = new DriverManager();

    @Before
       public void setup(){
      DriverManager.openBrowser;
}
@After
    public void teardown(){
    DriverManager.closeBrowser;

}

}