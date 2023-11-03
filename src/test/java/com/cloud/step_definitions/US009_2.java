package com.cloud.step_definitions;

import com.cloud.pages.DashboardIconPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class US009_2 {

    DashboardIconPage dashboardIconPage = new DashboardIconPage();

        List<WebElement> webElements = new ArrayList<>();

        Actions actions = new Actions(Driver.getDriver());

    @Given("user is on any page other than dashboard")
    public void user_is_on_any_page_other_than_dashboard() {

        webElements.add(dashboardIconPage.filesIcon);
        webElements.add(dashboardIconPage.photosIcon);
        webElements.add(dashboardIconPage.activityIcon);
        webElements.add(dashboardIconPage.talkIcon);
        webElements.add(dashboardIconPage.mailIcon);
        webElements.add(dashboardIconPage.contactsIcon);
        webElements.add(dashboardIconPage.circlesIcon);
        webElements.add(dashboardIconPage.calendarIcon);
        webElements.add(dashboardIconPage.notesIcon);
        webElements.add(dashboardIconPage.decksIcon);
        webElements.add(dashboardIconPage.tasksIcon);


        for(WebElement each : webElements){

            actions.click(each).perform();

            if(each.equals(dashboardIconPage.tasksIcon)){
                break;
            }

        }

        Assert.assertFalse(Driver.getDriver().getTitle().contains("Dashboard - Symund - QA")); // ensure title of page is NOT dashboard title

    }

    @When("user can see app icon in left corner")
    public void user_can_see_app_icon_in_left_corner() {

        dashboardIconPage.symundDashboardIcon.isDisplayed();

    }

    @When("user clicks on app icon")
    public void user_clicks_on_app_icon() {

        for(WebElement each : webElements){

            actions.click(each).perform();

            if(each.equals(dashboardIconPage.tasksIcon)){
                break;
            }
        }

    }

    @Then("user navigates back to dashboard")
    public void user_navigates_back_to_dashboard() {

        actions.click(dashboardIconPage.filesIcon);
        actions.click(dashboardIconPage.symundDashboardIcon);

        actions.click(dashboardIconPage.calendarIcon);
        actions.click(dashboardIconPage.symundDashboardIcon);

        actions.click(dashboardIconPage.contactsIcon);
        actions.click(dashboardIconPage.symundDashboardIcon);

        }

    }


