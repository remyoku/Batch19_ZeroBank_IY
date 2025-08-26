package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayBillsPage extends BasePage {

    @FindBy(id = "sp_amount")
    private WebElement amountBox;

    @FindBy(id = "sp_date")
    private WebElement dateBox;

    @FindBy(id = "pay_saved_payees")
    private WebElement payBtn;

    @FindBy(id = "alert_content")
    private WebElement successMessage;

    @FindBy(id = "pc_currency")
    private WebElement currencies;

    @FindBy(id = "pc_calculate_costs")
    private WebElement calculateBtn;

    public void getEnterAmountAndDate(String amount,String date) {
        amountBox.sendKeys(amount);
        dateBox.sendKeys(date);
        payBtn.click();
    }

    public String getSuccessMessageText() {
        return successMessage.getText();
    }
    public boolean verifyErrorMessageIsDisplayed(){
        if (amountBox.getAttribute("validationMessage").equals("Please fill out this field.")){
            return true;
        }else if (dateBox.getAttribute("validationMessage").equals("Please fill out this field.")){
            return true;
        }else return false;
    }
    public boolean verifyDateIsEmpty(){
        return dateBox.getText().isEmpty();
    }
    public List<String> getCurrencies(){
        select=new Select(currencies);
        return BrowserUtils.getElementsText(select.getOptions());
    }
    public void calculateCost(){
        calculateBtn.click();
    }
    public boolean isAlertPresent() {
        try {
            Driver.get().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
