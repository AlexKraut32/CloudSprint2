package com.cloud.step_definitions;

import com.cloud.pages.TalkModulePage;
import com.cloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;

public class TalkModuleStepDefinitions {
    TalkModulePage taskPage = new TalkModulePage();


    @When("I access the Talk module")
    public void iAccessTheTalkModule() {
        taskPage.talkButton.click();

    }


    @And("I click on Create Conversation")
    public void iClickOnCreateConversation() {
        taskPage.newConvBtn.click();

    }

    @Then("a new conversation is created with me as the initiator")
    public void a_new_conversation_is_created_with_me_as_the_initiator() throws InterruptedException {

        taskPage.allowsCheckButton.click();

        taskPage.conversationNameInput.sendKeys("Employee10");
       Thread.sleep(4000);
        taskPage.AddPartBtn.click();

        BrowserUtils.sleep(5);

        taskPage.searchParticipantInput.sendKeys("Employee10");
        BrowserUtils.sleep(5);
        taskPage.participantName.click();



}

    @When("I select My Conversation from my contacts and added to the conversation")
    public void iSelectMyConversationFromMyContactsAndAddedToTheConversation() {
        BrowserUtils.waitFor(5);
        taskPage.CreateConvBtn.click();
        BrowserUtils.waitFor(5);
        taskPage.closeBtn.click();


    }
    @Then("My Conversation are added to the conversation")
    public void myConversationAreAddedToTheConversation() {
        Assert.assertTrue(taskPage.conversationElement.isDisplayed());

    }

    @When("I choose to delete the conversation")
    public void iChooseToDeleteTheConversation() {
        taskPage.menuBtn.click();
        taskPage.deleteBtn.click();
        taskPage.clickBtn.click();

    }

    @Then("the conversation is permanently removed from the Talk module")
    public void theConversationIsPermanentlyRemovedFromTheTalkModule() {










    }
}