package com.cloud.step_definitions;

import com.cloud.pages.ContactGroupPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactGroup_StepDef {

    ContactGroupPage contactGroupPage = new ContactGroupPage();

    @Given("user go to the login page")
    public void user_go_to_the_login_page() {

        Driver.getDriver().get("https://qa.symund.com/index.php/login");
    }

    @When("user enters {string} and a {string}")
    public void user_enters_and_a(String username, String password) {
        contactGroupPage.user.sendKeys(username);
        contactGroupPage.password.sendKeys(password);
    }

    @Then("user click Log in button")
    public void user_click_log_in_button() {
       contactGroupPage.loginInButton.click();
    }

    @Then("user landing on the Home page")
    public void user_landing_on_the_home_page() {

        BrowserUtils.verifyTitle("Dashboard - Symund - QA");
    }

    @Given("User is on Contacts page")
    public void userIsOnContactsPage() {
        contactGroupPage.contactModule.click();
    }

    @When("User press plus button")
    public void userPressPlusButton() {
        contactGroupPage.createButton.click();
    }

    @And("User sees Create a new group window")
    public void userSeesCreateANewGroupWindow() {
        contactGroupPage.createGroupWindow.isDisplayed();
    }

    @Then("User types group name in the text area and press enter")
    public void userTypesGroupNameInTheTextAreaAndPressEnter(List<String> groupList) {
        contactGroupPage.inputArea.sendKeys(groupList.get(0), Keys.ENTER);
        contactGroupPage.createButton.click();
        contactGroupPage.inputArea.sendKeys(groupList.get(1), Keys.ENTER);
        contactGroupPage.createButton.click();
        contactGroupPage.inputArea.sendKeys(groupList.get(2), Keys.ENTER);
    }
    @Then("User should create new contact and add to the groups")
    public void userShouldCreateNewContactAndAddToTheGroups() {
        contactGroupPage.allContacts.click();

            contactGroupPage.groupsDropdown.click();
            contactGroupPage.cinema.click();
            contactGroupPage.music.click();
            contactGroupPage.theatre.click();


    }

    @Given("User clicks All contacts module")
    public void userClicksAllContactsModule() {
        contactGroupPage.allContacts.click();
    }

    @And("User clicks Groups dropdown menu")
    public void userClicksGroupsDropdownMenu() {
        contactGroupPage.groupsDropdown.click();
    }

    @Then("User can see all the available groups name")
    public void userCanSeeAllTheAvailable(List<String> groupList) {
      Assert.assertEquals(groupList.get(0),contactGroupPage.cinema.getText());
      Assert.assertEquals(groupList.get(1),contactGroupPage.music.getText());
      Assert.assertEquals(groupList.get(2),contactGroupPage.theatre.getText());
    }

    @Given("User clicks Add property dropdown menu")
    public void userClicksAddPropertyDropdownMenu() {
        contactGroupPage.addNewProperty.click();
    }

    @When("User choose Anniversary from the list")
    public void userChooseAnniversaryFromTheList() {
        contactGroupPage.anniversary.click();
    }

    @Then("User can see Anniversary block")
    public void userCanSeeBlock() {
        contactGroupPage.anniversaryTitle.isDisplayed();
    }

}
