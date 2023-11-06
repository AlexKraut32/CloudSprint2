package com.cloud.step_definitions;

import com.cloud.pages.DashboardPage;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class DashboardIconAccessStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

        List<WebElement> webElements = new ArrayList<>();

        Actions actions = new Actions(Driver.getDriver(ConfigurationReader.getProperty("url")));

    @Given("user is on any page other than dashboard")
    public void user_is_on_any_page_other_than_dashboard() {

        webElements.add(dashboardPage.filesIcon);
        webElements.add(dashboardPage.photosIcon);
        webElements.add(dashboardPage.activityIcon);
        webElements.add(dashboardPage.talkIcon);
        webElements.add(dashboardPage.mailIcon);
        webElements.add(dashboardPage.contactsIcon);
        webElements.add(dashboardPage.circlesIcon);
        webElements.add(dashboardPage.calendarIcon);
        webElements.add(dashboardPage.notesIcon);
        webElements.add(dashboardPage.decksIcon);
        webElements.add(dashboardPage.tasksIcon);


        for(WebElement each : webElements){

            actions.click(each).perform();

            if(each.equals(dashboardPage.tasksIcon)){
                break;
            }

        }

        Assert.assertFalse(Driver.getDriver(ConfigurationReader.getProperty("url")).getTitle().contains("Dashboard - Symund - QA")); // ensure title of page is NOT dashboard title

    }

    @When("user can see app icon in left corner")
    public void user_can_see_app_icon_in_left_corner() {

        dashboardPage.symundDashboardIcon.isDisplayed();

    }

    @When("user clicks on app icon")
    public void user_clicks_on_app_icon() {

        for(WebElement each : webElements){

            actions.click(each).perform();

            if(each.equals(dashboardPage.tasksIcon)){
                break;
            }
        }

    }

    @Then("user navigates back to dashboard")
    public void user_navigates_back_to_dashboard() {

        actions.click(dashboardPage.filesIcon);
        actions.click(dashboardPage.symundDashboardIcon);

        actions.click(dashboardPage.calendarIcon);
        actions.click(dashboardPage.symundDashboardIcon);

        actions.click(dashboardPage.contactsIcon);
        actions.click(dashboardPage.symundDashboardIcon);

        }

    }


