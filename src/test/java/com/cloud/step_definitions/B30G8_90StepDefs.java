package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.pages.US013Page;
import com.cloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class B30G8_90StepDefs {

    LoginPage loginPage = new LoginPage();
    US013Page us013Page = new US013Page();

    @Given("user go to the login page")
    public void user_go_to_the_login_page() {


    }

    @When("user enters {string} and a {string}")
    public void user_enters_and_a(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);


    }
    @Then("user click Log in button")
    public void user_click_log_in_button() {
        loginPage.submit.click();

    }
    @Then("user landing on the Home page")
    public void user_landing_on_the_home_page() {


    }

    @When("User navigate to the {string}")
    public void user_navigate_to_the(String string) {

        us013Page.profileLink.click();
    }
    @Then("User should see the {string} section")
    public void user_should_see_the_section(String string) {
        us013Page.settingsLink.click();


    }
    @Then("the {string} section should contain the following titles:")
    public void the_section_should_contain_the_following_titles(String string, List<String> expectedTitles) {
        us013Page.personalInfoLink.click();

        /*List<String> actualTitle = new ArrayList<>();

        for (WebElement eachTitle : us013Page.allTitles){
            actualTitle.add(eachTitle.getText());

        }

        Assert.assertEquals(expectedTitles,actualTitle);

         */

    }


    @Given("User on the settings page")
    public void user_on_the_settings_page() {
        us013Page.profileLink.click();
        us013Page.settingsLink.click();
        us013Page.profileLink.click();
    }
    @When("user see the {string} input box")
    public void user_see_the_input_box(String string) {
        us013Page.settingName.getText();
    }
    @When("user see the {string} in the settings field")
    public void user_see_the_in_the_settings_field(String string) {
        us013Page.inputName.getText();
    }
    @Then("the {string} input box  should be the same as the {string}")
    public void the_input_box_should_be_the_same_as_the(String settingName, String inputName) {
        us013Page.settingName.isDisplayed();
        us013Page.inputName.isDisplayed();

            if (settingName.equals(inputName)){
                System.out.println(settingName + " input box  the same as the " + inputName);
            }else{
                System.out.println(settingName + " input box  is not be the same as the " + inputName);
            }

    }

    @Given("User on the page with the phone number input box")
    public void user_on_the_page_with_the_phone_number_input_box() {
        us013Page.profileLink.click();
        us013Page.settingsLink.click();
        us013Page.phoneNumberInputBox.click();
    }
    @When("User enter a non-numeric character into the phone number input box")
    public void user_enter_a_non_numeric_character_into_the_phone_number_input_box() {
        us013Page.phoneNumberInputBox.sendKeys("alskjfkjrhgj");
        BrowserUtils.waitFor(3);
        us013Page.phoneNumberInputBox.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);
    }
    @Then("the non-numeric character is not entered into the input box")
    public void the_non_numeric_character_is_not_entered_into_the_input_box() {

    }
    @When("User enter a numeric character into the phone number input box")
    public void user_enter_a_numeric_character_into_the_phone_number_input_box() {
        us013Page.phoneNumberInputBox.clear();
        us013Page.phoneNumberInputBox.sendKeys("7372177294");
        BrowserUtils.waitFor(3);

    }
    @Then("the numeric character is entered into the input box")
    public void the_numeric_character_is_entered_into_the_input_box() {
        us013Page.phoneNumberInputBox.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);
    }

}
