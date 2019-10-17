Feature: Application Login

Scenario: Homepage default login
Given User is on the internet banking landing page
When User logs on to app with "John" and password "1234"
Then Homepage is populated
And Banking cards are displayed "true"


Scenario: Homepage different login one
Given User is on the internet banking landing page
When User logs on to app with "Jim" and password "4321"
Then Homepage is populated
And Banking cards are displayed "false" 