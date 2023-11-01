package com.cloud.step_definitions;

import com.cloud.pages.US001LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US001StepDefs {
    US001LoginPage us001LoginPage = new US001LoginPage();

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

    @Then("user check if all Modules presented on the page")
    public void user_check_if_all_modules_presented_on_the_page() {

    }
    @Then("user check if Username is showing on the Home page")
    public void user_check_if_username_is_showing_on_the_home_page() {

    }

    @Then("user click on Customize button")
    public void user_click_on_customize_button() {

    }
    @Then("select any of the Widgets")
    public void select_any_of_the_widgets() {

    }
    @Then("user check if selected Widgets presented on the Home page")
    public void user_check_if_selected_widgets_presented_on_the_home_page() {

    }

    @Then("user click on Set Status button")
    public void user_click_on_set_status_button() {

    }
    @Then("select any of the Status options")
    public void select_any_of_the_status_options() {

    }
    @Then("user check if selected Status option is showing on the page")
    public void user_check_if_selected_status_option_is_showing_on_the_page() {

    }

}
