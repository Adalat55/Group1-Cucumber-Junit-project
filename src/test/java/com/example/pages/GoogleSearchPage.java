package com.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage {


    @FindBy(name = "q")
    private WebElement searchBox;



    public void searchItem(String item){

        searchBox.sendKeys(item+ Keys.ENTER);
    }



}
