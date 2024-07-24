@activity1
Feature: DuckDuckGo Search

@smoketest
Scenario: Searching for Cheese on DuckDuckGo
Given User is on DuckDuckGo website
When User searches for cheese
Then User should see search results
