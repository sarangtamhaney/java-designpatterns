package com.srp.main;

import com.srp.common.SearchSuggestion;
import com.srp.common.SearchWidget;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    private WebDriver driver;
    private SearchSuggestion searchSuggestion;
    private SearchWidget searchWidget;

    public GoogleMainPage(WebDriver driver){
        this.driver = driver;
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
        this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
    }

    public void goTo(){
        this.driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    public SearchWidget getSearchWidget(){
        return this.searchWidget;
    }

    public SearchSuggestion getSearchSuggestion(){
        return this.searchSuggestion;
    }
}
