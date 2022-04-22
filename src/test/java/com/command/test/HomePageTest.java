package com.command.test;

import com.BaseTest;
import com.command.ElementValidator;
import com.command.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeTest
    public void setHomePage(){
        this.homePage = new HomePage(driver);
    }

    @Test
    public void homePageTest(){
        this.homePage.goTo();

//        for (ElementValidator ev: this.homePage.getElementValidators()){
//            boolean result = ev.validate();
//            Assert.assertTrue(result);
//        }
        this.homePage.getElementValidators()
                .stream()
                .map(ev -> ev.validate())
                .forEach(b -> Assert.assertTrue(b));
    }
}
