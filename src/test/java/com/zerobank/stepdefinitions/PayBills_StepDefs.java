package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class PayBills_StepDefs {

    PayBillsPage payBillsPage = new PayBillsPage();

    @Then("User enters amount {string} and date {string}")
    public void user_enters_amount_and_date(String amount, String date) {
        payBillsPage.getEnterAmountAndDate(amount, date);
    }

    @Then("User should be able to see the successful message")
    public void user_should_be_able_to_see_the_successful_message() {
        String actualMessage = payBillsPage.getSuccessMessageText();
        String expectedMessage = "The payment was successfully submitted.";
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("User validates that input box error message is displayed")
    public void user_validates_that_input_box_error_message_is_displayed() {
        payBillsPage.verifyErrorMessageIsDisplayed();
    }

    @Then("User validates that date box is empty")
    public void user_validates_that_date_box_is_empty() {
        payBillsPage.verifyDateIsEmpty();

    }

    @Then("User validate following currencies should be available")
    public void userValidateFollowingCurrenciesShouldBeAvailable(List<String> currencies) {
        List<String> actualCurrencies = payBillsPage.getCurrencies();
        Assert.assertTrue(actualCurrencies.containsAll(currencies));
    }

    @When("The user tries to calculate cost without selecting a currency")
    public void the_user_tries_to_calculate_cost_without_selecting_a_currency() {
        payBillsPage.calculateCost();
    }

    @Then("The user should be able to see error message displayed")
    public void the_user_should_be_able_to_see_error_message_displayed() {
        payBillsPage.isAlertPresent();
    }

}
