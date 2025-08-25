package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    private WebElement accountDropdown;

   @FindBy (css = "#all_transactions_for_account th")
   private List<WebElement>transColumnNames;


    public String getDefaultChoice(){
        select=new Select(accountDropdown);
        return select.getFirstSelectedOption().getText();
    }
    public List<String>getAllDropdownChoices(){
        select=new Select(accountDropdown);
        return BrowserUtils.getElementsText(select.getOptions());
    }
    public List<String> getTransColumnNames(){
        return BrowserUtils.getElementsText(transColumnNames);
    }
}
