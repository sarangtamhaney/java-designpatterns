package com.command;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class DismissalAlertValidator extends ElementValidator{

    private final WebElement dismissalAlert;

    public DismissalAlertValidator(final WebElement dismissalAlert) {
        this.dismissalAlert = dismissalAlert;
    }

    @Override
    public boolean validate() {
        boolean appear = this.dismissalAlert.isDisplayed();
        this.dismissalAlert.findElement(By.cssSelector("button.close")).click();
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        boolean disappear = true;
        try {
            disappear = this.dismissalAlert.isDisplayed();
        }
        catch (NoSuchElementException e){
            disappear = false;
        }
        return appear && (!disappear);
    }
}
