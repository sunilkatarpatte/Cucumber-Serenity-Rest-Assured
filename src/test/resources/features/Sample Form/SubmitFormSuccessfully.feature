Feature: Jira id 02 I want to verify and enter all details on sample form

  @demo1
  Scenario: Passed scenario verify all mandatory details on form
  	Given open sample form
  	When enter all details on the form
  	And click on submit
  	Then verify all details submitted "Pass" scenario