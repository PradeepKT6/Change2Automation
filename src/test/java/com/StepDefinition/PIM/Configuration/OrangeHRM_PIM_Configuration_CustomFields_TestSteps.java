package com.StepDefinition.PIM.Configuration;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.BaseClass.Library;
import com.Pages.PIM.Configuration.OrangeHRM_PIM_Configuration_CustomFields;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_PIM_Configuration_CustomFields_TestSteps extends Library {
	
	OrangeHRM_PIM_Configuration_CustomFields pimConfigurationCustomFieldsPages = new OrangeHRM_PIM_Configuration_CustomFields(driver);
	
	@When("I click on Custom Fields link")
	public void i_click_on_Custom_Fields_link() throws InterruptedException {
		Logger.getLogger("Clicking on custom fields");
		pimConfigurationCustomFieldsPages.clickButtonFields();
		
	}

	@And("^I enter Field Name \"([^\"]*)\"$")
	public void i_enter_Field_Name(String field) {
		Logger.getLogger("Entering field name");
		pimConfigurationCustomFieldsPages.enterCustomFieldName(field);
	}

	@And("^I select Screen As \"([^\"]*)\"$")
	public void i_select_Screen_As(String screen) {
		Logger.getLogger("Selecting screen");
	    pimConfigurationCustomFieldsPages.selectCustomFieldScreen(screen);
	}

	@And("^I select Type as \"([^\"]*)\"$")
	public void i_select_Type_as(String type) {
		Logger.getLogger("Selecting type");
	    pimConfigurationCustomFieldsPages.selectCustomFieldType(type);
	}

	@And("I click on Save button")
	public void i_click_on_Save_button(){
		Logger.getLogger("Clicking on save button");
	    pimConfigurationCustomFieldsPages.saveButton();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see_Custom_Field_Name(String expectedResult){
		Logger.getLogger("verifying Custom field name added");
		String actualResult = pimConfigurationCustomFieldsPages.textDefinedCustomFields();
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@When("I can select check box")
	public void i_can_select_check_box() {
		Logger.getLogger("Clicking on check box");
	    pimConfigurationCustomFieldsPages.clickCheckboxCustomFieldList();
	}

	@When("I can click on Delete")
	public void i_can_click_on_Delete() {
		Logger.getLogger("Clicking on delete");
	    pimConfigurationCustomFieldsPages.deleteButton();
	}

	@When("^I need to see the confirmation box \"([^\"]*)\"$")
	public void i_need_to_see_the_confirmation_box(String expectedResult) {
		Logger.getLogger("verifying confirmation box message");
		String actualResult = pimConfigurationCustomFieldsPages.textDeleteConfirmationMessage();
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Then("click on ok button")
	public void click_on_ok_button() {
		Logger.getLogger("Clicking on okie button");
	    pimConfigurationCustomFieldsPages.dialogDeleteButton();
	}

	@Then("^need to see \"([^\"]*)\" heading$")
	public void need_to_see_heading(String expectedResult) throws InterruptedException {
		Logger.getLogger("Veriying the header after deleting");
		String actualResult = pimConfigurationCustomFieldsPages.textAddCustomField();
	    Assert.assertEquals(actualResult, expectedResult);
	}

}
