package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightListingPage extends BasePage{

    @FindBy(xpath = "//android.widget.TextView[@text = 'Price Tracking']")
    WebElement priceTrackingElement;
    public boolean isFlightListingPageDisplayed() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("couldnt find the element priceTracking make the wait longer");
        }
        return isPresent(priceTrackingElement);
    }
}
