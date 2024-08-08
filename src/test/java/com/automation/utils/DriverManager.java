package com.automation.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverManager {

    static AppiumDriver driver;

    public static void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "RZ8N9250P5Z");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "D:\\MobileAutomation\\expedia.apk");
        capabilities.setCapability("appActivity","com.expedia.bookings.activity.SearchActivity");
        capabilities.setCapability("appPackage","com.expedia.bookings");

        driver = new AndroidDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

}
