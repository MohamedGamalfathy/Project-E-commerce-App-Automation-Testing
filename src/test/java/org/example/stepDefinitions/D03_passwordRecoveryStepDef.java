package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_loginPage;
import org.example.pages.P03_passwordRecoveryPage;

public class D03_passwordRecoveryStepDef {
    P02_loginPage login ;
    P03_passwordRecoveryPage reset;

    @Given("user open login page")
    public void user_open_login_page()
    {
        login = new P02_loginPage(Hooks.driver);
        login.loginLink().click();
    }
    @When("user click on forget password")
    public void user_select_forgetPassword()
    {
       reset = new P03_passwordRecoveryPage(Hooks.driver);
       reset.forgetPasswordPOM().click();
    }
    @When("^user write email \"(.*)\"$")
    public void user_write_email(String email)
    {
        reset.emailAddressPOM().sendKeys(email);
    }
    @When("user click on recover button")
    public void user_click_on_recover_button() throws InterruptedException {
        reset.recoverButtonPOM().click();
        Thread.sleep(4000);

    }
    @Then("user get success massage")
    public void user_get_success_massage()
    {
      reset.resetMassagePOM().isDisplayed();
    }
}
