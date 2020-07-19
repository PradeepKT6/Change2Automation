package com.Pages.PIM.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_PIM_Configuration_ReportingMethods
{
	WebDriver driver;
	// Locating Pim module
	@FindBy(id = "menu_pim_viewPimModule")
	WebElement Pim;

	// Locating PimConfiguration module
	@FindBy(id = "menu_pim_Configuration")
	WebElement Config;

	// Locating PimReportingMethods module
	@FindBy(id = "menu_pim_viewReportingMethods")
	WebElement ReportingMethod;

	// Locating Head at ReportingMethodPage
	@FindBy(xpath = "//div[@class='head']/h1")
	WebElement RepMethodHead;

	// Locating to AddReport
	@FindBy(id = "btnAdd")
	WebElement AddReport;

	// Send ReportName
	@FindBy(id = "reportingMethod_name")
	WebElement RepName;

	// Save Report
	@FindBy(id = "btnSave")
	WebElement SaveReport;

	// Cancel ReportName
	@FindBy(id = "btnCancel")
	WebElement CancelReport;

	// Locate to SelectAll Reports
	@FindBy(id = "checkAll")
	WebElement SelectAllRep;

	// Locate ReportLink
	@FindBy(xpath = "//td[@class='tdName tdValue']/a")
	WebElement ReportLink;

	// Locate FooterText
	@FindBy(css = "div#footer")
	WebElement FooterTxt;

	// Locate to HomePageLink
	@FindBy(xpath = "//a[id='Footer']/a")
	WebElement HomePageLink;

	public OrangeHRM_PIM_Configuration_ReportingMethods(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ReportingMethod() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Pim).build().perform();
		Thread.sleep(2000);
		act.moveToElement(Config).build().perform();
		act.moveToElement(ReportingMethod).click().build().perform();
	}

	public String ReportingMethodHeader(String text) {
		return RepMethodHead.getText();

	}

	public void Addreport() {
		AddReport.click();
	}

	

	public void RepName(String Name) {
		RepName.sendKeys(Name);
	}

	public void SaveReportName() {
		SaveReport.click();
	}

	public void CancelRepName() {
		CancelReport.click();
	}

	public void SelectAllReports() {
		SelectAllRep.click();
	}

	public void ReportLink() {
		ReportLink.click();
	}
	
	public String Footer(String txt) {
		return FooterTxt.getText();
	}

	public void Homepage() {
		HomePageLink.click();
	}
}
