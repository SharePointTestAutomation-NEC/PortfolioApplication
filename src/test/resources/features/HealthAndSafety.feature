@HealthAndSafety
Feature: Portfolio Application
  As we are covering in this feature file as Health and Safety
  Create the Accident near miss and Fire Safety and site Assesment

  Background:
   # Given I have logged into sharepoint

  @TC001_Accident   #done
  Scenario: Verify to record the accident information details
    Given I have logged in full permission user model AdminRights
    And   I click on Health and Facility icon from side bar
    And   I click on Accident option
    And   I click on Create plus icon button and creating the NPS General Details
    And   Fill the Accident Details and Save it
    And   I click the on the Save Button
    Then  Verify the Accident record once we Save it

  @TC002_NearMissPotentialAccident   #done
  Scenario: Verify to record the accident information details
    Given I have logged in full permission user model AdminRights
    And   I click on Health and Facility icon from side bar
    And   I click on Potential Accident option
    And   I click on Create plus icon button and creating the NPS General Details
    And   Fill the Accident Details and Save it
    And   I click the on the Save Button
    Then  Verify the Accident record once we Save it


  @TC003_FireSafety   #done
  Scenario: Verify to record the accident information details
    Given I have logged in full permission user model AdminRights
    And   I click on Health and Facility icon from side bar
    And   I click on Fire Safety and Inception option
    And   I click on Create plus icon button and creating the NPS General Details
    And   Fill the Fire Safety Details and Save it
    And   I click the on the Save Button
    Then  Verify the Accident record once we Save it



  @TC004_SiteAsismentAndInception   #done
  Scenario: Verify to record the accident information details
    Given I have logged in full permission user model AdminRights
    And   I click on Health and Facility icon from side bar
    And   I click on SiteAssisment and Inception option
    And   I click on Create plus icon button and creating the NPS General Details
    And   Fill the Site Assisment and Inception Details and Save it
    And   I click the on the Save Button
    Then  Verify the Accident record once we Save it
