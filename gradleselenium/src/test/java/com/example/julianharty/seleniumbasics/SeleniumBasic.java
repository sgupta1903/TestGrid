package com.example.julianharty.seleniumbasics;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

/**
 * Created by julianharty on 13/02/2017.
 */

public class SeleniumBasic {
    @Test
    public void helloGoogleTest() throws Exception {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), capability);
        driver.get("http://www.google.co.uk/");

        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File screenshot = ((TakesScreenshot)augmentedDriver).
                getScreenshotAs(OutputType.FILE);
    }
}
