Feature: User Login functionality of Curebay Mobile App

 @Sanity
  Scenario: Login the Curebay Mobile Application
    When the user taps the SignUp button from the HomePage
		Then the user should be able to see the login page
		When the user logs into the application by providing the valid credentials "Leelareddy@gmail.com" and password as "Leela@12345"
		Then the user should be able to see the dashboard screen
		When the user taps on Sign Out
		Then the user should see the HomePage