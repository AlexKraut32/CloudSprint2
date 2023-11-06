package com.cloud.step_definitions;

import com.cloud.pages.SearchFunctionalitiesPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SearchFunctionalitiesStepDefs {


    SearchFunctionalitiesPage searchFunctionalitiesPage = new SearchFunctionalitiesPage();

    @Given("user is on the dashboard")
    public void user_is_on_the_dashboard() {

        BrowserUtils.verifyTitle("Dashboard - Symund - QA");

    }
    @When("user clicks on search bar")
    public void user_clicks_on_search_bar() {

        searchFunctionalitiesPage.magnifyingGlassSearchIcon.click();

    }
    @Then("user searches for files or contacts through magnifying glass icon in any module")
    public void user_searches_for_files_or_contacts_through_magnifying_glass_icon_in_any_module() {

        searchFunctionalitiesPage.searchBar.click();

        searchFunctionalitiesPage.searchBar.sendKeys("files");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchFunctionalitiesPage.filesOptionAfterSearch));

        searchFunctionalitiesPage.searchBar.sendKeys(Keys.ENTER);


    }
    @When("user clicks on file")
    public void user_clicks_on_file() {

        searchFunctionalitiesPage.thumbnailForFirstItemOnListOfFiles.click();

    }
    @When("user opens sidebar")
    public void user_opens_sidebar() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(searchFunctionalitiesPage.buttonForOpenSideBarOption));
        searchFunctionalitiesPage.buttonForOpenSideBarOption.click();

        wait.until(ExpectedConditions.visibilityOf(searchFunctionalitiesPage.openSideBarOption));
        searchFunctionalitiesPage.openSideBarOption.click();

    }
    @Then("user sees details inside page of file")
    public void user_sees_details_inside_page_of_file() {

       // BrowserUtils.waitForInvisibilityOf(searchFunctionalitiesPage.sideBarView);

        searchFunctionalitiesPage.sideBarView.isDisplayed();

    }


}
