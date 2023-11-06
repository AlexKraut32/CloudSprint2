package com.cloud.step_definitions;

import com.cloud.pages.DeckPage;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DeckModule_StepDefs {

LoginPage loginPage = new LoginPage();
DeckPage deckPage = new DeckPage();


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
    @When("User click Deck Module")
    public void user_click_deck_module() {

  deckPage.deckBtn.click();
    }
    @When("User should click Upcoming dropdown")
    public void user_should_click_upcoming_dropdown() {
  deckPage.upcomingCard.click();
    }
    @When("User should click add board and write {string}")
    public void user_should_click_add_board_and_write(String newBoard) {
        deckPage.addBoard.click();
        deckPage.inputBoardName.sendKeys(newBoard);
        deckPage.inputBoardNameButton.click();

    }  @Then("User verify {string} is displayed.")
    public void user_verify_is_displayed(String newBoard) {

        Assert.assertTrue(deckPage.newBoard.isDisplayed());
    }


    @When("User click deck module button")
    public void user_click_deck_module_button() {
      deckPage.deckBtn.click();


      deckPage.upcomingCard.click();

    }
    @When("User click on any board and plus button")
    public void user_click_on_any_board_and_plus_button() {
        Actions actions = new Actions(Driver.getDriver(ConfigurationReader.getProperty("url")));
        actions.moveToElement(deckPage.newBoard).click().perform();

        deckPage.addListBTn.click();
    }
    @When("User should write {string} in list name box")
    public void user_should_write_in_list_name_box(String listName) {
deckPage.listNameInput.sendKeys(listName);
 deckPage.listSubmitButton.click();
    }
    @Then("new list should displayed")
    public void new_list_should_displayed() {

        Assert.assertTrue(deckPage.newList.isDisplayed());
    }
    @When("user click on Add card button")
    public void user_click_on_add_card_button() {
        deckPage.deckBtn.click();
       // deckPage.upcomingCard.click();
        Actions actions = new Actions(Driver.getDriver(ConfigurationReader.getProperty("url")));
        actions.moveToElement(deckPage.newBoard).click().perform();

        deckPage.addListBTn.click();

        deckPage.newListButton.click();




    }
    @When("user write {string} inside the Card name box")
    public void user_write_inside_the_card_name_box(String newCard) {
     deckPage.cardNameInput.sendKeys(newCard);
     deckPage.cardSubmitBTn.click();

    }
    @Then("new card should display under board")
    public void new_card_should_display_under_board() {
       Assert.assertTrue(deckPage.newCard.isDisplayed());
    }
    @When("user click on three dots")
    public void user_click_on_three_dots() {
        deckPage.deckBtn.click();
        // deckPage.upcomingCard.click();
        Actions actions = new Actions(Driver.getDriver(ConfigurationReader.getProperty("url")));
        actions.moveToElement(deckPage.newBoard).click().perform();

        deckPage.addListBTn.click();

        deckPage.newListButton.click();

        deckPage.threeDotDropdown.click();
    }


    @When("user assign to himself")
    public void user_assign_to_himself() {
       deckPage.assignee.click();
    }
    @Then("assign should display")
    public void assign_should_display() {
      Assert.assertTrue(deckPage.assigneeImg.isDisplayed());
    }





}
