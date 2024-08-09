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

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='android:id/content']/android.view.View/android.view.View[1]/android.widget.Button")
    WebElement closeBtnSignIn;
    @FindBy(xpath = "//android.view.View[@content-desc ='Close sheet']")
    WebElement closeBtnNav;
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    WebElement allowOrDontAllow;

    public void openApplication() {

        if(isPresent(closeBtnSignIn)){
            closeBtnSignIn.click();

        }

        if(isPresent(allowOrDontAllow)){
            allowOrDontAllow.click();

        }

        if(isPresent(closeBtnNav)){
            closeBtnNav.click();
        }

//        if (isPresent(acceptBtn)) {
//            acceptBtn.click();
//        }
//
//        if (isPresent(getStartedBtn)) {
//            getStartedBtn.click();
//            closeBtn.click();
//            letsGoBtn.click();
//        }
    }


    public boolean isHomeScreenDisplayed() {
        return isPresent(flightsTab);
    }

    public void clickOnFlightTab() {
        flightsTab.click();
    }
}
