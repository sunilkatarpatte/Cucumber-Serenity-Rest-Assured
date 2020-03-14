  
Feature: GETPosts- Verify different GET operations using REST-assured

	@Rest
  Scenario: Verify all employees details
    Given I perform GET operation for "/employees"
    Then I should see all employee details with success code

  #Scenario: Verify collection of authors in the post
    #Given I perform GET operation for "/posts"
    #Then I should see the author names
    #
    #Scenario: Verify Parameter of Get
    #Given I perform GET operation for "/posts"
    #Then I should see verify GET Parameter