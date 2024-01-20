Feature: Amazon login feature

  Scenario Outline: Amazon login scenario
    Given user is already on Amazon page 
    When user enters email as <email>
    And user enters password as <password>
    
    Examples: 
    |email						|password			|
    |sneha@gamil.com	|Sneha@123		|

