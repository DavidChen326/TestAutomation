#using Gherkin language
Feature: Test the login functionality on Indebted App platform

Scenario Outline: the user should be able to login
Given user is on the login page
When user enters email <email>
And user enters password <password>
And user clicks login button
Then user logged in to the platform

Examples:
| email |password |
| david@indebted.io | J7EUSz02AV5R|
| david@indebted.io | a123456|