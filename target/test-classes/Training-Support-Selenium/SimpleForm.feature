
@tag
Feature: Simple form feature

  @tag1
  Scenario: To validate the Simple form functionality
    Given Open the browser, enter the training-support-selenium url
    When user enters firstname, lastname, email, contact number, message
    And click on submit button
    Then Thank You for reaching out to us, Gabbar message should be displayed
    And click on OK button

  @tag2
  Scenario Outline: To validate the Simple form functionality with multiple test data
    Given Open the browser, enter the training-support-selenium url
    When user enters "<firstname>", "<lastname>", "<email>", "<contact number>", "<message>"
    And click on submit button
    Then Thank You for reaching out to us, Gabbar message should be displayed
    And click on OK button

    Examples: 
      | firstname | lastname  | email                | contact number | message                   														|
      | Sambha    | Daku      | sambha555@gamail.com | 9988880005     | Sarkar teen               														|
      | Basanti   | TangAWali | Basi420@gamail.com   | 9988880088     | Chal Dhanno-Ehiii-hi-hi.. 														|
      | Veeru     | Thug      | veer440@gmail.com    | 1188880999     | Basanti een kutto ke samne mat nachna                 |
      | Jai       | Thug      | jai560@gmail.com     | 9900001115     | Hum jaha khade ho teh hai line vahi sai suru hoti hai | 
      | Thakur    | Kanna     | thakChu12@gmail.com  | 6789054667     | Gabbar, Yeh Hath mujhe dede                           |
  
  
  