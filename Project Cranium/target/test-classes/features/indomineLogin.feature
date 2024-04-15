@All
  Feature: Login Indomine

    @positive @login
    Scenario: Success Login
      Given User is on indomine homepage
      Then user click button login
      And user input field email
      And user input field password
      And user click button login on login page

    @positive2 @login
    Scenario: user back to homepage
      Given User is on indomine homepage
      Then user click button login
      Then user click wording button Kembali ke homepage


     @negative1 @login
     Scenario: login with email and password is wrong
       Given User is on indomine homepage
       Then user click button login
       And user input the wrong email
       And user input the wrong password and click button login

     @negative2 @login
     Scenario: login with email wrong
       Given User is on indomine homepage
       Then user click button login
       And user input the wrong email
       And user input the correct password and click login button

     @negative3 @login
     Scenario: login with wrong password
       Given User is on indomine homepage
       Then user click button login
       And user input the correct email
       And user input the wrong password and click button login

     @negative4 @login
     Scenario: user login without input field email and password
       Given User is on indomine homepage
       Then user click button login
       And user click button login on login page without input field email and password



