/*package com.demo.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.utility.AppiumSetup; // Ensure this import
import io.appium.java_client.AppiumBy; // Ensure this import

import java.net.MalformedURLException;
import java.time.Duration;

public class NotificationTest extends AppiumSetup {

    @BeforeClass
    public void setup() throws MalformedURLException {
        super.setup(); // Call the setup method from the base class
    }

    @Test
    public void testNotifications() {
        // Create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Wait for the notification icon and click on it
        WebElement notificationIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")));
        notificationIcon.click();
        pause(); // 2-second wait

        // Validate the message "No Notification Found"
        WebElement validationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")));
        String messageText = validationMessage.getText();
        Assert.assertEquals(messageText, "No Notification Found", "The validation message is incorrect!");

        // Click on the arrow icon to go back
        WebElement backArrow = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")));
        backArrow.click();
        pause(); // 2-second wait
    }

    private void pause() {
        try {
            Thread.sleep(3000); // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        super.tearDown(); // Call the tearDown method from the base class
    }
}*/
