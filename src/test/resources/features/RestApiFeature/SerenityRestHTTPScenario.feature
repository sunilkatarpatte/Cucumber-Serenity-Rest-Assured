  
Feature: GETPosts- Verify different HTTP operations using REST-assured

	@Rest
  Scenario: Verify all employees details
    Given I perform GET operation for "/employees"
    Then I should see all employee details with success code

	@Rest
  Scenario: Verify collection of authors in the post
    Given I perform POST operation for "/create"
    Then I should see the created employee name
    
    #Scenario: Verify Parameter of Get
    #Given I perform GET operation for "/posts"
    #Then I should see verify GET Parameter