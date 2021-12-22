@FacilitiesManagement
Feature: Portfolio Application Facilities Management
  As we are covering in this feature file as Facilities Management
  Create the FM call Los
  NPS Facility Services

  Background:
   # Given I have logged into sharepoint

  @TC001_LogComplainFMCall   #done
  Scenario: Log the FM call complain
    Given I have logged in full permission user model AdminRights
    And   I click on Facilities Manangment icon from side bar
    And   I click on FM Call Log Details option
    And   I click on Create plus icon button and creating the NPS General Details
    And   Fill the Facilities Management Details and Save it
    And   I click the on the Save Button
    Then  Verify FM Call Log record once we Save it for Active
    #And   I delete the Respctive FM call Log

  @TC002_ClosedtheFMCallLog   #done
  Scenario: Closed the FM call complain
    Given I have logged in full permission user model AdminRights
    And   I click on Facilities Manangment icon from side bar
    And   I click on FM Call Log Details option
    And   Click on the created complain FM call with Closed status
    And   I click the on the Save Button
    Then  Verify FM Call Log record once we Save it for Active closed
    And   I delete the Respctive FM call Log state as callDescOpen

  @TC003_LogFMCallLogClose   #done
  Scenario: Verify to Log the FM call complain with closed status
    Given I have logged in full permission user model AdminRights
    And   I click on Facilities Manangment icon from side bar
    And   I click on FM Call Log Details option
    And   I click on Create plus icon button and creating the NPS General Details
    And   Fill the Facilities Management Close Details and Save it
    And   I click the on the Save Button
    Then  Verify FM Call Log record once we Save it for Active closed
   # And   I delete the Respctive FM call Log state as callDescClose


  @TC004_ClosedOpenComplaintCall   #done
  Scenario: Verify to Log the FM call complain open the log which is closed earlier
    Given I have logged in full permission user model AdminRights
    And   I click on Facilities Manangment icon from side bar
    And   I click on FM Call Log Details option
    Then  Verify FM Call Log record once we Save it for Active closed
    And   Click on the created complain FM call with Open status
    And   I click the on the Save Button
    Then  Verify FM Call Log record once we Save it for Active Opened
    And   I delete the Respctive FM call Log state as callDescClose

  @TC005_NPSFacilityServiceProviderCreate  #done
  Scenario: Verify to provide the serive provider facilities
    Given I have logged in full permission user model AdminRights
    And   I click on Health and Facility icon from side bar
    And   I click on NPS Facility Service Provider option
    And   I click on New plus icon button and creating the NPS Serive Provider details
    And   Fill the NPS Facility Service Provider Details and Save it
    And   I click the on the Save Button for NPSSeriveProvider
    And   Verify the NPS Serive Provider saved Details
    Then  I delete the NPS Serive Provider Facility Saved Datails




