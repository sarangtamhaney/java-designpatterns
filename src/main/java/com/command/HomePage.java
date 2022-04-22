package com.command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class HomePage {

    private final WebDriver driver;

    //buttons
    @FindBy(css = "div.button-box button.btn-info")
    private WebElement infoBtn;

    @FindBy(css = "div.button-box button.btn-warning")
    private WebElement warnBtn;

    @FindBy(css = "div.button-box button.btn-success")
    private WebElement successBtn;

    @FindBy(css = "div.button-box button.btn-danger")
    private WebElement dangerBtn;

    //Toasters
    @FindBy(css = "div.jq-icon-info")
    private WebElement infoAlert;

    @FindBy(css = "div.jq-icon-warning")
    private WebElement warnAlert;

    @FindBy(css = "div.jq-icon-success")
    private WebElement successAlert;

    @FindBy(css = "div.jq-icon-error")
    private WebElement dangerAlert;

    //dismissal alerts
    @FindBy(xpath = "//h4[text()='Dissmissal Alert']//following-sibling::div[contains(@class,'alert-info')]")
    private WebElement dismissalInfoAlert;

    @FindBy(xpath = "//h4[text()='Dissmissal Alert']//following-sibling::div[contains(@class,'alert-warning')]")
    private WebElement dismissalWarnAlert;

    @FindBy(xpath = "//h4[text()='Dissmissal Alert']//following-sibling::div[contains(@class,'alert-success')]")
    private WebElement dismissalSuccessAlert;

    @FindBy(xpath = "//h4[text()='Dissmissal Alert']//following-sibling::div[contains(@class,'alert-danger')]")
    private WebElement dismissalDangerAlert;

    public HomePage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://vins-udemy.s3.amazonaws.com/ds/admin-template/admin-template.html");
    }

    public List<ElementValidator> getElementValidators(){

        return Arrays.asList(
                new NotificationValidator(infoBtn, infoAlert),
                new NotificationValidator(warnBtn, warnAlert),
                new NotificationValidator(successBtn, successAlert),
                new NotificationValidator(dangerBtn, dangerAlert),

                new DismissalAlertValidator(dismissalInfoAlert),
                new DismissalAlertValidator(dismissalWarnAlert),
                new DismissalAlertValidator(dismissalSuccessAlert),
                new DismissalAlertValidator(dismissalDangerAlert)
        );
    }
}
