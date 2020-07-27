package com.step_definitions;

import com.pages.DashboardPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Dashboard_step_definitions {

    DashboardPage dashboardPage;

    @Given("The user goes to to Amazon Website")
    public void the_user_go_to_to_Amazon_Website() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("The user search for {string}")
    public void the_user_search_for(String itemToSearch) throws InterruptedException {

        dashboardPage = new DashboardPage();
        dashboardPage.searchBox.sendKeys(itemToSearch);
        dashboardPage.searchButton.click();
    }

}
