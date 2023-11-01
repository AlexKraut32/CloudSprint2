package com.cloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeckPage {
@FindBy(xpath = "(//li[@data-id='deck'])[1]")
    public WebElement deckDropdown;
@FindBy(xpath ="//span[@title='Upcoming cards']")
public WebElement upcomingCard;
@FindBy(xpath = "//span[@title='Add board']")
public WebElement addBoard;
@FindBy()
public  WebElement inputBoardName;

}
