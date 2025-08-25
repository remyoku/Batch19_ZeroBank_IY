package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivity_StepDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    @Then("User validate that default dropdown menu is {string}")
    public void user_validate_that_default_dropdown_menu_is(String defaultDropdown) {
        String actualDropdown = accountActivityPage.getDefaultChoice();
        Assert.assertEquals(defaultDropdown, actualDropdown);
    }
    @Then("User validate that account dropdown has this followings")
    public void user_validate_that_account_dropdown_has_this_followings(List<String> dropdownOptions) {
        List<String> actualList = accountActivityPage.getAllDropdownChoices();
        Assert.assertEquals(dropdownOptions, actualList);
    }
    @Then("User validates that transactions table has this following column names")
    public void user_validates_that_transactions_table_has_this_following_column_names(List<String> transactionsColumnsNames) {
        List<String> actualTransColumnNames = accountActivityPage.getTransColumnNames();
        Assert.assertEquals(transactionsColumnsNames, actualTransColumnNames);
    }
}
