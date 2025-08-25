package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{
    @FindBy(tagName = "//h2")
    private List<WebElement> accountTypes;

    @FindBy(xpath = "(//table)[3]//th")
    private List<WebElement >columnsNames;

    public List<String> getAccountTypes(){
        return BrowserUtils.getElementsText(accountTypes);
    }
    public List<String > getColumnsNames(){
        return BrowserUtils.getElementsText(columnsNames);
    }
}
