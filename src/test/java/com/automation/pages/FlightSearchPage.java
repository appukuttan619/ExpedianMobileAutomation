package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearchPage extends BasePage {

    @FindBy(id = "com.expedia.bookings:id/udsFormFieldEditText")
    WebElement flyingFromInput;

    @FindBy(id = "com.expedia.bookings:id/udsFormFieldEditText")
    WebElement flyingToInput;


    public boolean isFlightSearchPageDisplayed() {
        return isPresent(flyingFromInput) && isPresent(flyingToInput);
    }
}
