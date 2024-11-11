/*package com.demo.tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class vanillaAndroidTest {

    private AppiumDriver driver;
    public static String userName = System.getenv("LT_USERNAME") == null ? "divireddy101" : System.getenv("LT_USERNAME");
    public static String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "x2heNIknkrX3NiAXztTMt7UJK6aesmWE2Q1HSnYkfIMuAL8A8r" : System.getenv("LT_ACCESS_KEY");

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
        capabilities.setCapability("deviceName", "Pixel 3");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("isRealMobile", true);
        capabilities.setCapability("app", "lt://APP10160471311729227099185744"); // Enter your app url
        capabilities.setCapability("deviceOrientation", "PORTRAIT");
        capabilities.setCapability("build", "Java Vanilla - Android");
        capabilities.setCapability("name", "Sample Test Java");
        capabilities.setCapability("console", true);
        capabilities.setCapability("network", false);
        capabilities.setCapability("visual", true);
        capabilities.setCapability("devicelog", true);
        capabilities.setCapability("platformName", "Android");

        driver = new AppiumDriver(new URL("https://" + userName + ":" + accessKey + "@mobile-hub.lambdatest.com/wd/hub"), capabilities);
    }

    @Test
    public void performTestActions() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Wait for the "Claims" element and click it
        WebElement claimsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Claims")));
        System.out.println("Session started: " + driver.getSessionId());
        claimsTab.click();
        Thread.sleep(2000); // Wait for 2 seconds after the click

        // Wait for the "Coverage" element and click it
        WebElement coveragetab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Coverage")));
        coveragetab.click();
        Thread.sleep(2000); // Wait for 2 seconds after the click

        // Wait for the "Settings" element and click it
        WebElement settingTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Settings")));
        settingTab.click();
        Thread.sleep(2000); // Wait for 2 seconds after the click

        // Wait for the "Overview" element and click it
        WebElement overviewTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Overview")));
        overviewTab.click();
        Thread.sleep(2000); // Wait for 2 seconds after the click
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            try {
                ((JavascriptExecutor) driver).executeScript("lambda-status=failed");
            } catch (Exception e) {
                e.printStackTrace();
            }
            driver.quit(); // Ensure the driver quits at the end of the test
        }
    }
}*/
