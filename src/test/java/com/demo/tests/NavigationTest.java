/*package com.demo.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.utility.AppiumSetup; // Ensure this import
import io.appium.java_client.AppiumBy; // Ensure this import

import java.net.MalformedURLException;
import java.time.Duration;

public class NavigationTest extends AppiumSetup {

    @BeforeClass
    public void setup() throws MalformedURLException {
        super.setup(); // Call the setup method from the base class
    }

    @Test
    public void testElementPresence() throws InterruptedException { // Add InterruptedException to the method signature
        // Wait until the "Claims" element is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement claimsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Claims")));

        // Simple action, e.g., get the page title
        System.out.println("Session started: " + driver.getSessionId());

        // Click on the "Claims" element
        claimsTab.click();
        Thread.sleep(2000); // Wait for 2 seconds after the click

        // Now, wait until the "Coverage" element is visible
        WebElement coveragetab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Coverage")));
        coveragetab.click();
        Thread.sleep(2000); // Wait for 2 seconds after the click

        // Now, wait until the "Settings" element is visible
        WebElement settingTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Settings")));
        settingTab.click();
        Thread.sleep(2000); // Wait for 2 seconds after the click

        // Now, wait until the "Overview" element is visible
        WebElement overviewTab = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Overview")));
        overviewTab.click();
        Thread.sleep(2000); // Wait for 2 seconds after the click
    }

    @AfterClass
    public void tearDown() {
        super.tearDown(); // Call the tearDown method from the base class
    }
}*/
