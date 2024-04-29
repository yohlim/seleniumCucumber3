@All
# Buat Listing Jual nickel
Feature: Create a nickel selling listing

  @Positive1 @nickelSelling
  Scenario: Success create a nickel
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button jual nickel
    And user input field Ni on selling form
    And user input field Fe on selling form
    And user input field Kadar air on selling form
    And user input field Si atau Mg on selling form
    And user input field Quantity on selling form
    And user input field harga nickel on selling form
    And user input field Sumber Batu on selling form
    And user input field loading port on selling form
    And user input field Laycan date on selling form
    And user upload dokumen on selling form
    And user click button submit on selling form
    And user input field deskripsi on selling form
    And user button publish on selling form

  @Positive2 @nickelSelling
  Scenario: Success creates a nickel with company selected to display
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button jual nickel
    And user input field Ni on selling form
    And user input field Fe on selling form
    And user input field Kadar air on selling form
    And user input field Si atau Mg on selling form
    And user input field Quantity on selling form
    And user input field harga nickel on selling form
    And user input field Sumber Batu on selling form
    And user input field loading port on selling form
    And user input field Laycan date on selling form
    And user upload dokumen on selling form
    And user click button submit on selling form
    And user input field deskripsi on selling form
    And user select company to display listing on nickel form
    And user button publish on selling form

  @Positive3 @nickelSelling
  Scenario: Success create a nickel without input field description
    Given User is on indomine homepage
    Then user click button login
    And user input field email
    And user input field password
    And user click button login on login page and redirect to homepage
    And user click button buat listingan
    And user click on button jual nickel
    And user input field Ni on selling form
    And user input field Fe on selling form
    And user input field Kadar air on selling form
    And user input field Si atau Mg on selling form
    And user input field Quantity on selling form
    And user input field harga nickel on selling form
    And user input field Sumber Batu on selling form
    And user input field loading port on selling form
    And user input field Laycan date on selling form
    And user upload dokumen on selling form
    And user click button submit on selling form
    And user select company to display listing on nickel form
    And user button publish on selling form