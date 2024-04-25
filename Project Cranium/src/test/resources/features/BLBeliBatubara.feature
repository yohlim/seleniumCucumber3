@All
  # Buat Listing Beli Batubara
Feature: Create a coal buying listing

  @positive @coalbuying
  Scenario: Success to create a coal buying listing
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field gar beli batubara
    And user input field TS beli batubara
    And user input field ASH beli batubara
    And user input field Quantity beli batubara
    And user input field laycan date beli batubara
    And user input field harga beli batubara
    And user input loading port beli batubara
    And user input field sumber batu beli batubara
    Then user click button cari batubara

  @negative1 @coalbuying
  Scenario: user Success to create a coal buying listing without input field laycan date
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field gar beli batubara
    And user input field TS beli batubara
    And user input field ASH beli batubara
    And user input field Quantity beli batubara
    And user input field harga beli batubara
    And user input loading port beli batubara
    And user input field sumber batu beli batubara
    Then user click button cari batubara

  @negative2 @coalbuying
  Scenario: user Success to create a coal buying listing without input field loading port
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field gar beli batubara
    And user input field TS beli batubara
    And user input field ASH beli batubara
    And user input field Quantity beli batubara
    And user input field laycan date beli batubara
    And user input field harga beli batubara
    And user input field sumber batu beli batubara
    Then user click button cari batubara

  @negative3 @coalbuying
  Scenario: user Success to create a coal buying listing without input field sumber batu
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field gar beli batubara
    And user input field TS beli batubara
    And user input field ASH beli batubara
    And user input field Quantity beli batubara
    And user input field laycan date beli batubara
    And user input field harga beli batubara
    And user input loading port beli batubara
    Then user click button cari batubara

  @negative4 @coalbuying
  Scenario: user Success to create a coal buying listing without input field loading port dan sumber batu
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field gar beli batubara
    And user input field TS beli batubara
    And user input field ASH beli batubara
    And user input field Quantity beli batubara
    And user input field laycan date beli batubara
    And user input field harga beli batubara
    Then user click button cari batubara

  @negative5 @coalbuying
  Scenario: user can't create coal buying if doesn't input field gar
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field TS beli batubara
    And user input field ASH beli batubara
    And user input field Quantity beli batubara
    And user input field laycan date beli batubara
    And user input field harga beli batubara
    And user input loading port beli batubara
    And user input field sumber batu beli batubara
    Then appear mess err when user click button cari batubara

  @negative6 @coalbuying
  Scenario: user can't create coal buying if doesn't input field TS
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field gar beli batubara
    And user input field ASH beli batubara
    And user input field Quantity beli batubara
    And user input field laycan date beli batubara
    And user input field harga beli batubara
    And user input loading port beli batubara
    And user input field sumber batu beli batubara
    Then appear mess err when user click button cari batubara

  @negative7 @coalbuying
  Scenario: user can't create coal buying if doesn't input field ASH
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field gar beli batubara
    And user input field TS beli batubara
    And user input field Quantity beli batubara
    And user input field laycan date beli batubara
    And user input field harga beli batubara
    And user input loading port beli batubara
    And user input field sumber batu beli batubara
    Then appear mess err when user click button cari batubara

  @negative8 @coalbuying
  Scenario: user can't create coal buying if doesn't input field Quantity
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field gar beli batubara
    And user input field TS beli batubara
    And user input field ASH beli batubara
    And user input field laycan date beli batubara
    And user input field harga beli batubara
    And user input loading port beli batubara
    And user input field sumber batu beli batubara
    Then appear mess err when user click button cari batubara

  @negative9 @coalbuying
  Scenario: user can't create coal buying if doesn't input field harga batubara
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button beli batubara
    And user input field gar beli batubara
    And user input field TS beli batubara
    And user input field ASH beli batubara
    And user input field Quantity beli batubara
    And user input loading port beli batubara
    And user input field sumber batu beli batubara
    Then appear mess err when user click button cari batubara

