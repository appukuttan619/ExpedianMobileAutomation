package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "com.expedia.bookings:id/uds_button_label")
    WebElement acceptBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Get started']")
    WebElement getStartedBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Close']")
    WebElement closeBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Let’s go']")
    WebElement letsGoBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Flights']")
    WebElement flightsTab;

    public void openApplication() {
        if (isPresent(acceptBtn)) {
            acceptBtn.click();
        }

        if (isPresent(getStartedBtn)) {
            getStartedBtn.click();
            closeBtn.click();
            letsGoBtn.click();
        }
    }


    public boolean isHomeScreenDisplayed() {
        return isPresent(flightsTab);
    }

    public void clickOnFlightTab() {
        flightsTab.click();
    }
}
