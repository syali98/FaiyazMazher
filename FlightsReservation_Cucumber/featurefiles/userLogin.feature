@tag
Feature: User Login 
  I want to use this template to validate User Login feature

  @tag1
  Scenario: User Login with valid inputs
    Given i open the browser with url "https://flights.qedgetech.com/"
    Then i should see login page
   	When i enter username "syedfaiyazali043@gmail.com"
   	And i enter password "Ally$9198"
   	And i click signin 
   	Then it should display user dashboard
   	When i click logout
   	Then i should see login page
   	When i close the browser

  @tag2
  Scenario Outline: User Login with invalid inputs
  Given i open the browser with url "https://flights.qedgetech.com/"
  Then i should see login page
	When i enter username "<username>"
   And i enter password "<password>"
   And i click signin 
   Then i should see appropriate error message
   When i close the browser
   
   Examples:
   |username|password|
   |syedfaiyazali043@gmail.com|xyz|
   |abc@gmail.com|Ally$9198|
   |abc@gmail.com|xyz|
   
   
   
   