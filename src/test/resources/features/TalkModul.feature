    @B30G8-124
      Feature: user  should be able to create a new conversation, add participant, start and leave call under the Talk module

		      @B30G8-125
	          Scenario: Users can create a new conversation by adding any selected participant
				 Given the user logged in as "user"
				 And I access the Talk module
				 When I click on Create Conversation
				 Then a new conversation is created with me as the initiator
		         And My Conversation are added to the conversation
		         And I select My Conversation from my contacts and added to the conversation

	          @B30G8-126
	           Scenario: Verify users can delete a conversation
				  Given the user logged in as "user"
				  And I access the Talk module
		           When I choose to delete the conversation
		         Then the conversation is permanently removed from the Talk module