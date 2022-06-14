package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import org.example.pages.P02_loginPage;

public class D02_loginStepDef {
    P02_loginPage login ;

    @Given("user go to login page")
    public void user_go_to_login_page()
    {
        login = new P02_loginPage(Hooks.driver);
        login.loginLink().click();
    }
    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void user_enter_email_and_password(String email,String password)
    {
        login.emailLoginPOM().sendKeys(email);
        login.passwordLoginPOM().sendKeys(password);
    }
    @When("user click on login button")
    public void user_click_on_loginButton() throws InterruptedException
    {
        login.loginButtonPOM().click();
        Thread.sleep(4000);
    }
    @Then("user could login successfully")
    public void success_login()
    {
        SoftAssert soft =new SoftAssert();
        String expectedResult = "https://demo.nopcommerce.com/";
        String actualResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actualResult.contains(expectedResult));
        login.myAccountLink().isDisplayed();
        soft.assertAll();
    }

}
