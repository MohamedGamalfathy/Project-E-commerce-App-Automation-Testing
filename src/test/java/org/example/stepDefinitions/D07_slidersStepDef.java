package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_slidersPage;
import org.testng.Assert;

public class D07_slidersStepDef {
    P07_slidersPage slider = new P07_slidersPage(Hooks.driver) ;

    @When("click on first slider")

    public void click_on_first_slider() throws InterruptedException
    {
        slider.firstSliderSquarePOM().click();
        slider.firstSliderPOM().click();
        Thread.sleep(4000);
    }
    @When("click on second slider")

    public void click_on_second_slider() throws InterruptedException
    {
        slider.secondSliderSquarePOM().click();
        slider.secondSliderPOM().click();
        Thread.sleep(4000);
    }
    @Then("relative product for first slider is displayed")

    public void first_product_details_opened()
    {
        String expectedResult= "https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualResult= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Then("relative product for second slider is displayed")

    public void second_product_details_opened()
    {
        String expectedResult= "https://demo.nopcommerce.com/iphone-6";
        String actualResult= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }




}
