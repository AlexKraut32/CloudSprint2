package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US001HomePage {
    public US001HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@href='#']")
    public WebElement statusButton;

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public WebElement weatherButton;
    @FindBy(xpath = "//h2[contains(text(), 'Upcoming cards')]")
    public WebElement upcomingCardsWidget;
    @FindBy(xpath = "//h2[contains(text(), 'Recent statuses')]")
    public WebElement recentStatusesWidget;
    @FindBy(xpath = "//h2[contains(text(), 'Notes')]")
    public WebElement notesWidget;
    @FindBy(xpath = "//h2[contains(text(), 'Unread mail')]")
    public WebElement unreadMailWidget;
    @FindBy(xpath = "//h2[contains(text(), 'Important mail')]")
    public WebElement importantMailWidget;
    @FindBy(xpath = "//h2[contains(text(), 'Upcoming events')]")
    public WebElement upcomingEventsWidget;

    @FindBy(xpath = "//h2[contains(text(), 'Recommended files')]")
    public WebElement recommendedFilesWidget;
    @FindBy(xpath = "//h2[contains(text(), 'Talk mentions')]")
    public WebElement talkMentionsWidget;


}
