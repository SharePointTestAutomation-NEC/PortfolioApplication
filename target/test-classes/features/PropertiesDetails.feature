@PortfolioDetails
Feature: Portfolio Application
  As we are covering in this feature file as Properties Details
  Create the properties General Details
  Verify the General details

  Background:
   # Given I have logged into sharepoint

  @TC001_PropertiesDetailsActive #done
  Scenario Outline: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Property Details option
    And   I click on Create plus icon button and creating the NPS General Details
    And   Fill the NPS Property details and Site location as <SiteLocation> and Save it
    And   I click the on the Save Button
    Then   Verify respective site location is Active or Inactive <siteStatus> and <address>
    Examples:
      | SiteLocation |siteStatus|address|
      | United Kingdom-221:|Active|ActiveAdd|

  @TC002_PropertiesDetailsInactive   #done
  Scenario Outline: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Property Details option
    And   I click on Create plus icon button and creating the NPS General Details
    And   Fill the NPS Property details for Inactive Site location as <SiteLocation> and Save it
    And   I click the on the Save Button
    Then   Verify respective site location is Active or Inactive <siteStatus> and <address>
    Examples:
      | SiteLocation |siteStatus|address|
      | United Kingdom-241:|Inactive|InActiveAdd|

  @TC003_PropertyLeaseDetails
  Scenario: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Property Lease Details option
    And   I click on Create plus icon button and creating the NPS General Details
    And   Fill the NPS Property Lease details and Save it
    And   I click the on the Save Button
    Then  Verify NPS Property Lease details

  @TC004_PropertyLeaseDetailsEmpty   #done
  Scenario Outline: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Property Lease Details option
    And   Verify NPS Property Lease details
    And   I click on Edit button and make it as <LeaseStatus> Status.
    Then  Verify NPS Property Lease details
    Examples:
      | LeaseStatus |
      |Empty|

  @TC005_PropertyLeaseDetailsOccupied   #done
  Scenario Outline: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Property Lease Details option
    And   Verify NPS Property Lease details
    And   I click on Edit button and make it as <LeaseStatus> Status.
    Then  Verify NPS Property Lease details
    Examples:
      | LeaseStatus |
      |Occupied|

  @TC006_PropertyLicencesDetails   #done
  Scenario Outline: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Property Licences Details option
    And   I click on New plus icon button and creating the Property Licences Details
    And   Fill the NPS Property Licences details with title Name as <TitleName> and reference No as<refNo>
    And   I click the on the Save Button for Licenses
    Then  Verify NPS Property Licenses details
    Examples:
      | TitleName |refNo|
      | PLD |PLD|


  @TC007_PropertyLeaseCalendar   #done
  Scenario Outline: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Property Lease Calendar option
    And   I verify the Lease calendar home page
    Then   Fill the lease calendar property name<PropertyName> and date type as<DateType>
    Examples:
      | PropertyName |DateType|
      | Worli_12|All lease dates|


  @TC008_PropertyLicensesCalendar   #done
  Scenario Outline: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Property Licenses Calendar option
    And   I verify the Licenses calendar home page
    Then   Fill the licenses calendar property name<PropertyName> and date type as<DateType>
    Examples:
      | PropertyName |DateType|
      | Wooler_Northumberland |All licence dates|

  @TC009_PropertyDocumentStoreCreateFolder   #done
  Scenario: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Document Store option
    And   I verify the Document Store home page
    And   I click on Folder link button
    Then  I verify the folder created

  @TC010_PropertyTemplateStoreCreateFolder   #done
  Scenario: Verify to Create NPS Properties General Details
    Given I have logged in full permission user model AdminRights
    And   I click on Property icon from side bar
    And   I click on Template Store option
    And   I verify the Template Store home page
    And   I click on Folder link button
    Then  I verify the folder created