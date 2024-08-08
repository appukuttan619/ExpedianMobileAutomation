package com.automation.steps;

import com.automation.pages.FlightSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FlightSearchSteps {

    FlightSearchPage flightSearchPage = new FlightSearchPage();

    @Then("verify user is on flight search page")
    public void verify_user_is_on_flight_search_page() {
        Assert.assertTrue(flightSearchPage.isFlightSearchPageDisplayed());
    }

    @When("user enters {string} into flying from")
    public void user_enters_into_flying_from(String string) {

    }

    @When("user enters {string} into flying to")
    public void user_enters_into_flying_to(String string) {

    }

    @When("select date from {string} to {string}")
    public void select_date_from_to(String string, String string2) {

    }

    @When("click on search button")
    public void click_on_search_button() {

    }

    @Then("verify flight listing page is displayed")
    public void verify_flight_listing_page_is_displayed() {

    }
}
