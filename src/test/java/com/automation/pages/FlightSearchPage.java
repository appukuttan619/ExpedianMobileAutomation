package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearchPage extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc='Leaving from Button']")
    WebElement flyingFromInput;

    @FindBy(xpath = "//android.view.View[@content-desc='Going to Button']")
    WebElement flyingToInput;


    public boolean isFlightSearchPageDisplayed() {
        return isPresent(flyingFromInput) && isPresent(flyingToInput);
    }

    @FindBy(xpath = "//android.widget.EditText[@resource-id='TeamTypeaheadInput']")
    WebElement leavingFromSearchBox;


    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Chicago')]")
    WebElement fromPlaceListing;

    public void setFrom(String fromPlace) {
        flyingFromInput.click();
        leavingFromSearchBox.sendKeys(fromPlace);
        fromPlaceListing.click();
    }

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"TeamTypeaheadInput\"]")
    WebElement goingToSearchBox;

    @FindBy(xpath = "//android.widget.TextView[contains(@text, 'Florida')]")
    WebElement toPlaceListing;

    public void setTo(String toPlace) {
        flyingToInput.click();
        goingToSearchBox.sendKeys(toPlace);
        toPlaceListing.click();

    }

    @FindBy(xpath = "//android.view.View[contains(@content-desc, 'Dates Button')]")
    WebElement dateSelector;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Done']//following-sibling::android.widget.Button")
    WebElement doneBtn;


    public void setDate(String fromDate, String toDate) {
        dateSelector.click();
        selectDate(fromDate);
        selectDate(toDate);
        doneBtn.click();
    }

    public void selectDate(String date){
        String xpath = String.format("//android.widget.TextView[contains(@content-desc,'%s')]/..//android.widget.Button"
                ,date);

        WebElement dateSelect = driver.findElement(By.xpath(xpath));

        dateSelect.click();

    }

    @FindBy(xpath = "//android.widget.TextView[@text = 'Search']//following-sibling::android.widget.Button")
    WebElement searchBtn;
    public void hitsearch() {
        searchBtn.click();

    }
}
