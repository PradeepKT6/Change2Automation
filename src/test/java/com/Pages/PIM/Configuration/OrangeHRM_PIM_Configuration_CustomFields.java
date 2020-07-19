package com.Pages.PIM.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_PIM_Configuration_CustomFields {
	
	private WebDriver driver;
	
	public OrangeHRM_PIM_Configuration_CustomFields(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	
		//pim menu
		@FindBy(id = "menu_pim_viewPimModule")
		public WebElement menuPimViewPimModule;
		
		//pim configuration
		@FindBy(id="menu_pim_Configuration")
		public WebElement menuPimConfiguration;
		
		//menu custom fields	
		@FindBy(id="menu_pim_listCustomFields")
		public WebElement menuPimListCustomField;
		
		//Field Name
		@FindBy(id="customField_name")
		public WebElement customFieldName;
		
		//Screen
		@FindBy(id="customField_screen")
		public WebElement customFieldScreen;
		
		//Type
		@FindBy(id="customField_type")
		public WebElement customFieldType;
		
		//drop down select options
		@FindBy(id="customField_extra_data")
		public WebElement customFieldExtraData;
		
		//Save Button
		@FindBy(id="btnSave")
		public WebElement btnSave;
		
		//Custom Field Name
		@FindBy(linkText="Custom Field Name")
		public WebElement customLinkText;
		
		//Add Button
		@FindBy(id="bottonAdd")
		public WebElement addButton;
		
		//Delete Button
		@FindBy(id="buttonRemove")
		public WebElement deleteButton;
		
		//checkbox
		@FindBy(id="allCheck")
		public WebElement checkboxCustomFieldList;
		
		//Defined Custom Fields
		@FindBy(xpath="//*[@id=\"customFieldListPane\"]/div[1]/h1")
		public WebElement definedCustomFields;
		
		//Delete Confirmation message
		@FindBy(xpath= "//*[@id=\"deleteConfModal\"]/div[1]/h3")
		public WebElement deleteConfirmationMessage; 
		
		//OK button 
		@FindBy(id="dialogDeleteBtn")
		public WebElement dialogDeleteButton;
		
		//Add custom field heading
		@FindBy(id="heading")
		public WebElement addCustomField;
		
		
		//Methods
		Select select;
		
		//custom field click
		public void clickButtonFields() throws InterruptedException {
			Actions action = new Actions(driver);
			action.moveToElement(menuPimViewPimModule).build().perform();
			Thread.sleep(2000);
			action.moveToElement(menuPimConfiguration).build().perform();
			menuPimListCustomField.click();
		}
		
		//entering custom field name
		public void enterCustomFieldName(String field) {
			customFieldName.sendKeys(field);
		}
		
		//selecting screen
		public void selectCustomFieldScreen(String field) {
			select = new Select(this.customFieldScreen);
			select.selectByVisibleText(field);
		}
		
		//Selecting fieldtype
		public void selectCustomFieldType(String type) {
			select = new Select(this.customFieldType);
			select.selectByVisibleText(type);
		}
		
		//click save button
		public void saveButton() {
			btnSave.click();
		}
		
		//return custom field link	
		public boolean returnCustomFieldLink() {
			return customLinkText.isDisplayed();
		}
		
		//click add button
		public void addButton() {
			addButton.click();
		}
		
		//click delete button
		public void deleteButton() {
			deleteButton.click();
		}
		
		//return heading Defined Custom Field
		public String textDefinedCustomFields() {
			return definedCustomFields.getText();
		}
		
		//Delete confirmation message
		public String textDeleteConfirmationMessage() {
			return deleteConfirmationMessage.getText();
		}
		
		//Dialoge delete button
		public void dialogDeleteButton() {
			dialogDeleteButton.click();
		}
		
		//Add custom field text
		public String textAddCustomField() {
			return addCustomField.getText();
		}
		
		//clicking on checkbox
		public void clickCheckboxCustomFieldList() {
			checkboxCustomFieldList.click();
		}
}
