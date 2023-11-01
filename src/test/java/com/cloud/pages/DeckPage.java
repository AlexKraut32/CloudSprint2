package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage {

    public  DeckPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "(//li[@data-id='deck'])[1]")
    public WebElement deckBtn;
@FindBy(xpath ="//a[@class='app-navigation-toggle']")
public WebElement upcomingCard;
@FindBy(xpath = "//span[@title='Add board']")
public WebElement addBoard;
@FindBy(xpath = "//input[@placeholder='Board name']")
public  WebElement inputBoardName;
@FindBy(xpath = "(//input[@type='submit'])[2]")
public WebElement inputBoardNameButton;
@FindBy(css = "span[title='School']")
public WebElement newBoard;
    @FindBy(xpath = "(//button[@rel='noreferrer noopener'])[1]")
    public WebElement addListBTn;
    @FindBy(xpath = "(//input[@id='new-stack-input-main'])[1]")
    public WebElement listNameInput;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement listSubmitButton;


    @FindBy(xpath = "//h3[@class='stack__title has-tooltip']")
    public WebElement newList;
    @FindBy(xpath = "(//button[@rel='noreferrer noopener'])[4]")
    public WebElement newListButton;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNameInput;
    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement cardSubmitBTn ;
    @FindBy(xpath = "//span[.='New Card']")
    public WebElement newCard;
    @FindBy(xpath = "(//button[@aria-label='Actions'])[6]")
    public WebElement threeDotDropdown;
    @FindBy(xpath = "//span[.='Assign to me']")
  public   WebElement assignee;
    @FindBy(xpath = "(//img[@src='/index.php/avatar/User1/32?v=0'])[2]")
    public WebElement assigneeImg;

}
