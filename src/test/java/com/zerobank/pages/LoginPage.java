package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user_login")
    private WebElement loginInputBox;

    @FindBy(id = "user_password")
    private WebElement passwordInputBox;

    @FindBy(css = "[value='Sign in']")
    private WebElement loginBtn;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    private WebElement usersname;

    public void login() {
        loginInputBox.sendKeys(ConfigurationReader.get("userName"));
       passwordInputBox.sendKeys(ConfigurationReader.get("passWord"));
        loginBtn.click();
        BrowserUtils.waitFor(1);
        Driver.get().navigate().back();
    }
    public void login(String username,String password){
        loginInputBox.sendKeys(ConfigurationReader.get("userName"));
        passwordInputBox.sendKeys(ConfigurationReader.get("passWord"));
        loginBtn.click();
        BrowserUtils.waitFor(1);
        Driver.get().navigate().back();
    }


    public String  getusersName() {
        return usersname.getText();
    }
}
