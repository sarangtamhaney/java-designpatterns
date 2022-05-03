package com.template.test;

import com.BaseTest;
import com.template.AmazonShopping;
import com.template.EBayShopping;
import com.template.ShoppingTemplate;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShoppingTest extends BaseTest {

    @Test(dataProvider = "getData")
    public void shoppingTest(ShoppingTemplate shoppingTemplate){
        shoppingTemplate.shop();
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {new AmazonShopping(driver, "samsung")},
                {new EBayShopping(driver, "samsung")}
        };
    }
}
