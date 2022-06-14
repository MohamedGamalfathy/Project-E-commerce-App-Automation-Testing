package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_registerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_registerPage register ;

    @Given("user go to register page")
    public void user_go_to_register_Page()
    {
        register=new P01_registerPage(Hooks.driver);
        register.registerLinkPOM().click();
    }
    @When("user fill your personal details field")
    public void user_fill_personal_data()
    {
        register.genderTypePOM().click();
        register.firstNamePOM().sendKeys("Mohamed");
        register.lastNamePOM().sendKeys("gamal");
        Select birthDay = new Select(register.birthDayPOM());
        birthDay.selectByValue("22");
        Select birthMonth = new Select(register.birthMonthPOM());
        birthMonth.selectByValue("11");
        Select birthYear = new Select(register.birthYearPOM());
        birthYear.selectByValue("1995");
        register.emailPOM().sendKeys("mohamedgamal39@gmail.com");
    }
    @When("user fill company details")
    public void user_add_company_name()
    {

        register.companyPOM().sendKeys("Automate tests Company");
    }
    @When("user fill your password field")
    public void user_add_password()
    {
        register.passwordPOM().sendKeys("012345678999");
        register.confirmPasswordPOM().sendKeys("012345678999");
    }
    @When("user click on register button")
    public void user_click_on_registerButton() throws InterruptedException
    {
        register.registerButton().click();
        Thread.sleep(4000);
    }
    @Then("user could register successfully")
    public void success_registration()
    {
        SoftAssert soft =new SoftAssert();
        String expectedResult = "Your registration completed";
        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualResult = Hooks.driver.findElement(By.className("result")).getText();
        String actualColor = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertTrue(actualColor.contains(expectedColor));
        soft.assertAll();
    }

}
