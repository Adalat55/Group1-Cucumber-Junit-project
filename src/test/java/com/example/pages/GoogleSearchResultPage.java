package com.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResultPage extends BasePage {

    @FindBy(id="result-stats")
    public WebElement resultCount;
}
