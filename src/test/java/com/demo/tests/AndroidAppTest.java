package com.demo.tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.ScreenOrientation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class AndroidAppTest {

    public AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Google Pixel 3");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("app", "lt:APP10160371781729590825385941"); 
        caps.setCapability("isRealMobile", false);
        caps.setCapability("build", "Testing build");
        caps.setCapability("devicelog", true);
        caps.setCapability("visual", true);
        caps.setCapability("network", true);
        caps.setCapability("tunnel", false);
        caps.setCapability("video", true);
        caps.setCapability("allowInvisibleElements", true);

        // Initialize Appium driver with the remote URL
        String USERNAME = "testingaccoubt01234";
        String ACCESS_KEY = "rS1lnQqz777CKxXbDOZU7iUdYBsihon1XOIDEYLKnLX5d4iBGc";
        String remoteUrl = "https://" + USERNAME + ":" + ACCESS_KEY + "@mobile-hub.lambdatest.com/wd/hub";

        driver = new AndroidDriver(new URL(remoteUrl), caps);
        driver.rotate(ScreenOrientation.PORTRAIT);  // Rotate to portrait

    }

    @Test
    public void startingTest() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Interactions with the app
            WebElement claimsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Claims")));
            claimsTab.click();
            System.out.println("'Claims' tab clicked.");
            Thread.sleep(2000);

            WebElement coverageTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Coverage")));
            coverageTab.click();
            System.out.println("'Coverage' tab clicked.");
            Thread.sleep(2000);

            WebElement settingTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Settings")));
            settingTab.click();
            System.out.println("'Settings' tab clicked.");
            Thread.sleep(2000);

            WebElement overviewTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Overview")));
            overviewTab.click();
            System.out.println("'Overview' tab clicked.");

        } catch (org.openqa.selenium.SessionNotCreatedException e) {
            System.err.println("Session not created: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Close the driver
            System.out.println("Driver quit in tearDown.");
        }
    }
}
