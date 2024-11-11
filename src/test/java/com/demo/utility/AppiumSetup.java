/*package com.demo.utility;


import io.appium.java_client.android.AndroidDriver; // Import AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;


public class AppiumSetup {


    protected AndroidDriver driver;


    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        // Set desired capabilities for the Appium driver
        desiredCapabilities.setCapability("deviceName", "emulator-5554"); // The emulator device name
        desiredCapabilities.setCapability("platformName", "Android"); // The platform you are testing on
        desiredCapabilities.setCapability("platformVersion", "15"); // Android version
        desiredCapabilities.setCapability("appPackage", "com.app.truerx"); // Your app's package name
        desiredCapabilities.setCapability("appActivity", "com.app.truerx.MainActivity"); // Your app's main activity
        desiredCapabilities.setCapability("automationName", "UiAutomator2"); // Use UiAutomator2 for Android
        desiredCapabilities.setCapability("noReset", true); // Optionally include noReset
        desiredCapabilities.setCapability("newCommandTimeout", 300); // Optional: Timeout to avoid session issues
        desiredCapabilities.setCapability("autoGrantPermissions", true); // Optional: Auto grant app permissions
        desiredCapabilities.setCapability("adbExecTimeout", 60000);


        // Initialize the AndroidDriver instead of AppiumDriver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), desiredCapabilities);
    }


    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
*/