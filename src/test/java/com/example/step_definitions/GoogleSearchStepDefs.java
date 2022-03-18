package com.example.step_definitions;

import com.example.pages.GoogleSearchPage;
import com.example.pages.GoogleSearchResultPage;
import com.example.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearchStepDefs {


    WebDriverWait wait=  new WebDriverWait(Driver.getDriver(), 10);
    GoogleSearchPage searchPage = new GoogleSearchPage();
    GoogleSearchResultPage searchResultPage= new GoogleSearchResultPage();
    @Given("User is on google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com");

    }
    @When("User inputs item name in search box and clicks search button")
    public void user_inputs_item_name_in_search_box_and_clicks_search_button() {

        searchPage.searchItem("cucumber");


    }
    @Then("User should see search results")
    public void user_should_see_search_results() {

        wait.until(ExpectedConditions.visibilityOf(searchResultPage.resultCount));
        String searchResultCount=searchResultPage.resultCount.getText();

        searchResultCount=searchResultCount.substring(6, searchResultCount.length()-23).trim().replace(",","");
        Assert.assertTrue(Long.parseLong(searchResultCount)>0);


        //About 3,780,000,000 results (0.50 seconds)


    }

    @When("User inputs {string} name in search box and clicks search button")
    public void userInputsNameInSearchBoxAndClicksSearchButton(String item) {


           searchPage.searchItem(item);
           Driver.getDriver().get("https://www.google.com");

    }
}
