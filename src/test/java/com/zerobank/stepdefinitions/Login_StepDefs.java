package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("User tap on signIn button")
    public void user_tap_on_sign_ın_button() {
        loginPage.tapOnSignInButton();
    }

    @When("User enters login credentials")
    public void user_enters_login_credentials() {
        loginPage.login();
    }

    @Then("Validate that user is logged in")
    public void validate_that_user_is_logged_in() {
        String actual = loginPage.getusersName();
        String expected = "username";
        Assert.assertEquals(actual, expected);
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.login(username, password);
    }

    @When("User taps on login button")
    public void user_taps_on_login_button() {
        loginPage.tapOnLoginBtn();
    }

    @Then("User validates that error message is displayed")
    public void user_validates_that_error_message_is_displayed() {
        String expectedErrorMsg="Login and/or password are wrong.";
        String actualErrorMsg= loginPage.getErrorMessage();

        Assert.assertEquals(expectedErrorMsg,actualErrorMsg);
    }


}
