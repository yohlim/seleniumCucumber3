@All
# Buat Listing Jual Batubara
Feature: Create a coal selling listing

  @Positive1 @coalSelling
  Scenario: Success create a coal
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
#    And user access form jual batubara
    And user click button buat listingan
    And user click on button jual batubara
    And user input field GAR
    And user input field TS
    And user input field Ash
    And user input field Quantity
    And user input field Harga Batubara
    And user input field Sumber Batu
    And user input field loading port
    And user input field laycan date
    And user upload document from directory
    And user click button submit
    And user input field description
    And user click on button publish

  @negative1 @coalSelling
   Scenario: user can't create a coal for to selling if doesn't input field GAR
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button jual batubara
    And user input field TS
    And user input field Ash
    And user input field Quantity
    And user input field Harga Batubara
    And user input field Sumber Batu
    And user input field loading port
    And user input field laycan date
    And user upload document from directory
    And user click button submit
    And user input field description
    And user click button publish

  @negative2 @coalSelling
  Scenario: user can't create a coal for to selling if doesn't input field TS
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button jual batubara
    And user input field GAR
    And user input field Ash
    And user input field Quantity
    And user input field Harga Batubara
    And user input field Sumber Batu
    And user input field loading port
    And user input field laycan date
    And user upload document from directory
    And user click button submit
    And user input field description
    And user click button publish