package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

import java.util.List;

public class P09_wishListPage {
    public P09_wishListPage(WebDriver driver)
    {
        Hooks.driver = driver;
    }

    public List<WebElement> wishListButtonPOM()
    {
        return Hooks.driver.findElements(By.cssSelector("div[class=\"buttons\"] button[class=\"button-2 add-to-wishlist-button\"]"));
    }
    public WebElement wishListLinkPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-wishlist\"]"));
    }
}
