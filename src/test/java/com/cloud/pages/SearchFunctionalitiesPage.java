package com.cloud.pages;

import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionalitiesPage {

    public SearchFunctionalitiesPage(){

        PageFactory.initElements(Driver.getDriver(ConfigurationReader.getProperty("url")),this);
    }

    @FindBy(xpath = "//div[@id='unified-search']")
    public WebElement magnifyingGlassSearchIcon;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBar;

    @FindBy(xpath = "//h3[@title='Files']")
    public WebElement filesOptionAfterSearch; //to be clicked after typing files and it load, put explicit wait after typing Files before clicking

    @FindBy(xpath = "//a[@href='/index.php/apps/files?dir=/&openfile=90830']")
    public WebElement thumbnailForFirstItemOnListOfFiles;

    @FindBy(xpath = "//div[@class='icons-menu']/div/div/div/button")
    public WebElement buttonForOpenSideBarOption;

    @FindBy(xpath = "//span[text()='Open sidebar']")
    public WebElement openSideBarOption;

    //verification that this element below is displayed AFTER clicking above element
    @FindBy(xpath = "//aside[@id='app-sidebar-vue']")
    public WebElement sideBarView;




}
/*
@Given("user is on the dashboard")
    public void user_is_on_the_dashboard() {

    }
    @When("user clicks on search bar")
    public void user_clicks_on_search_bar() {

    }
    @Then("user searches for files or contacts through magnifying glass icon in any module")
    public void user_searches_for_files_or_contacts_through_magnifying_glass_icon_in_any_module() {

    }
    @When("user clicks on file")
    public void user_clicks_on_file() {

    }
    @When("user opens sidebar")
    public void user_opens_sidebar() {

    }
    @Then("user sees details inside page of file")
    public void user_sees_details_inside_page_of_file() {

    }
 */