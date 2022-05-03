package com.template.amazonPages;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class AmazonSearchPage {

    private WebDriver driver;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchBtn;

    public AmazonSearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        this.driver.get("https://www.amazon.com/");
    }

    public void search(String product) {
        this.searchBox.sendKeys(product);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        this.searchBtn.click();
    }

}
