Feature: Validate PIM Module of The OrangeHRM functionality Application

Background:
Given To launch the browser and navigate to url
When Verify the title of page
Then Enter "Admin" and "admin123"
Then Click submit button


 		
 @TC_01_PIM_Configuration_Select_OptionalFields
  Scenario: Select Optional Fields
    When click on Optional Fields link
    Then click on Edit buttom
    Then  select Optional Fields if not Selected
    And  click on Save button
    Then should see "Selected optional Fields"
    And Take Screenshot and close PIM_Configuration_Select_OptionalFields Page.
  
 @TC_02_PIM_Configuration_DeSelect_OptionalFields 
  Scenario: DeSelect Optional Fields 
 		When click on Optional Fields link
        Then click on Edit buttom
 		Then  Deselect Optional Fields already Selected
        And  click on Save button
        Then should see "DeSelected optional Fields"
        And Take Screenshot and close PIM_Configuration_DeSelect_OptionalFields Page
        
  @TC_01_PIM_Configuration_DataImport
  Scenario: Select DataImport Field
    When click on DataImport Fields link
    Then click on Download Sample CSVFile
    Then  click choose File
    Then select CSV File and click open
    And  click on Upload button
    Then should see "Number of Records Imported"
    And Take Screenshot and close _PIM_Configuration_DataImport Page
        
    @TC_01_PIM_Configuration_Create_ReportingMethods
  Scenario: Create ReportingMethod Field
    When click on Reporting Method Field link
    Then enter Field Name 
    And click on Save button
    Then should see "Defined ReportingMethod Fields"
     And Take Screenshot and close PIM_Configuration_Create_ReportingMethods Page
      
 @TC_02_PIM_Configuration_Delete_ReportingMethods 
  Scenario: Delete ReportingMethods Fields cretaed 
 		When click on ReportingMethods Fields link
 		Then  select check box
 		Then click on Delete
 		And need to see the confirmation box "OrangeHRM - Confirmation Required"
 		Then click on ok button
 		Then need to see "Add ReportingMethods Field" heading
 		 And Take Screenshot and close PIM_Configuration_Delete_ReportingMethods Page
 		
  @TC_01_PIM_Configuration_Create_TerminationReasonsMethods
  Scenario: Create TerminationReasonsMethod Field
    When click on TerminationReasons Method Field link
    Then enter Field Name 
    And click on Save button
    Then should see "Defined TerminationReasons Fields"
     And Take Screenshot and close PIM_Configuration_Create_TerminationReasonsMethods Page
  
 @TC_02_PIM_Configuration_Delete_TerminationReasonsMethods 
  Scenario: Delete TerminationReasonsMethods Fields created 
 		When click on TerminationReasonsMethods Fields link
 		Then  select check box
 		Then click on Delete
 		And need to see the confirmation box "OrangeHRM - Confirmation Required"
 		Then click on ok button
 		Then need to see "Add TerminationReasonsMethods Field" heading
 		And Take Screenshot and close PIM_Configuration_Delete_TerminationReasonsMethods Page