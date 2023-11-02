package com.cloud.step_definitions;

import com.cloud.pages.US001HomePage;
import com.cloud.pages.US001LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US001StepDefs {
    US001LoginPage us001LoginPage = new US001LoginPage();
    US001HomePage us001HomePage = new US001HomePage();
    Boolean statusButtonDisplayed = false;

    @Given("user go to the login page")
    public void user_go_to_the_login_page() {

        Driver.getDriver().get("https://qa.symund.com/index.php/login");
    }

    @When("user enters {string} and a {string}")
    public void user_enters_and_a(String username, String password) {
        us001LoginPage.usernameBox.sendKeys(username);
        us001LoginPage.passwordBox.sendKeys(password);
    }

    @Then("user click Log in button")
    public void user_click_log_in_button() {
        us001LoginPage.loginButton.click();
    }

    @Then("user landing on the Home page")
    public void user_landing_on_the_home_page() {

        BrowserUtils.verifyTitle("Dashboard - Symund - QA");
    }

    @Then("user check if all {string} presented on the page")
    public void userCheckIfAllPresentedOnThePage(String arg0) {
        WebElement dashboard = Driver.getDriver().findElement(By.xpath("//li[@data-id='" + arg0 + "']"));
        dashboard.isDisplayed();
    }

    @Then("user check if Username is showing on the Home page")
    public void user_check_if_username_is_showing_on_the_home_page() {
        WebElement dropdownUsername = Driver.getDriver().findElement(By.xpath("//span[@class='user-status-menu-item__header']"));
        dropdownUsername.isDisplayed();

    }

    @Then("user click on Customize button")
    public void user_click_on_customize_button() {
        if (us001HomePage.statusButton.isDisplayed()){
            statusButtonDisplayed=true;
        }


        WebElement customizeButton = Driver.getDriver().findElement(By.xpath("//a[.='Customize']"));
        customizeButton.click();

    }

    @And("select Widgets - {string} and {string} and check if selected Widgets presented on the Home page")
    public void selectWidgetsAndAndCheckIfSelectedWidgetsPresentedOnTheHomePage(String arg0, String arg1) {
        WebElement checkboxCalendar = Driver.getDriver().findElement(By.xpath("//label[@for='panel-checkbox-" + arg0 + "']"));
        checkboxCalendar.click();
        checkboxCalendar.isSelected();
        WebElement checkboxSpreed = Driver.getDriver().findElement(By.xpath("//label[@for='panel-checkbox-" + arg1 + "']"));
        checkboxSpreed.click();
        checkboxSpreed.isSelected();
        Driver.getDriver().navigate().back();
        Assert.assertTrue("status button is not displayed", statusButtonDisplayed);


    }

    @Then("user click on Set Status button")
    public void user_click_on_set_status_button() {
        WebElement statusButton = Driver.getDriver().findElement(By.xpath("//button[@href='#']"));
        statusButton.click();
    }

    @And("select any of the Status - {string} and check if selected Status option is showing on the page")
    public void selectAnyOfTheStatusAndCheckIfSelectedStatusOptionIsShowingOnThePage(String arg0) {
        WebElement statusOption = Driver.getDriver().findElement(By.xpath("//label[@for='user-status-online-status-" + arg0 + "']"));
        statusOption.click();
        Driver.getDriver().navigate().back();
        WebElement statusButton = Driver.getDriver().findElement(By.xpath("//button[@href='#']/span[contains(@class, '" + arg0 + "')]"));
        statusButton.isDisplayed();
    }
}



