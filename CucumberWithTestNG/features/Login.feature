Feature: Login Functionality

Scenario: Successfull Login Test with valid credentials
Given User should launch the browser 
And Naviagate to the SignIn Page
When Enter emial and password
And Click on SignIn button
Then It should display the dashboard
