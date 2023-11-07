Feature: Providing required data for register using data Table
  
  Background: Given url to launch webpage
 
  @ValidCredentials
  Scenario: Register using valid credentials
    Given User clicking register button to enter credentials
    When User clicking radio button
    And User entering firstname,Lastname,email,password and also confirm password
    | FirstName      | LastName    |            Email              | Password    | Confirm Password |
    | Aarthi         | Kumaresan   | aarthi.kumaresan75@gmail.com    | Aarthi@123  |  Aarthi@123       |
      
    Then User clicks register button
    