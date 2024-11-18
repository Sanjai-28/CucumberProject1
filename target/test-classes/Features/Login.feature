Feature: Login Page of App

Scenario Outline: Check login is successfull with valid credentials
Given user is on login page
When user enters valid "<username>" and "<password>"
And user clicks login button
Then user navigated to homepage
And Close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce|