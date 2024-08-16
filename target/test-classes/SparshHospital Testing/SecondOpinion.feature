
@tag
Feature: Second Opinion link
  I want to use this template for my feature file

  @SmokeTesting
  Scenario: To validate the Second Opinion functionality
    Given Open the browser, enter the Sparsh hospital url
    And Select SPARSH Hospital, Yeswanthpur from the hospital dropdown and click on Second Opinion link
    When user enters firstName, lastName, phoneNumber, emailAddress
    And write a message and click on send button
    Then Thank you message should be displayed
    And bank info should be available in the page

  @tag2
  Scenario Outline: To validate the Second Opinion functionality with multiple test data
    Given Open the browser, enter the Sparsh hospital url
    And Select SPARSH Hospital, Yeswanthpur from the hospital dropdown and click on Second Opinion link
    When user enters "<firstName>", "<lastName>", "<phoneNumber>", "<emailAddress>"
    And write a message and click on send button
    Then Thank you message should be displayed
    And bank info should be available in the page

    Examples: 
			| firstName | lastName | phoneNumber | emailAddress 	       |		
      | Kanish  	| Chaddha  | 8800798573  | kanisch23@gmail.com   |		
      | Kunal 		| Singh 	 | 9908754780  | kunaSingh24@gmail.com |			
			| Hardev    | Gupta    | 7868787897  | harsh3400@gmail.com   |
			| Harry     | Chauhan  | 7868787897  | har870@gmail.com      |
      | Kanish    | chadda   | 7868787909  | harsh3400@gmail.com   |
#//Positive testing

#//Negative testing
			#| firstName | lastName | phoneNumber | emailAddress 	        |		
      #| Kanish  	 | Chaddha  | 8800798573  | kanisch23@gmail.com   |		
      #| Kunal 		 | Singh 	  | 9908754789  | kunaSingh24@gmail.com |			
			#| Hars@!r   | Gupta    | 7868787897  | harsh3400@gmail.com   |
			#| Har2345   | Gupta34  | 7868787897  | har870@gmail.com      |
      #| Kanish    | chadda   | 7868787ABC  | harsh3400@gmail.com   |

  
  
  