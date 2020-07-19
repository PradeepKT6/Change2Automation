package com.Pages.PIM.Configuration;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_PIM_Configuration_DataImport 
{
	WebDriver driver;

	// Locating Pim module
	@FindBy(id = "menu_pim_viewPimModule")
	WebElement Pim;

	// Locating PimConfiguration module
	@FindBy(id = "menu_pim_Configuration")
	WebElement Config;

	// Locating PimDataImport module
	@FindBy(id = "menu_admin_pimCsvImport")
	WebElement DataImport;

	// Location DataImport Header
	@FindBy(id = "pimCsvImportHeading")
	WebElement HeadDataImp;
	
	//locating to download sample CSVFile
	@FindBy(xpath="//a[@class='download']")
	WebElement SampleCSVLink;

	// Locate to Select File
	@FindBy(id = "pimCsvImport_csvFile")
	WebElement SelectFile;

	// Select to Save
	@FindBy(id = "btnSave")
	WebElement UploadFile;
	
	//Locate FooterText
	@FindBy(css="div#footer")
	WebElement FooterTxt;
	
	//Locate to HomePageLink
	@FindBy(xpath="//a[id='Footer']/a")
	WebElement HomePageLink;
	

	public OrangeHRM_PIM_Configuration_DataImport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// moving to DataImportPage through PIM and Configuration
	public void DataImport() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Pim).build().perform();
		Thread.sleep(2000);
		act.moveToElement(Config).build().perform();
		act.moveToElement(DataImport).click().build().perform();

	}

	public String dataImportHeader(String text) {
		return HeadDataImp.getText();
	}
	public void DownloadSampleCSVFile() {
		SampleCSVLink.click();
	}
	public void SelectFile() throws InterruptedException, IOException {
		SelectFile.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\pradeep\\Documents\\FileUpload.exe");
	}

	public void UploadFile() {
		UploadFile.click();
	}
	
	public String Footer(String txt) {
	return	FooterTxt.getText();
	}
	public void Homepage() {
		HomePageLink.click();
	}
}
