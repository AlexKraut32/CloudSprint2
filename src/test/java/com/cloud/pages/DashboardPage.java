package com.cloud.pages;

import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {


    public DashboardPage(){

        PageFactory.initElements(Driver.getDriver(ConfigurationReader.getProperty("url")),this);

    }

    @FindBy(xpath = "//a[@href='/index.php']")
    public WebElement symundDashboardIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement filesIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/photos/'])[1]")
    public WebElement photosIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/activity/'])[1]")
    public WebElement activityIcon;

    @FindBy(xpath = "(//a[@href='https://qa.symund.com/index.php/apps/spreed/'])[1]")
    public WebElement talkIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/mail/'])[1]")
    public WebElement mailIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/contacts/'])[1]")
    public WebElement contactsIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/circles/'])[1]")
    public WebElement circlesIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/calendar/'])[1]")
    public WebElement calendarIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/notes/'])[1]")
    public WebElement notesIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/deck/'])[1]")
    public WebElement decksIcon;

    @FindBy(xpath = "(//a[@href='/index.php/apps/tasks/'])[1]")
    public WebElement tasksIcon;



}
