package com.cloud.pages;

import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage extends LoginPage{
    public TalkModulePage(){
        PageFactory.initElements(Driver.getDriver(ConfigurationReader.getProperty("url")),this);
    }
    @FindBy(xpath = "//li[@data-id='spreed']")
    public WebElement talkButton;
    @FindBy(xpath = "//button[@class='toggle has-tooltip']")
    public WebElement  newConvBtn;

    @FindBy (xpath = "//input[@class='conversation-name']")
    public WebElement conversationNameInput;

    @FindBy(xpath = "//label[@for='checkbox']")
    public WebElement allowsCheckButton;
    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement AddPartBtn;

    @FindBy(xpath = "//input[@class='set-contacts__input']")
    public WebElement searchParticipantInput;


    @FindBy(xpath = "//span[@class='participant-row__user-name' and text()='Employee10']")
    public WebElement participantName;


   @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement CreateConvBtn;

   @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement closeBtn;

   @FindBy(xpath = "//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement menuBtn;

   @FindBy(xpath = "//span[@class='acli__content__line-one__title']")
   public WebElement  conversationElement;

   @FindBy(xpath = "//span[@class='action-button__icon icon-delete-critical']")
    public WebElement deleteBtn;

   @FindBy(xpath = "//button[@class='primary']")
    public WebElement clickBtn;

}
