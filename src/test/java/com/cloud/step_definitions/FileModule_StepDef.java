package com.cloud.step_definitions;

import com.cloud.pages.FilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.security.Key;

public class FileModule_StepDef {
FilePage filePage = new FilePage();
    @When("user click on file module and user click all file")
    public void user_click_on_file_module_and_user_click_all_file() {
       filePage.fileModule.click();
       filePage.allFiles.click();
    }
    @When("User click on three dots from its own click add favroites")
    public void user_click_on_three_dots_from_its_own_click_add_favroites() {
      filePage.threeDots.click();
      filePage.addToFavorites.click();
    }
    @Then("user should see newly added file in favorites")
    public void user_should_see_newly_added_file_in_favorites() {
        filePage.favorites.click();
        Assert.assertTrue(filePage.newFileToFavorites.isDisplayed());
    }

    @When("user click on file module and click on all file")
    public void user_click_on_file_module_and_click_on_all_file() {
       filePage.fileModule.click();
       filePage.allFiles.click();


    }
    @When("user click three dots on its own and click rename")
    public void user_click_three_dots_on_its_own_and_click_rename() {
       filePage.threeDots.click();
       filePage.renameBtn.click();

    }
    @Then("user {string} the file")
    public void user_the_file(String rename) {
       filePage.renameInput.sendKeys(rename);
    }


    @When("user click on three dots on its own and click details")
    public void user_click_on_three_dots_on_its_own_and_click_details() {
       filePage.fileModule.click();
       filePage.allFiles.click();
       filePage.threeDots.click();
       filePage.details.click();


    }
    @Then("user click on comments and write {string} and press enter")
    public void user_click_on_comments_and_write_and_press_enter(String comment) {
       filePage.comments.click();
       filePage.commentsInput.sendKeys(comment);
       filePage.commentSubmitBtn.click();

    }

}
