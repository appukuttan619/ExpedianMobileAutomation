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
    public void user_enters_into_flying_from(String fromPlace) {
        flightSearchPage.setFrom(fromPlace);

    }

    @When("user enters {string} into flying to")
    public void user_enters_into_flying_to(String toPlace) {
        flightSearchPage.setTo(toPlace);

    }

    @When("select date from {string} to {string}")
    public void select_date_from_to(String fromDate, String toDate) {
        flightSearchPage.setDate(fromDate, toDate);

    }

    @When("click on search button")
    public void click_on_search_button() {
        flightSearchPage.hitsearch();

    }

}
