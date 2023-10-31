package com.cloud.step_definitions;

import com.cloud.pages.US001HomePage;
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

}
