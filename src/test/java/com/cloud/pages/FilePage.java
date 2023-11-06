package com.cloud.pages;

import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {


    public FilePage(){
        PageFactory.initElements(Driver.getDriver(ConfigurationReader.getProperty("url")),this);
    }
    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement fileModule;
    @FindBy(xpath = "//a[.='All files']")
    public WebElement allFiles;
    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement threeDots;
    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavorites;
    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favorites ;
    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement newFileToFavorites;
    @FindBy(xpath = "//span[.='Rename']")
    public WebElement renameBtn;

    @FindBy(xpath = "//input[@class='filename']")
    public WebElement renameInput;
    @FindBy(xpath = "//span[.='Details']")
    public WebElement details;
    @FindBy(id = "comments")
    public WebElement comments;
    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement commentsInput;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement commentSubmitBtn;


}
