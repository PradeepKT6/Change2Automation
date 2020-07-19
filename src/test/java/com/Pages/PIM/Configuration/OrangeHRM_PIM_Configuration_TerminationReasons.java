package com.Pages.PIM.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_PIM_Configuration_TerminationReasons 
{
	WebDriver driver;
	// Locating Pim module
	@FindBy(id = "menu_pim_viewPimModule")
	WebElement Pim;

	// Locating PimConfiguration module
	@FindBy(id = "menu_pim_Configuration")
	WebElement Config;

	// Locating PimTerminationReason module
	@FindBy(id = "menu_pim_viewTerminationReasons")
	WebElement TerminationReason;

	// Locating Header at TerminationReasonPage
	@FindBy(xpath = "//div[@class='head']/h1")
	WebElement TerminationReasonHeader;

	// Locating to AddTerminationReason
	@FindBy(id = "btnAdd")
	WebElement AddTermReas;

	// Send ReportName
	@FindBy(id = "terminationReason_name")
	WebElement TermReasName;

	// Save TerminationReasonName
	@FindBy(id = "btnSave")
	WebElement SaveTermReas;

	// Cancel TerminationReasonName
	@FindBy(id = "btnCancel")
	WebElement CancelTermReasName;

	// Locate to SelectAll TerminationReasons
	@FindBy(id = "checkAll")
	WebElement SelectAllTermReas;

	// Locate ReportLink
	@FindBy(xpath = "//td[@class='tdName tdValue']/a")
	WebElement TermReasLink;

	// Locate FooterText
	@FindBy(css = "div#footer")
	WebElement FooterTxt;

	// Locate to HomePageLink
	@FindBy(xpath = "//a[id='Footer']/a")
	WebElement HomePageLink;

	public OrangeHRM_PIM_Configuration_TerminationReasons(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void TeminationReasonPage() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Pim).build().perform();
		Thread.sleep(2000);
		act.moveToElement(Config).build().perform();
		act.moveToElement(TerminationReason).click().build().perform();
	}

	public String ReportingMethodHeader(String text) {
		return TerminationReasonHeader.getText();

	}

	public void AddTerminationReason() {
		AddTermReas.click();
	}

	public void TerminationReasonName(String Name) {
		TermReasName.sendKeys(Name);
	}

	public void SaveTerminationReasonName() {
		SaveTermReas.click();
	}

	public void CancelRepName() {
		CancelTermReasName.click();
	}

	public void SelectAllReports() {
		SelectAllTermReas.click();
	}

	public void ReportLink() {
		TermReasLink.click();
	}

	public String Footer(String txt) {
		return FooterTxt.getText();
	}

	public void Homepage() {
		HomePageLink.click();
	}
}
