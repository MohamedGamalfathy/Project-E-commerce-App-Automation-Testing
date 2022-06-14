package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_hoverPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D06_hoverStepDef {
    String subCategoryName;
    P06_hoverPage hover;

    @When("user hover category and select subcategory")
    public void user_hover_category_and_select_subcategory() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        hover = new P06_hoverPage(Hooks.driver);
        action.moveToElement(hover.computersCategoryPOM()).perform();
        Thread.sleep(10000);
        subCategoryName = hover.desktopsSubCategoryPOM().getText().toLowerCase().trim();
        hover.desktopsSubCategoryPOM().click();
    }

    @Then("user could hover successfully")
    public void success_hover()
    {
        Assert.assertEquals(subCategoryName,hover.subCategoryLinkPOM().getText().toLowerCase().trim());
    }

}