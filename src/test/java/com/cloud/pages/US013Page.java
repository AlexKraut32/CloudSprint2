package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US013Page extends LoginPage{

    public US013Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[contains(@src, '/index.php/avatar/User1/32?v=0')]")
    public WebElement profileLink;


    //@FindBy(css = "a[class='active']")
    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settingsLink;

    @FindBy(xpath = "//span[text()='Personal info']")
    public WebElement personalInfoLink;

    @FindBy(css = ".personal-settings-setting-box")
    public List<WebElement> allTitles;

    @FindBy(xpath = "//div[@id=\"settings\"]")
    public WebElement settingPage;

    @FindBy(xpath = "//span[@title='Kadir']")
    public WebElement settingName;

    @FindBy(xpath = "//input[@value='Kadir']")
    public WebElement inputName;

   /* public void us013(){
        if (!settingName.equals(inputName)){
            System.out.println("\"Full Name\" input box  should not be the same as the \"Settings Name\"");
        }else{
            System.out.println("\"Full Name\" input box  should be the same as the \"Settings Name\"");
        }
    }

    */

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumberInputBox;





}
