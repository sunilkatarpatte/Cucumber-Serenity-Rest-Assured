Feature: Jira ID 01 I want to verify and enter all details on sample form

  @demo1
  Scenario: Failure Scenario verify all mandatory details on form
  	Given open sample form
  	When enter all details on the form
  	And click on submit
  	Then verify all details submitted "failed" scenario