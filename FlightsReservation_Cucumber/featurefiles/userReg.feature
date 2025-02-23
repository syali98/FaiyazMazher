@tag
Feature: User Registration 
  I want to use this template to vaildate user registration feature

  @tag1
  Scenario: Check User Registration Feature
    Given i open the browser with url "https://flights.qedgetech.com/"
    Then i should see login page
    When i click Register link
    Then i should see user registration page
    When i enter name "Baba Baba"
    And i enter contact number "9198919098"
    And i enter email "Ally123@gmail.com"
    And i enter password "Ally$9198"
    And i enter gender as "Male"
    And i enter DOB "04-08-2003"
    And i click privacy policy check box 
    And i click Register button
    Then i should see user registration successful
    When i close the browser
    
    
    
    
  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
