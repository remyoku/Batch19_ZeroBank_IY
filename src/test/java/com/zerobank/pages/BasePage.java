package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    protected Select select;

    @FindBy(id = "signin_button")
    private WebElement signIn_Button;

    public void tapOnSignInButton(){
        signIn_Button.click();
    }
    public void tapOnMeNU(String menuName){
        Driver.get().findElement(By.xpath("//strong[text()='"+menuName+"']")).click();
    }
    public void tapOnSubMenu(String subMenu){
        Driver.get().findElement(By.xpath("//span[text()='"+subMenu+"']")).click();
    }
}
