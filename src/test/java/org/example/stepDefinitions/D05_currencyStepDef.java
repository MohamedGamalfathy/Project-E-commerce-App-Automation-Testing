package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_currencyPage;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;



public class D05_currencyStepDef {
    P05_currencyPage currency = new P05_currencyPage(Hooks.driver);
    ;
    @When("user select currency")
    public void user_cjoose_currency()
    {
        Select select = new Select(currency.currencyPOM());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }
    @Then("user change currency successfully")
    public void user_change_currency_successfully()
    {
        int price = currency.productCurrencyPOM().size();
        for (int i=0;i<price;i++)
        {
            String expectedResult="€";
            String actualResult=currency.productCurrencyPOM().get(i).getText();
            Assert.assertTrue(actualResult.contains(expectedResult));
        }
    }
}
