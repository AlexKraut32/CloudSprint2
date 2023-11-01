@B30G8-104
Feature: Default

	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to create a new conversation, add participants, and start and leave calls under the Talk module
	#
	#{color:#de350b}*_AC1:_* {color}
	#
	#Users can create a new conversation by adding any selected participant
	@B30G8-101
	Scenario: Users can create a new conversation by adding any selected participant
		Users can create a new conversation by adding any selected participant
		     Given the user logged in as "user"
		      When I access the Talk module
		      And I click on Create Conversation
		      Then a new conversation is created with me as the initiator
		      Then My Conversation are added to the conversation
		       When I select My Conversation from my contacts and added to the conversation	

	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to create a new conversation, add participants, start and leave a call under the Talk module
	#
	#{color:#de350b}*_AC:_* {color}
	#
	#Users can delete a conversation
	#h4.
	@B30G8-103
	Scenario: Verify users can delete a conversation
		Scenario: Verify users can delete a conversation
		       Given the user logged in as "user"
		       When I access the Talk module
		       When I choose to delete the conversation
		       Then the conversation is permanently removed from the Talk module