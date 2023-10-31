package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US001LoginPage {


    public US001LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//input[@id='user']")
    public WebElement usernameBox;

    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath="//input[@value='Log in']")
    public WebElement loginButton;
}

