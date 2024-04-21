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
