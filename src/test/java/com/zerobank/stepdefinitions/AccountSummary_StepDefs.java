package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_StepDefs {
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @When("User goes to {string} menu")
    public void user_goes_to_menu(String menuName) {
        accountSummaryPage.tapOnMeNU(menuName);
    }

    @When("User goes to {string} subMenu")
    public void user_goes_to_sub_menu(String subMenu) {
        accountSummaryPage.tapOnSubMenu(subMenu);
    }

    @Then("User validates that page title is {string}")
    public void user_validates_that_page_title_is(String pageTitle) {
        Assert.assertEquals(pageTitle, Driver.get().getTitle());
    }
    @Then("User validates that following titles are displayed")
    public void user_validates_that_following_titles_are_displayed(List<String> accountTypes) {
        List<String> actual = accountSummaryPage.getAccountTypes();
        Assert.assertEquals(accountTypes, actual);
    }
    @Then("User validates that following column names are displayed")
    public void user_validates_that_following_column_names_are_displayed(List<String> creditColumns) {
        List<String> actualColumnNames = accountSummaryPage.getColumnsNames();
        Assert.assertEquals(creditColumns,actualColumnNames);

    }
}
