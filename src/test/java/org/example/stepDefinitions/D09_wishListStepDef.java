package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.example.pages.P09_wishListPage;

import java.time.Duration;

public class D09_wishListStepDef {

    P09_wishListPage wishList = new P09_wishListPage(Hooks.driver);

    @When("user add product to wishlist")

    public void add_product_to_wishList() throws InterruptedException
    {
        wishList.wishListButtonPOM().get(2).click();
        Thread.sleep(4000);
    }
    @Then("wishlist notification success is visible")

    public void successMassage_visible()
    {
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[id=\"bar-notification\"] div[class=\"bar-notification success\"]")).isDisplayed());
    }

    @When("user click on wishlist link")
    public void user_click_on_wishlist_link()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(wishList.wishListLinkPOM())).click();
    }

    @Then("number of wishlist items increased")

    public void number_of_wishlist_item_increased() throws InterruptedException
    {
        Thread.sleep(4000);
        String itemQtyValue = Hooks.driver.findElement(By.className("qty-input")).getAttribute("value");
        int numOfWishListItems=Integer.parseInt(itemQtyValue);
        Assert.assertTrue(numOfWishListItems>0);
    }


}
