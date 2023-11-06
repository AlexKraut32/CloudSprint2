package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactGroupPage {
    public ContactGroupPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement user;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginInButton;

    @FindBy(xpath = "//li[@data-id='contacts']")
    public WebElement contactModule;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-add']")
    public WebElement createButton;

    @FindBy(className = "action-text__text")
    public WebElement createGroupWindow;

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement inputArea;

    @FindBy(id = "everyone")
    public WebElement allContacts;

    @FindBy(className = "primary")
    public WebElement createContactButton;

    @FindBy(className = "multiselect__input")
    public WebElement groupsDropdown;

    @FindBy(xpath = "//input[@placeholder='Choose property type']")
    public WebElement addNewProperty;

    @FindBy(xpath = "//div[@title='Anniversary']")
    public WebElement anniversary;

    @FindBy(xpath = "//div[@class='property__value property__title--right']")
    public WebElement anniversaryTitle;


}
