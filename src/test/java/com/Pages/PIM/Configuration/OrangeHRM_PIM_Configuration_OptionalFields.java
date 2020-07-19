package com.Pages.PIM.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_PIM_Configuration_OptionalFields 
{
WebDriver driver;
	

	// Locating Pim module
	@FindBy(id = "menu_pim_viewPimModule")
	WebElement Pim;

	// Locating PimConfiguration module
	@FindBy(id = "menu_pim_Configuration")
	WebElement Con;

	// Locating PimOptionalFields module
	@FindBy(id = "menu_pim_configurePim")
	WebElement OptField;
	
	//Locating HeadField
	@FindBy(xpath="//div[@class='head']/h1")
	WebElement HeadTxtField;

	//Locating Edit Button
	@FindBy(id = "btnSave")
	WebElement EditOpt;

	//Locating ChkDeprecateField
	@FindBy(id = "configPim_chkDeprecateFields")
	WebElement chkDep;

	//Locating ChkShowSSN
	@FindBy(id = "configPim_chkShowSSN")
	WebElement chkShowSSN;
	
	//Locating ChkShowSIN
	@FindBy(id = "configPim_chkShowSIN")
	WebElement chkShowSIN;

	//Locating ChkShowTax
	@FindBy(id = "configPim_chkShowTax")
	WebElement chkShowTax;

	//Locating Save Button
	@FindBy(id="btnSave")
	WebElement SaveBtn;
	
	
	
	//creating the constructor and initializing the elements using PageFactory
		public OrangeHRM_PIM_Configuration_OptionalFields(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	
	//moving to OptionalFieldPage through PIM and Configuration
		public void OptionalField() throws InterruptedException {
			Actions act=new Actions(driver);
			act.moveToElement(Pim).build().perform();
			Thread.sleep(3000);
			act.moveToElement(Con).build().perform();
			act.moveToElement(OptField).click().build().perform();
		}
		
		//Extracting Heading Text
		public String HeadTextField() {
			return HeadTxtField.getText();
		}
	
		//Clicks on  edit in PimOptionalFields
		public void EditOptFields() {
		EditOpt.click();
	}

		//Select ShowDeprecatedFields
	public void configPim_chkDepFields() {
		if (!chkDep.isSelected()) {
			chkDep.click();
		}
	}
	//Select Show SIN field in Personal Details
	public void configPim_chkShowSSN() {
		if (!chkShowSSN.isSelected()) {
			chkShowSSN.click();
		}

	}

	//Select Show SIN field in Personal Details
	public void configPim_chkShowSIN() {
		if (!chkShowSIN.isSelected()) {
			chkShowSIN.click();
		}
	}

	//Select ShowUSTaxExemptionsMenu
	public void configPim_DechkShowTax() {
if(!chkShowTax.isSelected()) {
	chkShowTax.click();
}
		 }
	

	//DeSelect ShowDeprecatedFields
public void configPim_DechkDepFields() {
	if (chkDep.isSelected()) {
		chkDep.click();
	}
}
//DeSelect Show SIN field in Personal Details
public void configPim_DechkShowSSN() {
	if (chkShowSSN.isSelected()) {
		chkShowSSN.click();
	}

}

//DeSelect Show SIN field in Personal Details
public void configPim_DechkShowSIN() {
	if (chkShowSIN.isSelected()) {
		chkShowSIN.click();
	}
}

//DeSelect ShowUSTaxExemptionsMenu
public void configPim_chkShowTax() {
if(chkShowTax.isSelected()) {
chkShowTax.click();
}
	 }

	//Click SaveBtn
public void SaveBtn() {
	SaveBtn.click();
}
}
