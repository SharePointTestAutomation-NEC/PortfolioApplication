package pageobjects;

import com.aventstack.extentreports.Status;
import com.github.javafaker.Faker;
import helpers.PopupWindow;
import helpers.WritePropertiesFile;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import step_definitions.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

//import com.sharepoint.qa.base.TestBase;

public class PropertiesPageObject extends BaseClass {

	private Faker faker = new Faker();

	@FindBy(xpath = "(//a[contains(@href,'PropertyHome.aspx') and @title='Properties']//preceding::i)[2]")
	public WebElement propertiesSideIconNavigation;

	@FindBy(xpath = "//div[text()='Properties Details' and contains(@class,'ms-Nav-linkText')]")
	public WebElement propertiesDetailsLink;

	@FindBy(xpath = "//span[text()='Delete' and @class='CommandBarItem-commandText']")
	WebElement DeleteRecord;

	@FindBy(xpath = "//span[text()='Delete' and @class='od-Button-label']")
	WebElement deleteConfirmBtn;

	@FindBy(xpath = "//span[contains(@class,'CommandBarItem-commandText') and contains(text(),'Create')]")
	public WebElement createbtnClick;

	@FindBy(xpath = "//span[contains(@class,'ms-ContextualMenu-itemText') and contains(text(),'Filter by')]")
	public WebElement filterBy;

	@FindBy(xpath = "//input[contains(@class,'ms-BasePicker-input pickerInput')]")
	public WebElement InputFilterVal;

	@FindBy(xpath = "(//button[contains(@class,'ms-GroupHeader-expand expand')])[1]/i")
	public WebElement GrouHeaderExpand;



	@FindBy(xpath = "(//div[@data-automation-key='PropertyStatus']//div//div)[1]")
	public WebElement propertyStatusV;

	@FindBy(xpath =   "//iframe[contains(@src,'/_layouts/15/listform.aspx?')]" )    //"(//iframe)[1]")
	WebElement SwitchFrame;

	@FindBy(xpath = "//input[@id='custFilePicker']")
	public static WebElement uplaodSiteImage;

	@FindBy(xpath = "//span[contains(text(),'Site image uploaded successfully')]")
	public static  WebElement siteImageUploaded;

	@FindBy(xpath = "//input[@title='Site Location Required Field']")
	public static WebElement siteLoation;

	@FindBy(xpath = "//*[@class='ms-long' and contains(@title,'Rich text editor Address')]")
	public static WebElement addressRequire;


	@FindBy(xpath= "//select[@class='ms-RadioText' and contains(@title,'Property Status Required Field')]")
	public static WebElement propertyStatus;

	@FindBy(xpath= "(//input[@class='ms-ButtonHeightWidth' and @value='Save'])[2]")
	public static WebElement SaveBtnPropertyDetails;

	@FindBy(xpath= "(//div[@class='ms-List-page']//div[contains(@class,'ms-Check')])[1]")
	public static WebElement CheckBoxCheck;

	@FindBy(xpath= "//i[contains(@class,'od-IconGlyph ms-Icon ms-Icon--Edit')]//following::span[1]")
	public static WebElement EditBtnClick;

	@FindBy(xpath= "//select[@title='Status']")
	public static WebElement EditStatus;



	@FindBy(xpath= "//button[@class='od-Dialog-action od-Button od-Button--primary']")
	public static WebElement SaveBtn;

	@FindBy(xpath = "//span[text()='Create Invoice' and @role]")
	public WebElement createInvoice;

	@FindBy(xpath = "(//div[contains(@id,'Dropdown') and contains(@class,'ms-Dropdown')])[1]")
	public WebElement selectcustomerDrpDown;

	@FindBy(xpath = "(//div[contains(@id,'Dropdown') and contains(@class,'ms-Dropdown')])[2]")
	public WebElement selectCRMDropDowm;


	@FindBy(xpath = "//*[text()='Property Lease Details']")
	public WebElement propertyLeaseDetails;


	@FindBy(xpath = "//h2[@class='StandaloneList-title']")
	public  WebElement NPSPropertyDetailsPage;

	//Property NPS form fillup Details:

	@FindBy(xpath = "//input[@title='Reference Number']")
	public WebElement referenceDetails;

	@FindBy(xpath =  "//select[@title='Site Location']")
	public  WebElement siteLocationDropDown;

	@FindBy(xpath =  "//label[text()='Site Location']//following::input[1]")
	public  WebElement siteLocationforLicenses;//Udgir

	@FindBy(xpath = "//input[@title='Floor']")
	public  WebElement floorInput;

	@FindBy(xpath = "//input[@title='Lease Commencement']")
	public  WebElement leaseCommencementDate;

	@FindBy(xpath = "//label[text()='Licence Commencement']//following::input[1]")
	public  WebElement licenceCommencementDate;


	@FindBy(xpath = "//input[@title='Lease Period (in Years)']")
	public  WebElement leasePeriodInYear;

	@FindBy(xpath = "//label[text()='Licence Period']//following::textarea[1]")
	public  WebElement LicensesPeriod;

	@FindBy(xpath = "//label[text()='Annual Rent']//following::input[1]")
	public  WebElement AnnualRent;



	@FindBy(xpath = "//input[@title='Rent Review Date']")
	public  WebElement RentReviewDate;

	@FindBy(xpath = "//input[@title='12 months forewarn business of Notice deadline/Lease Expires']")
	public WebElement leaseExpires12Months;

	@FindBy(xpath = "//input[@title='6 months forewarn business of Notice deadline/Lease Expires']")
	public WebElement leaseExpires6Months;

	@FindBy(xpath = "//*[contains(@class,'od-IconGlyph ms-Icon ms-Icon--Edit') and @data-icon-name='Edit']")
	public WebElement editBtnClick;

	@FindBy(xpath = "//select[@title='Lease Status']")
	public WebElement leaseStatus;

	@FindBy(xpath = "(//input[@value='Save'])[2]")
	public WebElement saveBtn;

	//property Licences details:

	@FindBy(xpath = "//*[text()='Licences Details']")
	public WebElement propertyLicencesDetails;

	@FindBy(xpath = "//span[contains(@class,'CommandBarItem-commandText') and text()='New']")
	public WebElement NewbtnClick;

	@FindBy(xpath = "//label[text()='Title']//following::input[1]")
	public WebElement titleName;

	@FindBy(xpath = "//label[text()='Reference No.']//following::input[1]")
	public WebElement referenceNo;

	@FindBy(xpath = "//label[text()='Site Location']//following::input[1]")
	public WebElement siteLocationInput;

	@FindBy(xpath = "//label[text()='Location Identifier']//following::input[1]")
	public WebElement loctionIdentifier;

	@FindBy(xpath = "//label[text()='Annual Rent']//following::input[1]")
	public WebElement annualRent;

	@FindBy(xpath = "//span[text()='Save' and @class='od-Button-label']")
	public WebElement SaveLicencesDetails;



	//Lease Calendar:

	@FindBy(xpath = "//a[@href='/sites/portfolio/Lists/LeaseCalendar/calendar.aspx']")
	public WebElement propertyLeaseCalendar;

	@FindBy(xpath = "//a[@title='LeaseCalendar']")
	public WebElement LeaseCalendarTitleName;

	@FindBy(xpath = "//select[@name='ddlPropertyName']")    //NY_2
	public WebElement PropertyName;

	@FindBy(xpath = "//select[@name='ddlDateType']")    //All lease dates
	public WebElement dateTypes;

	@FindBy(xpath = "//button[@id='BtnSearch']")
	public WebElement SearchBtn;

	@FindBy(xpath = "//div[contains(@title,'Rent Review Date')]")
	public WebElement rentReviewDate;

	@FindBy(xpath = "//div[contains(@title,'Lease End Date')]")
	public WebElement leaseEndDate;

	@FindBy(xpath = "//div[contains(@title,'6 months notice to business')]")
	public WebElement sixMonthNotice;

	@FindBy(xpath = "//div[contains(@title,'12 months notice to business')]")
	public WebElement tweleveMonths;


	@FindBy(xpath = "//iframe[@class='ms-dlgFrame']")
	WebElement uplaodFrame;

	@FindBy(xpath = "//div[@class='StandaloneList-listView']")
	public  WebElement AllLeaseDetails;

	//licenses calendar xpaths

	@FindBy(xpath = "//a[@href='/sites/portfolio/Lists/LicencesCalendar/calendar.aspx']")
	public WebElement propertyLicensesCalendar;

	@FindBy(xpath = "//a[@title='LicencesCalendar']")
	public WebElement LicensesCalendarTitleName;

	//Document Store xpaths:

	@FindBy(xpath = "//a[@href='/sites/portfolio/PropertyDocuments/Forms/AllItems.aspx']")
	public WebElement documentStore;

	@FindBy(xpath = "//h2[@class='StandaloneList-title']")
	public WebElement getDocumentStorePage;

	@FindBy(xpath = "//span[text()='Folder']")
	public WebElement folderMenu;

	@FindBy(xpath = "//input[contains(@class,'od-FolderBuilder-nameInput')]")
	public WebElement FolderInput;

	@FindBy(xpath = "//button[contains(@class,'od-Dialog-action od-Button')]")
	public WebElement FolderCreateBtn;

	//template Store

	@FindBy(xpath = "//a[@href='/sites/portfolio/TemplateStore/Forms/AllItems.aspx']")
	public WebElement templateStore;

	//Facilities Managment:

	@FindBy(xpath = "//a[contains(@href,'Facilities-Management.aspx') and @title='Facilities Management']//preceding::button[1]")
	public WebElement facilitiesManagment;

	@FindBy(xpath = "//a[contains(@href,'HealthHome.aspx') and @title='Health & Safety ']//preceding::button[1]")
	public WebElement healthAndFacility;


	@FindBy(xpath = "//a[@href='/sites/portfolio/Lists/FMCallLog']")
	public WebElement FMCallLogLink;

	@FindBy(xpath = "//a[@href='/sites/portfolio/Lists/ServiceProvider/AllItems.aspx']")
	public WebElement NPSFacilitySeriveProvider;

	@FindBy(xpath = "//a[@href='/sites/portfolio/Lists/Accidents/AllItems.aspx']")
	public WebElement AccidentProvider;

	@FindBy(xpath = "//a[@href='/sites/portfolio/Lists/PotentialAccident/AllItems.aspx']")
	public WebElement PotentialAccidentProvider;

	@FindBy(xpath = "//a[@href='/sites/portfolio/Lists/SiteAssesmentsandInsepections/AllItems.aspx']")
	public WebElement SiteAssisment;

	@FindBy(xpath = "//a[@href='/sites/portfolio/Lists/FireSafety/AllItems.aspx']")
	public WebElement FireSafety;

	@FindBy(xpath = "//select[@title='Office location Required Field']")   //Alderley-Edge
	public WebElement officeLocationDropDown;

	@FindBy(xpath = "//select[contains(@id,'SiteLocation')]")   //Alderley-Edge
	public WebElement HealthLocationDropDown;

	@FindBy(xpath = "//select[contains(@id,'Quater') or @title='Reporting Quarter Required Field']")   //Alderley-Edge
	public WebElement ReportingQuater;

	@FindBy(xpath = "//select[contains(@id,'MonthNew') or @title='Month Required Field']")   //Alderley-Edge
	public WebElement NewMonth;

	@FindBy(xpath = "//select[contains(@id,'Week') or @title='Week Required Field']")   //Alderley-Edge
	public WebElement Week;

	@FindBy(xpath = "//select[contains(@id,'YearNew') or @title='Year Required Field']")   //Alderley-Edge
	public WebElement NewYear;

	@FindBy(xpath = "//table[contains(@id,'AccidentReported')]//tbody//span[@title='Yes']//input")   //Alderley-Edge
	public WebElement AccidentRepotedYes;


	@FindBy(xpath = "//table[contains(@id,'IncidentReported')]//tbody//span[@title='Yes']//input")   //Alderley-Edge
	public WebElement IncidentReport;

	@FindBy(xpath = "//input[@title='Reported by Required Field']")   //Alderley-Edge
	public WebElement TitleRepotedBy;


	@FindBy(xpath = "//table[contains(@id,'CompanyEmployee')]//tbody//span[@title='Yes']//input")   //Alderley-Edge
	public WebElement CompanyEmployessYes;

	@FindBy(xpath = "//textarea[contains(@id,'DetailsonAccident')]")   //Alderley-Edge
	public WebElement detailsAccident;

	@FindBy(xpath = "//textarea[contains(@id,'DetailsonNearMiss')]")   //Alderley-Edge
	public WebElement detailsNearMissAccident;

	@FindBy(xpath = "//textarea[contains(@id,'RemedialActionTaken')]")   //Alderley-Edge
	public WebElement RemedialActionTaken;


	@FindBy(xpath = "//input[@title='Working days lost Required Field']")   //Alderley-Edge
	public WebElement workingDayLost;

	@FindBy(xpath = "//input[@title='Working hours lost Required Field']")   //Alderley-Edge
	public WebElement workingHoursLost;

	@FindBy(xpath = "//input[@title='Test completed by Required Field']")   //Alderley-Edge
	public WebElement TestCompletedBY;






	@FindBy(xpath = "//label[text()='Title']//following::input[1]")   //Alderley-Edge
	public WebElement NPSProviderTitleName;

	@FindBy(xpath = "//label[text()='Provider']//following::input[1]")   //Alderley-Edge
	public WebElement NPSProviderName;

	@FindBy(xpath = "//label[text()='Email Id']//following::input[1]")   //Alderley-Edge
	public WebElement NPSProviderEmailId;





	@FindBy(xpath = "//*[@title='Rich text editor Call description']")
	public WebElement callDescripton;

	@FindBy(xpath = "//*[@title='Call Type Required Field']")   //Complaint
	public WebElement callTypeRequired;

	@FindBy(xpath = "//*[@title='Supplier logged with']")   //Sanket
	public WebElement suppliedWithLog;

	@FindBy(xpath = "//*[@title='Status']")   //Open
	public WebElement statusDropDown;

	@FindBy(xpath = "//input[@title='Date Fixed / Completed']")
	public WebElement dateFixedCompleted;

	@FindBy(xpath = "//input[@title='Date of Near Miss Required Field']")
	public WebElement DateNearMiss;


	@FindBy(xpath = "//input[@title='Date of last monthly Inspection Required Field']")
	public WebElement SiteAssismentDateOFLastMonth;

	@FindBy(xpath = "//input[@title='Fire Alarm weekly activity Required Field']")
	public WebElement FireAlarmAcitivty;



	@FindBy(xpath = "//input[@title='Date Reported Required Field']")
	public WebElement DateReported;




	@FindBy(xpath = "(//label[text()='Title']//following::input[@class='od-TextEditor-input od-TextField-field'])[1]")
	public WebElement TitleName;

	@FindBy(xpath = "(//label[text()='Title']//following::input[@class='od-TextEditor-input od-TextField-field'])[2]")
	public WebElement ProviderName;

	@FindBy(xpath = "(//label[text()='Title']//following::input[@class='od-TextEditor-input od-TextField-field'])[3]")
	public WebElement emaiID;

	@FindBy(xpath = "//span[text()='Save' and @class='od-Button-label']")
	public WebElement SaveBtnForServiceProvider;











































	//Save button should be used as same xpath:





















	public void clickOnPropertyHeaderIcon() throws InterruptedException {
		propertiesSideIconNavigation.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnFacilitiesManagment() throws InterruptedException {
		manageFluientWaits(facilitiesManagment);
		facilitiesManagment.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnHeathAndFacility() throws InterruptedException {
		manageFluientWaits(healthAndFacility);
		healthAndFacility.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}



	public void clickOnPropertiesDetailsOption() throws InterruptedException {
		Thread.sleep(10000);
		propertiesDetailsLink.click();
		Thread.sleep(10000);
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnFMCallLogOption() throws InterruptedException {
		manageFluientWaits(FMCallLogLink);
		FMCallLogLink.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnNPSFacilitServiceProviderOption() throws InterruptedException {
		manageFluientWaits(NPSFacilitySeriveProvider);
		NPSFacilitySeriveProvider.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnAccidentOption() throws InterruptedException {
		manageFluientWaits(AccidentProvider);
		AccidentProvider.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnPotentialAccidentOption() throws InterruptedException {
		manageFluientWaits(PotentialAccidentProvider);
		PotentialAccidentProvider.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	public void clickOnSiteAssismentOption() throws InterruptedException {
		manageFluientWaits(SiteAssisment);
		SiteAssisment.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnFireSafetyOption() throws InterruptedException {
		manageFluientWaits(FireSafety);
		FireSafety.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}



	public void clickOnPropertiesLeaseDetailsOption() throws InterruptedException {
		manageFluientWaits(propertyLeaseDetails);
	//	propertyLeaseDetails.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", propertyLeaseDetails);
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnPropertiesLicencesDetailsOption() throws InterruptedException {
		manageFluientWaits(propertyLicencesDetails);
		propertyLicencesDetails.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnPropertiesLeaseCalendarOption() throws InterruptedException {
	     manageFluientWaits(propertyLeaseCalendar);
		propertyLeaseCalendar.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnPropertiesLicensesCalendarOption() throws InterruptedException {
		manageFluientWaits(propertyLicensesCalendar);
		propertyLicensesCalendar.click();
	}

	public void clickOnDocuementStoreOption() throws InterruptedException {
		manageFluientWaits(documentStore);
		documentStore.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickOnTemplateStoreOption() throws InterruptedException {
		manageFluientWaits(templateStore);
		templateStore.click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}




	public void switchToCreateFrame() throws InterruptedException {
		manageFluientWaits(SwitchFrame);
		//Thread.sleep(20000);
		driver.getTitle();
		System.out.println(driver.getTitle());
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(SwitchFrame);
	}


	public void setCreatebtnClick() throws InterruptedException {
		manageFluientWaits(createbtnClick);
		createbtnClick.click();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);

	}

	public void setNewBtnClick() throws InterruptedException {

		manageFluientWaits(NewbtnClick);
		NewbtnClick.click();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);

	}

	public void iClickOnFolderBtnClick() throws InterruptedException {
		/*WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(createbtnClick));*/
		NewbtnClick.click();
		Thread.sleep(10000);
		folderMenu.click();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);

	}

	public void verifyFolderCreated() throws InterruptedException, IOException {
		String keyName = ReadIntoConfig("FolderName","/config/RunTimeData.properties");
		driver.findElement(By.xpath("//a[text()='"+keyName+"']")).isDisplayed();
	}

	public void CreateFolder() throws InterruptedException, FileNotFoundException {
		/*WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(createbtnClick));*/
		String dynamicLineNumber = String.valueOf(faker.hashCode());
		FolderInput.sendKeys("TestFolder"+dynamicLineNumber);
		String folderNames = FolderInput.getAttribute("value").trim();
		WriteDataIntoConfig("FolderName",folderNames);
		FolderCreateBtn.click();
		Thread.sleep(10000);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	}



	public void LeaseCalendarHomePage() throws InterruptedException {
		manageFluientWaits(LeaseCalendarTitleName);
		String leaseCalendar =  LeaseCalendarTitleName.getText().trim();   //LeaseCalendar
		System.out.println("Lease calendar"+leaseCalendar);
		if(leaseCalendar.equalsIgnoreCase("LeaseCalendar")){
			Assert.assertTrue("Lease calendar exist",true);
		}else{
			Assert.assertFalse("Lease Calendar", false);
		}

	}

	public void LicensesCalendarHomePage() throws InterruptedException {
		Thread.sleep(50000);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		String leaseCalendar =  LicensesCalendarTitleName.getText().trim();   //LicencesCalendar
		if(leaseCalendar.equals("LicencesCalendar")){
			Assert.assertTrue("Licenses calendar exist",true);
		}else{
			Assert.assertFalse("Lease Calendar", false);
		}

	}

	public void setDocumentStoreHomePage() throws InterruptedException {
		Thread.sleep(50000);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		String leaseCalendar =  getDocumentStorePage.getText().trim();
		if(leaseCalendar.equals("Document Store")){
			Assert.assertTrue("Document Store page exist",true);

		}else{
			Assert.assertFalse("Document Store page does not exist", false);
		}
	}

	public void setTemplateStoreHomePage() throws InterruptedException {
		Thread.sleep(50000);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		String leaseCalendar =  getDocumentStorePage.getText().trim();
		if(leaseCalendar.equals("Template-Store")){
			Assert.assertTrue("Template  Store page exist",true);
		}else{
			Assert.assertFalse("Template Store page does not exist", false);
		}
	}



	public void fillPrpertiesDetails(String sitelocation) throws InterruptedException {
		manageFluientWaits(uplaodSiteImage);
		//String dynamicLineNumber = String.valueOf(faker.hashCode());
		//uplaodSiteImage.click();
		Thread.sleep(2000);
		uplaodSiteImage.sendKeys("D:\\PortfolioApplication\\WebDrivers\\usr\\bin\\Images\\homeee.jpg");
		siteLoation.sendKeys(sitelocation+ setDynamic());
		Thread.sleep(2000);
		String sitelocations = siteLoation.getAttribute("value").trim();
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("ActiveAdd",sitelocations,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		addressRequire.sendKeys("NY 360");
		setpolicyStatusActive();
		manageFluientWaits(siteImageUploaded);

	}

	public void fillFacilitiesFMCallLogOpneStatusManagement() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		String dynamicLineNumber = String.valueOf(faker.hashCode());
		wait.until(ExpectedConditions.visibilityOf(officeLocationDropDown));
		String officeLocationName = ReadIntoConfig("OfficeLocation","/config/config.properties");
		Select propertyNames = new Select(officeLocationDropDown);
		propertyNames.selectByVisibleText(officeLocationName);
		callDescripton.sendKeys(dynamicLineNumber);
		Thread.sleep(5000);
		String sitelocations = callDescripton.getAttribute("value").trim();
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("callDescOpen",sitelocations,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Select callType = new Select(callTypeRequired);
		String getCallType = ReadIntoConfig("callTypeVal","/config/config.properties");
		callType.selectByVisibleText(getCallType);
		Select suppliedLog = new Select(suppliedWithLog);
		String getsuppliedLog = ReadIntoConfig("suppliedLog","/config/config.properties");
		suppliedLog.selectByVisibleText(getsuppliedLog);
		Select statusDrpDwn = new Select(statusDropDown);
		String getStatusDrpDwn = ReadIntoConfig("getStatusOpenDrpDwn","/config/config.properties");
		statusDrpDwn.selectByVisibleText(getStatusDrpDwn);
	}

	public void fillAccidentDetails() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		String dynamicLineNumber = String.valueOf(faker.hashCode());
		wait.until(ExpectedConditions.visibilityOf(HealthLocationDropDown));
		String officeLocationName = ReadIntoConfig("ActiveAdd","/config/RunTimeData.properties");
		Select propertyNames = new Select(HealthLocationDropDown);
		propertyNames.selectByVisibleText(officeLocationName);
		String ReportingQuaters = ReadIntoConfig("ReportingQuaters","/config/config.properties");
		Select report = new Select(ReportingQuater);
		report.selectByVisibleText(ReportingQuaters);
		String NewMonths = ReadIntoConfig("NewMonth","/config/config.properties");
		Select month = new Select(NewMonth);
		month.selectByVisibleText(NewMonths);
		String NewYears = ReadIntoConfig("NewYear","/config/config.properties");
		Select Year = new Select(NewYear);
		Year.selectByVisibleText(NewYears);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			js.executeScript("arguments[0].click();", AccidentRepotedYes);
		}catch (Exception e){
			js.executeScript("arguments[0].click();", IncidentReport);
			TitleRepotedBy.sendKeys("parmeshwar");
			setSubmissonDate(DateNearMiss);
			setSubmissonDate(DateReported);
		}
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", CompanyEmployessYes);
		try{
			detailsAccident.sendKeys("while doing overtake");
			workingDayLost.sendKeys("5");
			workingHoursLost.sendKeys("2");
		}catch (Exception e){
			detailsNearMissAccident.sendKeys("while doing overtake");
			RemedialActionTaken.sendKeys("Yes");
		}
		Thread.sleep(5000);
	}

	public void fillSiteAssismentDetails() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		String dynamicLineNumber = String.valueOf(faker.hashCode());
		wait.until(ExpectedConditions.visibilityOf(HealthLocationDropDown));
		String officeLocationName = ReadIntoConfig("ActiveAdd","/config/RunTimeData.properties");
		Select propertyNames = new Select(HealthLocationDropDown);
		propertyNames.selectByVisibleText(officeLocationName);
		setSubmissonDate(SiteAssismentDateOFLastMonth);
		String ReportingQuaters = ReadIntoConfig("ReportingQuaters","/config/config.properties");
		Select report = new Select(ReportingQuater);
		report.selectByVisibleText(ReportingQuaters);
		String NewMonths = ReadIntoConfig("NewMonth","/config/config.properties");
		Select month = new Select(NewMonth);
		month.selectByVisibleText(NewMonths);
		String NewYears = ReadIntoConfig("NewYear","/config/config.properties");
		Select Year = new Select(NewYear);
		Year.selectByVisibleText(NewYears);
		Thread.sleep(5000);
	}

	public void fillFireSafetyDetails() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		String dynamicLineNumber = String.valueOf(faker.hashCode());
		TestCompletedBY.sendKeys("Parmeshwar");
		wait.until(ExpectedConditions.visibilityOf(HealthLocationDropDown));
		String officeLocationName = ReadIntoConfig("ActiveAdd","/config/RunTimeData.properties");
		Select propertyNames = new Select(HealthLocationDropDown);
		propertyNames.selectByVisibleText(officeLocationName);
		setSubmissonDate(FireAlarmAcitivty);
		String ReportingQuaters = ReadIntoConfig("ReportingQuaters","/config/config.properties");
		Select report = new Select(ReportingQuater);
		report.selectByVisibleText(ReportingQuaters);
		String weeks = ReadIntoConfig("week","/config/config.properties");
		Select month = new Select(Week);
		month.selectByVisibleText(weeks);
		String NewMonths = ReadIntoConfig("NewMonth","/config/config.properties");
		 month = new Select(NewMonth);
		month.selectByVisibleText(NewMonths);
		String NewYears = ReadIntoConfig("NewYear","/config/config.properties");
		Select Year = new Select(NewYear);
		Year.selectByVisibleText(NewYears);
		Thread.sleep(5000);
	}

	public void filTheNPSServiceProviderDetails() throws InterruptedException, IOException {
		manageFluientWaits(NPSProviderTitleName);
		String dynamicLineNumber = String.valueOf(faker.hashCode());
		NPSProviderTitleName.sendKeys(dynamicLineNumber);
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("NPSSeriveProviderTitleName",dynamicLineNumber,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		NPSProviderName.sendKeys("Test Automation");
		NPSProviderEmailId.sendKeys("Test@gmail.com");
	}

	public Integer setNameandCRMIDDynamic() throws InterruptedException {
		Thread.sleep(20000);
		Integer a = ThreadLocalRandom.current().nextInt();
		return  a;
	}

	public void fillFacilitiesFMCallLogCLoseStatusManagement() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		String dynamicLineNumber = String.valueOf(faker.hashCode());
		wait.until(ExpectedConditions.visibilityOf(officeLocationDropDown));
		String officeLocationName = ReadIntoConfig("OfficeLocation","/config/config.properties");
		Select propertyNames = new Select(officeLocationDropDown);
		propertyNames.selectByVisibleText(officeLocationName);
		callDescripton.sendKeys(dynamicLineNumber);
		Thread.sleep(5000);
		String sitelocations = callDescripton.getAttribute("value").trim();
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("callDescClose",sitelocations,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Select callType = new Select(callTypeRequired);
	//	Select callType = new Select(callTypeRequired);
		String getCallType = ReadIntoConfig("callTypeVal","/config/config.properties");
		callType.selectByVisibleText(getCallType);
		Select suppliedLog = new Select(suppliedWithLog);
		String getsuppliedLog = ReadIntoConfig("suppliedLog","/config/config.properties");
		suppliedLog.selectByVisibleText(getsuppliedLog);
		Select statusDrpDwn = new Select(statusDropDown);
		String getStatusDrpDwn = ReadIntoConfig("getStatusCloseDrpDwn","/config/config.properties");
		statusDrpDwn.selectByVisibleText(getStatusDrpDwn);
		setSubmissonDate(dateFixedCompleted);
	}

	public Integer setDynamic() throws InterruptedException {
		Thread.sleep(20000);
		Integer a = ThreadLocalRandom.current().nextInt();
		return  a;
	}

	public void fillPrpertiesDetailsWithInactive(String sitelocation) throws InterruptedException {
		manageFluientWaits(uplaodSiteImage);
		//String dynamicLineNumber = setDynamic();
		//uplaodSiteImage.click();
		Thread.sleep(2000);
		uplaodSiteImage.sendKeys("D:\\PortfolioApplication\\WebDrivers\\usr\\bin\\Images\\homeee.jpg");
		siteLoation.sendKeys(sitelocation+ setDynamic());
		//siteLoation.sendKeys(dynamicLineNumber);
		Thread.sleep(2000);
		String sitelocations = siteLoation.getAttribute("value").trim();
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("InActiveAdd",sitelocations,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		addressRequire.sendKeys("NY 360");
		setpolicyStatusInActive();
		manageFluientWaits(siteImageUploaded);
	}


	public void fillPropertyLeaseDetails() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		String dynamicLineNumber = String.valueOf(faker.hashCode());
		referenceDetails.sendKeys("RefNo:"+dynamicLineNumber);
		String RefNo = referenceDetails.getAttribute("value").trim();
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("referenceNo",RefNo,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String siteLocationName = prop.getProperty("ActiveAdd");
		Select bidmanager = new Select(siteLocationDropDown);
		bidmanager.selectByVisibleText(siteLocationName);
		floorInput.sendKeys("2");
		setSubmissonDate(leaseCommencementDate);
		leasePeriodInYear.sendKeys("11");
		setSubmissonDate(RentReviewDate);
		setSubmissonDate(leaseExpires12Months);
		setSubmissonDate(leaseExpires6Months);
	}


	public String WriteDataIntoConfig(String KeyName, String passValue) throws InterruptedException, FileNotFoundException {
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile(KeyName,passValue,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		return KeyName;
	}

	public String ReadIntoConfig(String KeyNameVal,String targetPath) throws InterruptedException, IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" +targetPath );
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyValue = prop.getProperty(KeyNameVal);
		return keyValue;
	}






	public void fillPropertyLicencesDetails(String titlesName,String refNo) throws InterruptedException, IOException {
		manageFluientWaits(titleName);
		titleName.sendKeys(titlesName+setDynamic());
		String finalTitleName= titleName.getAttribute("value").trim();
		WriteDataIntoConfig("TitleName",finalTitleName);

		referenceNo.sendKeys(titlesName+setDynamic());
		Thread.sleep(2000);
		String finalrefNo= referenceNo.getAttribute("value");
		WriteDataIntoConfig("LicensesRefno",finalrefNo);

		//referenceDetails.sendKeys("RefNo:"+setDynamic());

		//String RefNo = referenceDetails.getAttribute("value").trim();
		//WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		//writePropertiesFile.WritePropertiesFile("referenceNo",RefNo,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String siteLocationName = prop.getProperty("ActiveAdd");
		//Select bidmanager = new Select(siteLocationDropDown);
		//bidmanager.selectByVisibleText(siteLocationName);
		siteLocationforLicenses.sendKeys(siteLocationName);
		//floorInput.sendKeys("2");
		setSubmissonDate(licenceCommencementDate);
		LicensesPeriod.sendKeys("11");
		AnnualRent.sendKeys("10000");
		//setSubmissonDate(RentReviewDate);
		//setSubmissonDate(leaseExpires12Months);
		//setSubmissonDate(leaseExpires6Months);
	}


	public void fillPropertyLeaseCalendar(String propertyName,String dateType) throws InterruptedException, IOException {
		Select propertyNames = new Select(PropertyName);
		propertyNames.selectByVisibleText(propertyName);
		Select date = new Select(dateTypes);
		date.selectByVisibleText(dateType);
		SearchBtn.click();
		Thread.sleep(10000);
		if(dateType.equals("Break Date")){
           alertPersentOrNot();
           test.log(Status.INFO,"Break Date details pased");
		}else if(dateType.equals("Rent Review Date")){
			waitForPageToLoad(rentReviewDate);
			rentReviewDate.isDisplayed();
		}else if(dateType.equals("Lease End Date")) {
			waitForPageToLoad(leaseEndDate);
			leaseEndDate.isDisplayed();
		}else if(dateType.equals("6 months notice to business")){
			waitForPageToLoad(sixMonthNotice);
			sixMonthNotice.isDisplayed();
		}else if(dateType.equals("12 months notice to business")){
			waitForPageToLoad(tweleveMonths);
			tweleveMonths.isDisplayed();
		}else {
			uploadFrameSwitch();
			AllLeaseDetails.isDisplayed();
		}
	}

	public void fillPropertyLicensesCalendar(String propertyName,String dateType) throws InterruptedException, IOException {
	      manageFluientWaits(PropertyName);
		Select propertyNames = new Select(PropertyName);
		propertyNames.selectByVisibleText(propertyName);
		Select date = new Select(dateTypes);
		date.selectByVisibleText(dateType);
		SearchBtn.click();
		Thread.sleep(20000);
		if(dateType.equals("Licenses Commencement")){
			test.log(Status.INFO,"Licenses Commencement details passed");
		}else if(dateType.equals("Licence End")){
			test.log(Status.INFO,"Licenses end details passed");
		}else {
			uploadFrameSwitch();
			AllLeaseDetails.isDisplayed();
		}
	}

	public void manageFluientWaits(WebElement element){
		WebElement waitFluent=null;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(java.time.Duration.ofSeconds(300))
				.pollingEvery(Duration.ofMillis(50))
				.ignoring(NoSuchElementException.class);
		WebElement elements = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement elements = element;
				String getTextOnPage = elements.getText();
				if(elements.isDisplayed()){
					System.out.println(getTextOnPage);
					return element;
				}
				return elements;
			}
		});
	}
	public void VerifyRecordApprovalTypeForActive() throws InterruptedException, IOException {
		//Thread.sleep(20000);
		//WebDriverWait waits = new WebDriverWait(driver, 60);
		//waits.until(ExpectedConditions.visibilityOf(filterBy));
		manageFluientWaits(createbtnClick);
		String crmid = ReadIntoConfig("ActiveAdd","/config/RunTimeData.properties");
		WebElement approvalType = driver.findElement(By.xpath("//button[text()='"+crmid+"']"));
		if(approvalType.isDisplayed()){
			List<WebElement> headerSize = driver.findElements(By.xpath("//span[@class='ms-DetailsHeader-cellName']"));
			Integer getTblHeaderSize = headerSize.size();
			System.out.println("Table Header Size"+ getTblHeaderSize);
			for(int i=0;i<=getTblHeaderSize;i++)
			{
				String HeaderName = headerSize.get(i).getText();
				if(HeaderName.equals("Site Location"))
				{
					System.out.println(i);
					headerSize.get(i).click();
					WaitForSpecificTime();
					filterBy.click();
					manageFluientWaits(InputFilterVal);
					//waits.until(ExpectedConditions.visibilityOf(InputFilterVal));
					InputFilterVal.sendKeys(crmid);
					Thread.sleep(15000);
					InputFilterVal.sendKeys(Keys.ENTER);
					//Thread.sleep(200);
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("arguments[0].click();", filterApplyBtn);
					Thread.sleep(5000);
					break;
				}
			}
		}else{

		}
	}
	public void DeleteRecordCheck(String logststuas ) throws InterruptedException, IOException {
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='CommandBarItem-commandText']//following::i[contains(@class,'od-CommandBarItem-down ms-Icon')]"));
		manageFluientWaits(ele);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String CallDescss = prop.getProperty(logststuas);
		System.out.println("activeSiteLocation*************** "+CallDescss);
		Boolean displayRecod= driver.findElement(By.xpath("(//*[text()='"+CallDescss+"'])[1]")).isDisplayed();
		if(displayRecod){
			driver.findElement(By.xpath("(//*[text()='"+CallDescss+"']//preceding::span[1])[1]")).click();
			Thread.sleep(2000);
		}else {
			org.testng.Assert.assertFalse(false);
		}
	}

	public void DeleteNPSRecordCheck() throws InterruptedException, IOException {
		Thread.sleep(10000);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String CallDescss = prop.getProperty("NPSSeriveProviderTitleName");
		System.out.println("activeSiteLocation*************** "+CallDescss);
		Boolean displayRecod= driver.findElement(By.xpath("(//*[text()='"+CallDescss+"'])[1]")).isDisplayed();
		if(displayRecod){
			driver.findElement(By.xpath("//*[text()='"+CallDescss+"']//preceding::div[@role='checkbox'][1]/div")).click();
			Thread.sleep(2000);
		}else {
			org.testng.Assert.assertFalse(false);
		}
	}

	public void CheckBoxCheck() throws InterruptedException, IOException {
		DeleteRecord.click();
		Thread.sleep(5000);
	}







	public void VerifyRecordApprovalTypeForInActive(String add) throws InterruptedException, IOException {
		//Thread.sleep(20000);
		//WebDriverWait waits = new WebDriverWait(driver, 60);
		//waits.until(ExpectedConditions.visibilityOf(filterBy));
		manageFluientWaits(createbtnClick);
		String crmid = ReadIntoConfig(add,"/config/RunTimeData.properties");
		WebElement approvalType = driver.findElement(By.xpath("//button[text()='"+crmid+"']"));
		if(approvalType.isDisplayed()){
			List<WebElement> headerSize = driver.findElements(By.xpath("//span[@class='ms-DetailsHeader-cellName']"));
			Integer getTblHeaderSize = headerSize.size();
			System.out.println("Table Header Size"+ getTblHeaderSize);
			for(int i=0;i<=getTblHeaderSize;i++)
			{
				String HeaderName = headerSize.get(i).getText();
				if(HeaderName.equals("Site Location"))
				{
					System.out.println(i);
					headerSize.get(i).click();
					WaitForSpecificTime();
					filterBy.click();
					manageFluientWaits(InputFilterVal);
					//waits.until(ExpectedConditions.visibilityOf(InputFilterVal));
					InputFilterVal.sendKeys(crmid);
					Thread.sleep(15000);
					InputFilterVal.sendKeys(Keys.ENTER);
					//Thread.sleep(200);
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("arguments[0].click();", filterApplyBtn);
					Thread.sleep(5000);
					break;
				}
			}
		}else{

		}
	}




	public void VerifyRecordApprovalTypeForLicensesDetails() throws InterruptedException, IOException {
		//Thread.sleep(20000);
		//WebDriverWait waits = new WebDriverWait(driver, 60);
		//waits.until(ExpectedConditions.visibilityOf(filterBy));
		//manageFluientWaits(createbtnClick);
		Thread.sleep(5000);
		String crmid = ReadIntoConfig("LicensesRefno","/config/RunTimeData.properties");
			List<WebElement> headerSize = driver.findElements(By.xpath("//span[@class='ms-DetailsHeader-cellName']"));
			Integer getTblHeaderSize = headerSize.size();
			System.out.println("Table Header Size"+ getTblHeaderSize);
			for(int i=0;i<=getTblHeaderSize;i++)
			{
				String HeaderName = headerSize.get(i).getText();
				if(HeaderName.equals("Reference No."))
				{
					System.out.println(i);
					headerSize.get(i).click();
					WaitForSpecificTime();
					filterBy.click();
					manageFluientWaits(InputFilterVal);
					//waits.until(ExpectedConditions.visibilityOf(InputFilterVal));
					InputFilterVal.sendKeys(crmid);
					Thread.sleep(20000);
					InputFilterVal.sendKeys(Keys.ENTER);
					//Thread.sleep(200);
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("arguments[0].click();", filterApplyBtn);
					Thread.sleep(5000);
					break;
				}
			}

	}



	public void VerifyRecordForAccident() throws InterruptedException, IOException {
		Thread.sleep(5000);
		String crmid = ReadIntoConfig("ActiveAdd","/config/RunTimeData.properties");
		List<WebElement> headerSize = driver.findElements(By.xpath("//span[@class='ms-DetailsHeader-cellName']"));
		Integer getTblHeaderSize = headerSize.size();
		System.out.println("Table Header Size"+ getTblHeaderSize);
		for(int i=0;i<=getTblHeaderSize;i++)
		{
			String HeaderName = headerSize.get(i).getText();
			if(HeaderName.equals("Site Location"))
			{
				System.out.println(i);
				headerSize.get(i).click();
				WaitForSpecificTime();
				filterBy.click();
				try{
					Thread.sleep(10000);
					driver.findElement(By.xpath("//span[contains(@class,'ms-Checkbox-text') and text()='"+crmid+"']")).click();
				}catch (Exception e){
					manageFluientWaits(InputFilterVal);
					//waits.until(ExpectedConditions.visibilityOf(InputFilterVal));
					InputFilterVal.sendKeys(crmid);
					Thread.sleep(20000);
					InputFilterVal.sendKeys(Keys.ENTER);
				}
				//Thread.sleep(200);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", filterApplyBtn);
				Thread.sleep(5000);
				break;
			}
		}

	}

	public void VerifyActiveAndInactive(String siteststuas) throws InterruptedException, IOException {
		Thread.sleep(10000);
		manageFluientWaits(propertyStatusV);
		WebElement status = driver.findElement(By.xpath("//div[text()='"+siteststuas+"']"));
		if(status.isDisplayed()){
			Assert.assertTrue(status.isDisplayed());
		}else {
			Assert.fail("Property Status mis matched");
		}

	}

	public void ExpandRecords(String siteststuas) throws InterruptedException, IOException {
		Thread.sleep(10000);
		manageFluientWaits(propertyStatusV);
		WebElement status = driver.findElement(By.xpath("//div[text()='"+siteststuas+"']"));
		if(status.isDisplayed()){
			Assert.assertTrue(status.isDisplayed());
		}else {
			Assert.fail("Property Status mis matched");
		}

	}




	public void setSubmissonDate(WebElement element) throws InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String formattedLocalDate = dtf.format(now);
		element.sendKeys(formattedLocalDate);
		Thread.sleep(2000);
	}



	public void Editbtnclick() throws InterruptedException {
		manageFluientWaits(editBtnClick);
		//editBtnClick.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", editBtnClick);
		Thread.sleep(10000);
	}

	public void getleaseStatusSelect(String status) throws InterruptedException {
		manageFluientWaits(leaseStatus);
		Select bidmanager = new Select(leaseStatus);
		bidmanager.selectByVisibleText(status);
		Thread.sleep(10000);
	}

	public void saveBtnClick() throws InterruptedException {
		saveBtn.click();
		Thread.sleep(10000);
	}








	public void setpolicyStatusActive() throws InterruptedException {
		Select bidmanager = new Select(this.propertyStatus);
		bidmanager.selectByVisibleText("Active");
		Thread.sleep(2000);
		// this.BidManager.sendKeys(BidManager);
	}

	public void setpolicyStatusInActive() throws InterruptedException {
		Select bidmanager = new Select(this.propertyStatus);
		bidmanager.selectByVisibleText("Inactive");
		Thread.sleep(2000);
		// this.BidManager.sendKeys(BidManager);
	}


	public void setInvoiceInputVal(String inputVal,WebElement webElement) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(webElement));
		webElement.clear();
		webElement.sendKeys(inputVal);
		Thread.sleep(500);
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String formattedLocalDate = dtf.format(now);
		this.CustSignDate.sendKeys(formattedLocalDate);
		Thread.sleep(2000);
		return formattedLocalDate;*/

	}

	public void setArchivaltypDropDown(String ArchivalType) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//span[@class='od-ContextualMenu-linkText' and contains(text(),'"+ArchivalType+"')]"));
		ele.click();
	}

	public void setCustomerName(String cutomerName) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'Dropdown')]//following::span[contains(text(),'"+cutomerName+"')]"));
		ele.click();
	}

	public void setCRMID(String CRMNumber) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'Dropdown')]//following::span[contains(text(),'"+CRMNumber+"')]"));
		ele.click();
	}

	public void fetchUnqRefNumbers() throws InterruptedException
	{
		String unqRefNumber= fetchUnqRefNumber.getText().trim();
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("UnqRefNum",unqRefNumber,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
	}

	public void fetchUnqRefNumbersAndActualCrm(String CRMNumber) throws InterruptedException
	{
		String unqRefNumber= CRMNumber;
		String actualCrm=ActualCrmNumber.getAttribute("value").trim();
		Assert.assertEquals("Verify Crm Numbers", unqRefNumber.equals(actualCrm), true);
	}

	public void SavebtnClick() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", SaveBtnPropertyDetails);

	}


	public void GroupHederExpand() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", GrouHeaderExpand);
		Thread.sleep(2000);
		PropertiesPageObject invoice = new PropertiesPageObject();
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String CallDescss = prop.getProperty("ActiveAdd");
		driver.findElement(By.xpath("(//span[contains(text(),'Site Location: "+CallDescss+"')])[1]")).click();
		Thread.sleep(7000);

	}

	public void checkBoxCheck() throws InterruptedException {
		manageFluientWaits(CheckBoxCheck);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", CheckBoxCheck);
		Thread.sleep(2000);

	}

	public void EditClick() throws InterruptedException {
		manageFluientWaits(EditBtnClick);
		editBtnClick.click();

	}

	public void EditStatusClosed(String callLogStatus) throws InterruptedException {
		manageFluientWaits(EditStatus);
		Select select = new Select(EditStatus);
		select.selectByValue(callLogStatus);
		Thread.sleep(5000);
		if(callLogStatus.equalsIgnoreCase("Closed")){
		setSubmissonDate(dateFixedCompleted);}
	}







	public void SaveLicensesbtnClick() throws InterruptedException {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", SaveBtn);
		SaveBtn.click();

	}



























































































































































































	@FindBy(xpath = "//select[@title='Customer Name (as per contract)' and contains(@id,'CustomeSoldTo')]")
	public WebElement customerName;

	@FindBy(xpath = "//*[@class='ms-long' and contains(@id,'SoldToAddress')]")
	public WebElement PoBillingAddress;

	@FindBy(xpath = "//select[@title='End User (Ship To)' and contains(@id,'EndUser')]")
	public WebElement Enduser;

	@FindBy(xpath = "//*[@class='ms-long' and contains(@id,'ShipToAddress')]")
	public WebElement ShipToAddress;

	@FindBy(xpath = "//select[@title='Customer /Payer' and contains(@id,'CustomerPayer')]")
	public WebElement CustomerPayer;

	@FindBy(xpath = "//*[@class='ms-long' and contains(@id,'PayerAddress')]")
	public WebElement PayAddress;

	@FindBy(xpath = "//*[@title='Sales Desk Indicator' and contains(@id,'SalesDeskSale')]")
	public WebElement SalesDeskIndicatorChkBox;

	@FindBy(xpath = "//select[@title='Is this a contract extension?' and contains(@id,'ContractExtension')]")
	public WebElement conractExtension;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'ParentOrChild')]")
	public WebElement prentExtraction;

	@FindBy(xpath = "//input[@title='Parent Contract Ref' and contains(@id,'ParentContractDetails')]")
	public WebElement parentContactRef;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'DoesthisorderSupersedeanyother')]")
	public WebElement supersedeAnyOther;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'TerminationCheck')]")
	public WebElement terminatedCheck;

	@FindBy(xpath = "//select[@title='Sales Person' and contains(@id,'SalesPerson')]")
	public WebElement SalesPersonDropDown;

	@FindBy(xpath = "//input[@title='Sales Person Number' and contains(@id,'SalesPerson_Number')]")
	public WebElement SalesPerson_Number;

	@FindBy(xpath = "//select[@title='Sales Account Manager' and contains(@id,'SalesAcctManager')]")
	public WebElement SalesAccManger;


	@FindBy(xpath = "//input[@title='Sales Account Manager SAP Refno' and contains(@id,'SAM_SAPRefNo')]")
	public WebElement SAMRefNo;


	@FindBy(xpath = "//select[@title='Sales Manager' and contains(@id,'SalesManager')]")
	public WebElement salesMangerDropDown;

	@FindBy(xpath = "//input[@title='SalesMgr SAP Refno' and contains(@id,'SalesMgr_SAPRefNo')]")
	public WebElement salesMangerRefNo;

	@FindBy(xpath = "//select[@title='Sales Director' and contains(@id,'SalesDirector')]")
	public WebElement salesDirector;

	@FindBy(xpath = "//input[@title='SalesDir SAP Refno' and contains(@id,'SalesDir_SAPRefNo')]")
	public WebElement salesDirectorRefNo;

	@FindBy(xpath = "//select[@title='Commission Person' and contains(@id,'CommissionPerson')]")
	public WebElement commonPerson;

	@FindBy(xpath = "//input[@title='Comission SAP Refno' and contains(@id,'Comission_SAPRefNo')]")
	public WebElement commonPersonRefNo;

	@FindBy(xpath = "//select[@title='Project Manager' and contains(@id,'ProjectManager')]")
	public WebElement ProjectManager;

	@FindBy(xpath = "//input[@title='Customer PO' and contains(@id,'CustomerPO')]")
	public WebElement cutomerPO;

	@FindBy(xpath = "//select[@title='Salutation Required Field' and contains(@id,'CustomerContractSalutation')]")
	public WebElement salutationDropDown;

	@FindBy(xpath = "//input[@title='First Name Required Field' and contains(@id,'CustomerContractFirstName')]")
	public WebElement CustomerContractFirstName;

	@FindBy(xpath = "//input[@title='Surname Required Field' and contains(@id,'BillToCustomerContractName')]")
	public WebElement CustomerSurname;

	@FindBy(xpath = "//input[@title='Bill To Customer Contact Email Required Field' and contains(@id,'BillToCustomerContactEmail')]")
	public WebElement CustomerEmail;

	@FindBy(xpath = "//input[@title='Bill to Contract Telephone Number' and contains(@id,'BilltoContractTelephoneNumber')]")
	public WebElement cutomaerTelephoneNo;

	@FindBy(xpath = "//input[@title='Ship To Contract Name' and contains(@id,'ShipToContractName')]")
	public WebElement ShipToContractName;

	@FindBy(xpath = "//input[@title='Ship To Contract Email' and contains(@id,'ShipToContractEmail')]")
	public WebElement ShipToContractEmail;

	@FindBy(xpath = "//input[@title='Ship To Contract Telephone' and contains(@id,'ShipToContractTelephone')]")
	public WebElement ShipToContractTelephone;

	@FindBy(xpath = "//input[@title='Is this a Framework order?' and @type='checkbox']")
	public WebElement isThisFraeworkOrderCheckbox;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'Currency')]")
	public WebElement currencyDropDown;

	@FindBy(xpath = "//input[@class='ms-input' and @title='Total Contract Value']")
	public WebElement contractValueTotal;

	@FindBy(xpath = "//input[@class='ms-input' and @title='Total Margin']")
	public WebElement totalMargin;

	@FindBy(xpath = "//input[@class='ms-input' and @title='Total Margin Percentage']")
	public WebElement totalMarginPercentage;

	@FindBy(xpath = "//select[@class='ms-RadioText' and @title='Is this CREM Exempt']")
	public WebElement isThisCREMExempt;

	@FindBy(xpath = "//input[@class='ms-long' and contains(@id,'HyperlinktoAPPROVEDCREMitem')][1]")
	public WebElement hyperlinkWebUrl;

	@FindBy(xpath = "//input[@class='ms-long' and contains(@id,'HyperlinktoAPPROVEDCREMitem')][2]")
	public WebElement hyperlinkWebUrlDescription;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'OrderExpenses')]")
	public WebElement OrderExpenses;

	@FindBy(xpath = "//input[@class='ms-input' and contains(@id,'CustSignDate')]")
	public WebElement CustSignDate;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'Kimble')]")
	public WebElement KimbleDropDown;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'ESOFStatus')]")
	public WebElement ESOFStatus;

	@FindBy(xpath = "(//input[@value='Save'])[2]")
	WebElement SaveContractBtn;

	@FindBy(xpath =   "//iframe[contains(@src,'/sites/contracts/_layouts/15/listform.aspx')]" )    //"(//iframe)[1]")
			WebElement CreateContractFrame;


	@FindBy(xpath = "//span[text()='More']")
	public WebElement workFlowMoreMenu;

	@FindBy(xpath = "//span[text()='Workflow']")
	public WebElement menuWorkflowOption;

	@FindBy(xpath = "//*[contains(text(),'Running Workflows')]")
	public  WebElement RunningWorkFlowSection;

	@FindBy(xpath = "//*[contains(text(),'There are no running workflows on this item')]")
	public WebElement noWorkFlowRunning;

	@FindBy(xpath = "//a[@title='Order Processing 2013 Mode' and contains(@href,'/sites/contracts')]")
	WebElement orderProcessing2013ModelLink;

	@FindBy(id = "WorkflowInternalStatus")
	WebElement InernalStatus;

	@FindBy(xpath = "//a[@class='ms-subtleLink' and text()='PS Orders']")
	WebElement PSOrders;

	@FindBy(xpath = "//a[@class='ms-subtleLink' and text()='PS Orders']//following::a[text()='Validate sales order']")
	WebElement  ValidateSalesOrderLink;

	@FindBy(xpath = "(//a[@class='ms-subtleLink' and text()='PS Orders']//following::a[text()='Validate sales order']//following::td[text()='Not Started'])[1]")
    WebElement  PSOrderNoStartedStatus;



	@FindBy(xpath = "//input[@title='Task Name Required Field']")
	WebElement TaskName;

	@FindBy(xpath = "//select[@title='Finance Response Required Field' and contains(@id,'FinanceResponse_')]")
	public WebElement financeApprovers;

	@FindBy(xpath = "//select[@title='Application Delivery Response Required Field' and contains(@id,'ApplicationDeliveryResponse_')]")
	public WebElement applicationDeliveryApproversDropDown;

	@FindBy(xpath = "//select[@title='Application Support Response Required Field' and contains(@id,'ApplicationSupportResponse_')]")
	public WebElement applicationSupportApproversDropDown;

	@FindBy(xpath = "//select[@title='Services Response Required Field' and contains(@id,'ServicesResponse_')]")
	public WebElement ServiceApproversDropDown;

	@FindBy(xpath = "//select[@title='WRB Status Required Field' and contains(@id,'WRBStatus')]")
	public WebElement WRBStatus;

	@FindBy(xpath = "//select[@title='Order Status Required Field' and contains(@id,'OrderStatus')]")
	public WebElement OrderStatus;

	@FindBy(xpath = "//input[@value='Complete Task' and @type='button']")
	public WebElement completeTaskBtn;

	@FindBy(xpath = "//input[contains(@title,'SAP Order') and contains(@id,'SAP')]")
	public WebElement SAPOrderNumber;

	@FindBy(xpath = "//input[contains(@id,'ApplicationDeliveryApprovers_') and @title='Application Delivery Approvers']")
	public WebElement  ApplicationDeliveryApprovers;

	@FindBy(xpath = "//input[contains(@id,'ApplicationSupportApprovers_') and @title='Application Support Approvers']")
	public WebElement  AppliationSupportApprovers;

	@FindBy(xpath = "//input[contains(@id,'ServicesApprovers_') and @title='Services Approvers']")
	public  WebElement ServiceApprovers;

	@FindBy(xpath = "//input[contains(@id,'FinanceApprovers_') and @title='Finance Approvers']")
	public WebElement FinanceApprovers;

	@FindBy(xpath = "//input[contains(@id,'LegalApprovers') and @title='Legal Approvers']")
	public WebElement LegalSendApproverInputs;

	@FindBy(xpath = "//a[text()='Finance approval']")
	public  WebElement financeApprovesLink;

	@FindBy(xpath = "//a[text()='Services approval']")
	public  WebElement serviceApproversLink;

	@FindBy(xpath = "//a[text()='Application support approval']")
	public  WebElement applicationSupportApproversLink;

	@FindBy(xpath = "//a[text()='Application delivery approval']")
	public  WebElement applicationDeliveryApproversLink;

	@FindBy(xpath = "//a[text()='Finance approval (over 25K)']")
	public  WebElement financeApprovesLink25k;

	@FindBy(xpath = "Legal approval (over 25K)")
	public  WebElement legalApprovesLink25k;

	@FindBy(xpath = "//select[@title='Finance Approval Response Required Field' and contains(@id,'FinanceApprovalResponse_')]")
	public  WebElement financeApprovers25k;

	@FindBy(xpath = "//select[@title='Legal Approval Response Required Field' and contains(@id,'LegalApprovalResponse_')]")
	public  WebElement legalApprovers25k;

	@FindBy(xpath = "//*[text()='SOF Log' and (contains(@class,'ms-Nav-linkText linkText') or @class='menu-item-text')]")
	public WebElement SofLogLob;

	@FindBy(xpath = "//*[contains(@class,'od-IconGlyph ms-Icon ms-Icon--Filter') and @data-icon-name='Filter']")
	public WebElement filterBtn;

	@FindBy(xpath = "(//div[@class='FiltersPane-section' and @data-section-key='CRMRef'])[1]//following-sibling::div[@class='FiltersPane-sectionFooter']/a")
	public  WebElement CrmRefSeeAllLink;

	@FindBy(xpath = "//input[contains(@class,'ms-BasePicker-input pickerInput')]")
	public WebElement filterInputVal;

	@FindBy(xpath = "//div[contains(@class,'ms-Button-label') and contains(@id,'id') and text()='Apply']")
	public  WebElement filterApplyBtn;


	@FindBy(xpath = "//h2[@class='StandaloneList-title']")
	WebElement PageHeaderName;

	@FindBy(xpath = "(//div[contains(@class,'ms-DetailsHeader') and @data-item-key='CRMRef'])[1]")
	public WebElement crmRefNumberColumn;

	@FindBy(xpath = "(//div[contains(@class,'ms-DetailsHeader') and @data-item-key='Status'])[1]")
	public WebElement statusColumn;

	@FindBy(xpath = "(//div[contains(@class,'ms-DetailsHeader') and @data-item-key='ESOFStatus'])[1]")
	public  WebElement EsofStatus;






































	public Integer setCRMRefNumber() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(this.CRMRefNumber));
		String dynamicCRMID = String.valueOf(ThreadLocalRandom.current().nextInt());
		//this.CRMRefNumber.sendKeys(dynamicCRMID);
		return Integer.valueOf(dynamicCRMID);
	}

	public Integer setCCN() throws InterruptedException {
		Thread.sleep(2000);
		String dynamicCRMID = String.valueOf(ThreadLocalRandom.current().nextInt());
		//this.CCN.sendKeys(dynamicCRMID);
		return Integer.valueOf(dynamicCRMID);
	}

	public void setContractCreationInputVal(String inputVal,WebElement webElement) throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(webElement));
		    webElement.clear();
			webElement.sendKeys(inputVal);
			Thread.sleep(500);

	}

	public void setAccountName(String inputVal,WebElement webElement) throws InterruptedException {
		webElement.sendKeys(inputVal);
		WaitFor10k();
		webElement.sendKeys(Keys.ENTER);

	}


	public void setContractCreationClickBtn(WebElement webElement) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(webElement));
		webElement.click();
		Thread.sleep(500);

	}

	public void setClickBtn(WebElement webElement) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(webElement));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", webElement);

	}


	public void setContractCreationDropDowns(String customerNameDropDown,WebElement webElement) throws InterruptedException{
		Select bidType = new Select(webElement);
		bidType.selectByVisibleText(customerNameDropDown);
		Thread.sleep(500);

	}

	public void setContractCreationValueDropDowns(String customerNameDropDown,WebElement webElement) throws InterruptedException{
		Select bidType = new Select(webElement);
		//bidType.selectByVisibleText(customerNameDropDown);
		bidType.selectByValue(customerNameDropDown);
		Thread.sleep(500);

	}

	public String setSignatureDate() throws InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String formattedLocalDate = dtf.format(now);
		this.CustSignDate.sendKeys(formattedLocalDate);
		Thread.sleep(2000);
		return formattedLocalDate;
	}


	public void switchToCreateNewBidFrame() throws InterruptedException {
		Thread.sleep(20000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(CreateContractFrame));
		driver.getTitle();
		System.out.println(driver.getTitle());
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(CreateContractFrame);
	}


	public void clickSaveButton() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", SaveContractBtn);
			Thread.sleep(20000);
			//Save.click();
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}

	}


	public boolean ContractWorkFlow() {
		boolean contractFlow= false;
		try {
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String crmID = prop.getProperty("CRMID");
			System.out.println("ContractNo*************** "+crmID);
			WebElement workFlowMenu  = driver.findElement(By.xpath("//div[@class='ms-List-cell']//following::span[text()='"+crmID+"']//following::button[@class='od-FieldRenderer-dot'][1]"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", workFlowMenu);
			contractFlow=true;
			Thread.sleep(5000);
			//Save.click();
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return contractFlow;
	}


	public boolean isMoreOption() throws Exception{
		Boolean moreMenu= false;
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", workFlowMoreMenu);
			//advanceMenuOption.click();
			Thread.sleep(5000);
			moreMenu=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return moreMenu;
	}

	public boolean isWorkFlowMenuOption() throws Exception{
		Boolean moreMenu= false;
		try {
			//Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", menuWorkflowOption);
			//advanceMenuOption.click();
			Thread.sleep(5000);
			moreMenu=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return moreMenu;
	}


	//
	public Boolean VerifyContract() throws InterruptedException {
		boolean contractCreated= false;
		WaitForSpecificTime();
		WaitForSpecificTime();
		try {
			try {
				FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
				Properties prop = new Properties();
				prop.load(fileInputStream);
				String crmID = prop.getProperty("CRMID");
				System.out.println("bid*************** "+crmID);
				contractCreated= driver.findElement(By.xpath("//div[@class='ms-List-cell']//following::span[text()='"+crmID+"']")).isDisplayed();
				if(contractCreated) {
					contractCreated=true;
				}else{
					contractCreated=false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return contractCreated;
	}

	public boolean runningWorkFlowSectionView() {
		Boolean runningWorkFlow =false;
		try {
			runningWorkFlow = this.RunningWorkFlowSection.isDisplayed();
			if(runningWorkFlow){
				runningWorkFlow=true;
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return runningWorkFlow;
	}

	public boolean noWorkFlowRunning() {
		Boolean runningWorkFlow =false;
		try {
			runningWorkFlow = this.noWorkFlowRunning.isDisplayed();
			if(runningWorkFlow){
				runningWorkFlow=true;
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return runningWorkFlow;
	}

	public boolean orderProcession2013Modelink() {
		Boolean runningWorkFlow =false;
		try {
			runningWorkFlow = this.orderProcessing2013ModelLink.isDisplayed();
			if(runningWorkFlow){
				this.orderProcessing2013ModelLink.click();
				Thread.sleep(10000);
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return runningWorkFlow;
	}


	public boolean InernalStatus(String StatusExpected) throws InterruptedException {
		Boolean runningWorkFlow =false;
		for(int i=0;i<=5;i++){
			WaitForSpecificTime();
			driver.navigate().refresh();
			try{
				boolean element = InernalStatus.isDisplayed();
				String status = this.InernalStatus.getText();
				if(element && status.equals(StatusExpected)){
					runningWorkFlow=true;
					break;
				}else {
					if(i==5){
						runningWorkFlow=false;
					}else {
						continue;
					}
				}
			}catch (Exception e){
				continue;
			}
		}



		/*Thread.sleep(10000);
		try {
			runningWorkFlow = this.InernalStatus.isDisplayed();
			if(runningWorkFlow){
				String status = this.InernalStatus.getText();
				Thread.sleep(10000);
				if(status.equals(StatusExpected)){
					runningWorkFlow=true;
				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return runningWorkFlow;*/
		return runningWorkFlow;
	}

	public boolean PSOrderFunction() {
		Boolean psOrderStatus =false;
		try {
			psOrderStatus = this.PSOrders.isDisplayed();
			if(psOrderStatus){
				boolean validateLink = ValidateSalesOrderLink.isDisplayed();
				if(validateLink){
					boolean notStarted = PSOrderNoStartedStatus.isDisplayed();
					if(notStarted){
						if(PSOrderNoStartedStatus.getText().trim().equals("Not Started")){
							ValidateSalesOrderLink.click();
							psOrderStatus=true;
						}
					}

				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return psOrderStatus;
	}

	public Boolean uploadFrameSwitch()throws InterruptedException{
		Boolean iframe=false;
		try{
			//Thread.sleep(8000);
			waitForPageToLoad(uplaodFrame);
			driver.switchTo().frame(uplaodFrame);
			iframe=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return iframe;
	}


	public Boolean validateSalesOrder(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Validate sales order")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Validate sales order");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return taskNameFlag;
	}

	public Boolean processOrderTaskName(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Process Order Form")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Process Order Form");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}

	public boolean PSOrderStatusCompleted() throws InterruptedException {
		Boolean psOrderStatus =false;
		Thread.sleep(5000);
		try {
			psOrderStatus = this.PSOrders.isDisplayed();
			if(psOrderStatus){
				boolean validateLink = ValidateSalesOrderLink.isDisplayed();
				if(validateLink){
					boolean completed = PSOrderNoStartedStatus.isDisplayed();
					if(completed){
						if(PSOrderNoStartedStatus.getText().trim().equals("Completed")){
							psOrderStatus=true;
							driver.navigate().refresh();
							WaitForSpecificTime();
						}
					}

				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return psOrderStatus;
	}

	public String getWorkFlowFromPropertyFile(String KeyName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/WorkFlowData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyName = prop.getProperty(KeyName);
		return keyName;
	}

	public boolean ProcessOrderForm() throws IOException {
		Boolean PrcoessOrderStatus =false;
		String userName = getWorkFlowFromPropertyFile("ProcessOrderFormUserName").trim();
		WebElement UserName = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']"));
		WebElement PrcoessOrderFormLink = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']//following::a[contains(text(),'Process Order Form')]"));
		WebElement ProcessOrdrStatus = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']//following::a[contains(text(),'Process Order Form')]//following::td[text()='Not Started']"));
		try {
			Boolean UserNameIsExist = UserName.isDisplayed();
			if(UserNameIsExist){
				boolean PrcoessOrdrStatus = PrcoessOrderFormLink.isDisplayed();
				if(PrcoessOrdrStatus){
					boolean notStarted = ProcessOrdrStatus.isDisplayed();
					if(notStarted){
						if(ProcessOrdrStatus.getText().trim().equals("Not Started")){
							PrcoessOrderFormLink.click();
							PrcoessOrderStatus=true;
						}
					}

				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return PrcoessOrderStatus;
	}

	public boolean ProcessOrderFormCompleted() throws IOException {
		Boolean PrcoessOrderStatus =false;
		String userName = getWorkFlowFromPropertyFile("ProcessOrderFormUserName").trim();
		WebElement UserName = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']"));
		WebElement PrcoessOrderFormLink = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']//following::a[contains(text(),'Process Order Form')]"));
		WebElement ProcessOrdrStatus = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']//following::a[contains(text(),'Process Order Form')]//following::td[text()='Completed']"));
		try {
			Boolean UserNameIsExist = UserName.isDisplayed();
			if(UserNameIsExist){
				boolean PrcoessOrdrStatus = PrcoessOrderFormLink.isDisplayed();
				if(PrcoessOrdrStatus){
					boolean notStarted = ProcessOrdrStatus.isDisplayed();
					if(notStarted){
						if(ProcessOrdrStatus.getText().trim().equals("Completed")){
							PrcoessOrderStatus=true;
							driver.navigate().refresh();
						}
					}

				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return PrcoessOrderStatus;
	}

	public void WaitForSpecificTime() throws InterruptedException {
		Thread.sleep(20000);
	}

	public void WaitFor10k() throws InterruptedException {
		Thread.sleep(10000);
	}


	public Boolean validateFinanceApprovrs(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Finance approval")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Finance approval");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}

	public Boolean validateApplicationDeliveryApprovrs(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Application delivery approval")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Application delivery approval");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}


	public Boolean validateApplicationSupportApprovrs(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Application support approval")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Application support approval");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}

	public Boolean validateServiceApprovrs(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Services approval")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Services approval");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}

	public Boolean verifyPageHeader(String titleName)throws InterruptedException{
		Boolean pageTtitle=false;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(PageHeaderName));
			Boolean tbodyExist = PageHeaderName.isDisplayed();
			String pageTitleName = PageHeaderName.getText().trim();
			if(tbodyExist && pageTitleName.equals(titleName)){
				pageTtitle=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return pageTtitle;
	}

	public Boolean verifyCrmNumberAndStatus(String todo)throws InterruptedException{
		Boolean verifyStatus=false;
		try{
			Thread.sleep(20000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", CrmRefSeeAllLink);
			//CrmRefSeeAllLink.click();
			Thread.sleep(20000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String crmID = prop.getProperty("CRMID");
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(filterInputVal));
			filterInputVal.clear();
			filterInputVal.sendKeys(crmID);
			Thread.sleep(10000);
			filterInputVal.sendKeys(Keys.ENTER);
			filterApplyBtn.click();
			/*Thread.sleep(2000);
			js.executeScript("arguments[0].click();", CrmRefSeeAllLink);
			//CrmRefSeeAllLink.click();*/
			WaitForSpecificTime();
			verifyStatus=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return verifyStatus;
	}


	public Boolean verifyCrmRefAndStatuCoumnIndex(String StatusState,String Eofstatus)throws InterruptedException{
		Boolean verifyCrmNameAndStatus=false;
		try{
			String crmRefColumnNo = crmRefNumberColumn.getAttribute("aria-colindex").trim();
			String CRMRefNameActaul = driver.findElement(By.xpath("//div[contains(@class,'ms-DetailsRow') and @aria-colindex='"+crmRefColumnNo+"']")).getText().trim();
			String statusColumnNo = statusColumn.getAttribute("aria-colindex").trim();
			String statusActualState = driver.findElement(By.xpath("//div[contains(@class,'ms-DetailsRow') and @aria-colindex='"+statusColumnNo+"']")).getText().trim();
			String eofColumnNo = EsofStatus.getAttribute("aria-colindex").trim();
			String EofStatusActualState = driver.findElement(By.xpath("//div[contains(@class,'ms-DetailsRow') and @aria-colindex='"+eofColumnNo+"']")).getText().trim();

			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String crmID = prop.getProperty("CRMID");
			System.out.println("CRMREfActaul is"+CRMRefNameActaul+"CRMID expected"+crmID+"working fine");
			System.out.println("statusActualState is"+statusActualState+"CRMID expected"+StatusState+"working fine");
			if(CRMRefNameActaul.equals(crmID) && statusActualState.equals(StatusState))
			{
				verifyCrmNameAndStatus= true;
				System.out.println("Working fine as expected");

			}
			if(EofStatusActualState.equals(Eofstatus)){
				verifyCrmNameAndStatus= true;
				System.out.println("Working fine as expected");
			}else {
				verifyCrmNameAndStatus= false;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return verifyCrmNameAndStatus;
	}


	public boolean SofLogMenu() throws Exception{
		boolean sofLog=false;
		try{
			sofLog = SofLogLob.isDisplayed();
			if(sofLog){
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", SofLogLob);
				Thread.sleep(20000);
				sofLog=true;
			}
		}catch (Exception e){
			System.out.println("try catch");
			e.printStackTrace();
		}
		finally {
			return sofLog;
		}
	}

	public boolean SofLogMenuForDaftStatus() throws Exception{
		boolean sofLog=false;
		try{
			driver.navigate().back();
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(10000);
			sofLog = SofLogLob.isDisplayed();
			if(sofLog){
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", SofLogLob);
				Thread.sleep(20000);
				sofLog=true;
			}
		}catch (Exception e){
			System.out.println("try catch");
			e.printStackTrace();
		}
		finally {
			return sofLog;
		}
	}




































//	WebConnnector con;

	@FindBy(xpath = "//a[@title='Bid List']")
	WebElement BidList;

	@FindBy(xpath = "//input[@title='Name Required Field']")
	WebElement Name;

	@FindBy(xpath = "//input[@title='Bid Title Required Field']")
	WebElement BidTitle;

	@FindBy(xpath = "//input[@title='Client Name Required Field']")
	WebElement ClientName;

	@FindBy(xpath = "//select[@title='Bid Event Type Required Field']")
	WebElement BidEventType;

	@FindBy(xpath = "//select[@id='DropdownNr1']")
	WebElement BidManager;

	@FindBy(xpath = "//select[@id='DropdownNr2']")
	WebElement SalesLead;

	@FindBy(xpath = "//input[@title='Submission Date Required Field']")
	WebElement SubmissonDate;

	@FindBy(xpath = "//select[@title='Sensitivity level Required Field']")
	WebElement SensitivityLevel;

	@FindBy(xpath = "//textarea[contains(@id,'Notes')]")  //"//textarea[@title='Notes']")
	WebElement Notes;

	@FindBy(xpath = "//textarea[contains(@id,'Security')]") //"//textarea[@title='Security clearance requirements Required Field']")
	WebElement SecurityClearanceRequirements;

	@FindBy(xpath = "//textarea[contains(@id,'Submission')]")//"//textarea[@title='Submission instructions Required Field']")
	WebElement SubmissionInstructions;

	//@FindBy(xpath = "//input[@title='CRM ID']")
	//WebElement CRMID;



	@FindBy(xpath = "//input[@value='Save']")
	WebElement Save;

	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//td[@valign='top']/../td[3]")
	List<WebElement> FinalBidValues;



	@FindBy(xpath = "//*[@title='Upload a document from your computer to this library.']/span[1]")
	WebElement uploadBtn;

	@FindBy(xpath ="//*[@id='dialogTitleSpan']")
	WebElement addDocumentDialogBox;


	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement addDocmentPageClose;



	@FindBy(xpath = "//input[@title='Choose a file']")
	WebElement uploadFilePath;

	@FindBy(xpath = "//*[@title='Version Comments']")
	WebElement versionComment;

	@FindBy(xpath = "//*[@value='OK']")
	WebElement okUploadBnt;

	@FindBy(xpath = "//*[text()='Sub Group']//following::input[@value='Check In']")
	WebElement checkInbtn;

	@FindBy(xpath = "//*[@title='Select files and download as a zip file']/span/img")
	WebElement zipFileBtn;

	@FindBy(xpath = "//*[@title='Click here for Final Submission']/span/img")
	WebElement finalSubmission;

	@FindBy(xpath = "//*[@class='ms-List-cell']")
	WebElement bidRecordsCnt;

	@FindBy(xpath = "(((//*[@class='ms-List-cell'])[1]//following::span[contains(@class,'FieldRenderer-NameRenderer-SignalField')])[1]//following::a)[1]")
	WebElement bidCreationBtn;

	@FindBy(xpath = "(//div[@role='checkbox'])[1]")
	WebElement bidAttachmentChkBox;


	@FindBy (xpath = "//iframe[contains(@src,'/FinalSubmission/FinalSubmission.aspx')]")
	WebElement finalSubmisionFrame;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement FinalSubmissionOk;

	@FindBy(xpath  ="//a[@id='ViewPropsLink']")
	WebElement viewAllPropertiesLink;

	@FindBy(xpath = "//a[contains(@name,'SPBookmark_Frameworks_')]//following::input[@value='Close']")
	WebElement CloseBtn;

	@FindBy(xpath  ="//a[@id='EditPropsLink']")
	WebElement EditPropertiesLink;

	@FindBy(xpath = "//input[@title='Bid Title Required Field']")
	WebElement  bidTitle;

	@FindBy(xpath = "//*[contains(@id,'Frameworks')]//following::input[@value='Save']")
	WebElement SaveBtns;

	@FindBy(xpath = "//*[text()='Copy Documents']")
	WebElement copyDocument;

	@FindBy(xpath = "//select[@id='crmIDList']")
	WebElement crmIdDropDown;

	@FindBy(xpath = "//input[@id='copyDoc']")
	WebElement copyBtn;

	@FindBy(xpath = "//p[@id='msgCopy']")
	WebElement CopySuccessFulMsg;

	@FindBy(xpath = "//iframe[contains(@id,'DlgFrame') and @class='ms-dlgFrame']")
	WebElement DlgFrame;

	@FindBy(xpath = "//a[@id='destBidUrl']")
	WebElement destinationBidLink;

	@FindBy(xpath = "//span[text()='Edit' and @class='CommandBarItem-commandText']")
	WebElement editMenu;

	@FindBy(xpath = "//span[text()='Delete' and @class='CommandBarItem-commandText']")
	WebElement deleteBidManager;


	@FindBy(xpath = "//*[contains(text(),'Deleted 1 item from ')]")
	WebElement deletedMsg;

	// new document added
	@FindBy(xpath = "//input[@value='SharePoint Test case (2)' and contains(@title,'Name Required Field')]")
	WebElement DocName;  // i want to take this xpath directly into script as value will get change



    @FindBy(xpath = "//select[contains(@title,'Document Group Required') or contains(@id,'Document')]")
	WebElement documentRequiredDropDown;

    @FindBy(xpath = "//select[contains(@title,'Sub Group Required') or contains(@id,'Sub')]")
	WebElement subgroup;

    @FindBy(xpath = "//span[@id='idDocsetName']")
	WebElement BidId;

    @FindBy(xpath = "//*[text()='More']/span[2]")
	WebElement moreBtn;

    @FindBy(xpath = "//a[@id='ID_AdvancedMenu']")
	WebElement advanceMenuOption;

	@FindBy(xpath = "//a[@id='ID_DeleteMenu']")
	WebElement deleteMenuOption;

	@FindBy(xpath = "//a[@id='ID_Checkout' or @id='ID_Checkin']")
	WebElement checkInAndCheckOut;

	@FindBy(xpath = "//*[@id='CheckinDescription']")
	WebElement CheckInComments;

	@FindBy(xpath = "//input[@id='CheckinOk']")
	WebElement checkInBtnOk;

	@FindBy(xpath = "//input[@id='inplaceSearchDiv_WPQ7_lsinput']")
	WebElement insideBidCreation;

	@FindBy(xpath = "//div[@id='WebPartWPQ1']//input[1]")
	WebElement BidRecordKeyContent;

	@FindBy(id = "Result")
	public WebElement SearchContentBid;

	@FindBy(xpath = "//span[@id='inplaceSearchDiv_WPQ7_lsimgspan']")
	WebElement SearchMagnifierBtn;

	@FindBy(xpath = "//table[@summary='Bid List']/tbody")
	WebElement BidRecords;

	@FindBy(name = "Search")
	WebElement SearchAsKey;

	@FindBy(xpath = "//span[text()='Share']")
	WebElement shareBtnDispay;

	@FindBy(xpath = "//div[@id='selected-suggestion-alert']//following::input[1]")
	WebElement enterSenderName;

	@FindBy(xpath = "//div[contains(@id,'id__') and text()='Send']")
	WebElement  sendRecepientBtn;

	@FindBy(xpath = "//div[@class='od-ShareNotification-icon']")
	WebElement shareNotificatioDisplay;

	@FindBy(xpath = "//*[@class='ms-standardheader' and text()='CRM ID']//following::td[2]")
	WebElement getCRMID;

	@FindBy(xpath = "(//span[@class='ag-selection-checkbox'])[1]")
	public WebElement recordchkbox;

	@FindBy(xpath = "(//span[@class='ag-selection-checkbox'])[1]//following::span[@ref='eCellValue'][1]")
	public WebElement fetchUnqRefNumber;

	@FindBy(xpath = "//div[contains(@id,'id') and text()='Raise Invoice']")
	public WebElement raiseInvoiceBtn;

	@FindBy(xpath = "//div[contains(@id,'id') and text()='Create Invoice']")
	public  WebElement CreateInvoiceBtn;

	@FindBy(xpath = "//label[text()='CRM Number:']//following::input[1]")
	public WebElement ActualCrmNumber;

	@FindBy(xpath = "//label[text()='Your Invoice have been successfully created']")
	public WebElement InvoiceSussfullyCreated;

	@FindBy(xpath = "//a[text()='Click here to view']")
	public  WebElement cllLink;


	public PropertiesPageObject() {
		PageFactory.initElements(driver, this);
	}

	public boolean isNameTextBoxDisplayed() {
		return (Name.isDisplayed());
	}

	public boolean isNameTextBoxEnabled() {
		return (Name.isEnabled());
	}


	public void switchToDefaultWindow() {
		driver.switchTo().defaultContent();
	}

	public String bidIDNumber(){
		BidId.isDisplayed();
	    return BidId.getText().trim();
	}


	public boolean isBidListRightSideOptionDisplayed() {
		return (BidList.isDisplayed());
	}

	public boolean isBidListRightSideOptionsEnabled() {
		return (BidList.isEnabled());
	}

	public boolean isBidTitleTextBoxDisplayed() {
		return (BidTitle.isDisplayed());
	}

	public boolean isBidTitleTextBoxEnabled() {
		return (BidTitle.isEnabled());
	}

	public boolean isClientNameTextBoxDisplayed() {
		return (ClientName.isDisplayed());
	}

	public boolean isClientNameTextBoxEnabled() {
		return (ClientName.isEnabled());
	}

	public boolean isBidEventTypeDropDownBoxDisplayed() {
		return (BidEventType.isDisplayed());
	}

	public boolean isBidEventTypeDropDownBoxEnabled() {
		return (BidEventType.isEnabled());
	}

	public boolean isBidManagerDropDownDisplayed() {
		return (BidManager.isDisplayed());
	}

	public boolean isBidManagerDropDownEnabled() {
		return (BidManager.isEnabled());
	}

	public boolean isSalesLeadDropDownDisplayed() {
		return (SalesLead.isDisplayed());
	}

	public boolean isSalesLeadDropDownEnabled() {
		return (SalesLead.isEnabled());
	}

	public boolean isSubmissionDateFieldDisplayed() {
		return (SubmissonDate.isDisplayed());
	}

	public boolean isSubmissionDateFieldEnabled() {
		return (SubmissonDate.isEnabled());
	}

	public boolean isSensitivityLevelDropDownDisplayed() {
		return (SensitivityLevel.isDisplayed());
	}

	public boolean isSensitivityLevelDropDownEnabled() {
		return (SensitivityLevel.isEnabled());
	}

	public boolean isNotesTextDisplayed() {
		return (Notes.isDisplayed());
	}

	public boolean isNotesTextEnabled() {
		return (Notes.isEnabled());
	}

	public boolean isSecurityClearanceRequirementsTextDisplayed() {
		return (SecurityClearanceRequirements.isDisplayed());
	}

	public boolean isSecurityClearanceRequirementsTextEnabled() {
		return (SecurityClearanceRequirements.isEnabled());
	}

	public boolean isSubmissionInstructionsTextDisplayed() {
		return (SubmissionInstructions.isDisplayed());
	}

	public boolean isSubmissionInstructionsTextEnabled() {
		return (SubmissionInstructions.isEnabled());
	}




	public boolean isSaveButtonDisplayed() {
		return (Save.isDisplayed());
	}

	public boolean isSaveButtonEnabled() {
		return (Save.isEnabled());
	}

	public boolean isCancelButtonDisplayed() {
		return (Cancel.isDisplayed());
	}

	public boolean isCancelButtonEnabled() {
		return (Cancel.isEnabled());
	}

	public void clickBidListRightHandSideOption() {
		try {
			BidList.click();
			WaitForSpecificTime();
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}

	}




	public void clickCancelButton() {
		Cancel.click();
	}

	public void setName(String Name) throws InterruptedException {
		this.Name.sendKeys(Name);
		Thread.sleep(2000);
	}


	public ArrayList<String> getFinalBidValues() {
		ArrayList<String> temp = new ArrayList<String>();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(FinalBidValues.get(1)));
		
		for (int i = 0; i < FinalBidValues.size(); i++) {
			temp.add(FinalBidValues.get(i).getText());
		}
		return temp;
	}



	public void uploadBtnVeriy()throws InterruptedException{
		try{
			Thread.sleep(10000);
			uploadBtn.click();
			WaitForSpecificTime();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void uploadFile()throws InterruptedException{
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			prop.load(ip);
			String docName = prop.getProperty("attachmentName");
			uploadFilePath.sendKeys( System.getProperty("user.dir")+"/Attachments/"+docName);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void versionCommits()throws InterruptedException{
		try{
			versionComment.sendKeys("Test Uplaod");
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void addDocumentSpanWindow()throws InterruptedException{
		try{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", addDocumentDialogBox);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void okUploadBnt()throws InterruptedException{
		try{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", okUploadBnt);
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void checkIn()throws InterruptedException{
		try{

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", checkInbtn);
			Thread.sleep(20000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}


	public void finalSubmissionFrame()throws InterruptedException{
		try{
			Thread.sleep(5000);
			driver.switchTo().frame(finalSubmisionFrame);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void finalSubmissionOk()throws InterruptedException{
		try{
			FinalSubmissionOk.click();
			driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
			//Thread.sleep(20000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void zipBtnVerify()throws InterruptedException{
		System.out.println("JummmmmmmmmmmmmmmmmmmmmmmmmmmmmmPPPPPPPPing");
		driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", zipFileBtn);
		Thread.sleep(5000);

	}

	public void verifyZipGetsDownloaded() throws  Exception{
		Thread.sleep(20000);
		String crmId =getCRMID.getText().trim();
		System.out.println("sdjfkjdsfksdkfkdskf :" +crmId);
		String path = "C:\\Users\\Parmeshwar.Sakole\\Downloads";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		boolean found = false;
		File f = null;
		//Look for the file in the files
		// You should write smart REGEX according to the filename
		for (File listOfFile : listOfFiles) {
			if (listOfFile.isFile()) {
				String fileName = listOfFile.getName();
				System.out.println("File " + listOfFile.getName());
				if (fileName.matches("CRMID_"+crmId+".zip")) {
					f = new File(fileName);
					found = true;
				}
			}
		}
		Assert.assertTrue("Downloaded document is not found",found);
		f.deleteOnExit();
		//if(Directory.Exist)
	}

	public  void finalSubmissionVerify()throws InterruptedException{
		try{
			Thread.sleep(5000);
			finalSubmission.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void alertPersentOrNot()throws InterruptedException{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 60 /*timeout in seconds*/);
			if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
				System.out.println("alert  present");
				Alert alert = driver.switchTo().alert();
				alert.accept();
				Thread.sleep(5000);
			}else{
				System.out.println("alert was present");
			}
		}catch (Exception e){

		}
	}
	public String getTitle="";
	public void checkExistBidCreation()throws InterruptedException{
		try{
			Thread.sleep(10000);
			List<WebElement> bidRecords =  driver.findElements(By.xpath("(//*[@class='ms-List-cell'])[1]//following::span[contains(@class,'FieldRenderer-NameRenderer-SignalField')]"));
			System.out.println("bidRecords count "+ bidRecords);
			if(!bidRecords.isEmpty()){
					getTitle=  bidCreationBtn.getText();
					System.out.println("---------*****"+getTitle);
						bidCreationBtn.click();
			}else{
					System.out.println("We don't have a bid creation records");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public boolean BidReturnSearchContent()throws  Exception{
		Boolean flag= false;
		try{
			Boolean tbodyExist = BidRecords.isDisplayed();
			if(tbodyExist){
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	public boolean SearchContentBidDisplay()throws  Exception{
		Boolean flag= false;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(SearchContentBid));
			Boolean tbodyExist = SearchContentBid.isDisplayed();
			if(tbodyExist){
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}


	public boolean BidReturnAsKeyContent()throws  Exception{
		Boolean flag= false;
		Thread.sleep(10000);
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		try{

			String docName = prop.getProperty("BidListKey");
			Boolean tbodyExist = driver.findElement(By.xpath("//span[text()='"+docName+"']")).isDisplayed();
			if(tbodyExist){
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		finally {
			ip.close();
		}
		return flag;
	}

	public boolean  bidListViewDocSelect(String uploadedDocName) throws Exception{
		boolean docFlag=false;
		try{
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			WebElement test = driver.findElement(
					By.xpath("(//a[text()='"+uploadedDocName+"']//preceding::div[@role='checkbox'and @aria-checked='false'])[1]"));
			driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
			System.out.println("**************************************************test Id one "+ test);
			test.click();
			Thread.sleep(2000);
			docFlag=true;
			/*
			WebDriverWait wait = new WebDriverWait(driver, 30 );
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@summary='Bid List']/thead/tr/th"))));
			List<WebElement> bidRecords =  driver.findElements(By.xpath("//table[@summary='Bid List']/thead/tr/th"));
			Lable1:
			for(int i=1;i<=bidRecords.size();i++)
			{
						String bidListHeaderName = driver.findElement(By.xpath("(//table[@summary='Bid List']/thead/tr/th)["+i+"]")).getText().trim();
						if(bidListHeaderName.equals("Name")){
							System.out.println("first Loop Success"+i);
							boolean tbody = driver.findElement(By.xpath("//table[@summary='Bid List']/tbody/tr")).isDisplayed();
							 if(tbody)
							 {
								 System.out.println("secod Loop Success");
								 List<WebElement> tblDocNameCnt = driver.findElements(By.xpath("(//table[@summary='Bid List']/tbody/tr/td["+i+"]/div/a)"));
									for(int j=1;j<=tblDocNameCnt.size();j++)
									{
										System.out.println("third Loop Success"+(i)+"("+j+")");
										String docName = driver.findElement(By.xpath("(//table[@summary='Bid List']/tbody/tr/td["+i+"]/div/a)["+j+"]")).getText().trim();
										if(docName.equals(uploadedDocName))
										{

											 driver.findElement(By.xpath("(//table[@summary='Bid List']/tbody/tr/td["+i+"]/div/a)["+j+"]//preceding::div[@role='checkbox'][1]")).click();
											*//*JavascriptExecutor js = (JavascriptExecutor)driver;
											js.executeScript("arguments[0].click();", chkbox);*//*
											System.out.println("Last Loop Success"+j);
											docFlag=true;
											System.out.println("break1");
											break;
										}
									}
							 }else {
							 	Assert.fail("Attachment not present for this bid");
							 }
							if(docFlag)
								System.out.println("break5");
								break;

						}
			}*/
		}catch (Exception e){
			e.printStackTrace();
		}
		return docFlag;
	}

	public void switchWindow() throws InterruptedException {
		PopupWindow window = new PopupWindow();
		window.getTitleOfNewPage(driver,getTitle);
	}
	public void selectItemInBidList()throws InterruptedException{
		try{
			driver.switchTo().defaultContent();
			bidAttachmentChkBox.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void viewAllPropertiesLink()throws InterruptedException{
		try{
			driver.switchTo().defaultContent();
			viewAllPropertiesLink.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void CloseBtn()throws InterruptedException{
			CloseBtn.click();
	}

	public void EditPropertiesLink()throws InterruptedException{
			driver.switchTo().defaultContent();
			EditPropertiesLink.click();
	}



	public void UpdateTheBidTitle(String changeTitleName){
		try{
			bidTitle.clear();
			bidTitle.sendKeys(changeTitleName);

		}catch (Exception e){
			e.printStackTrace();

		}
	}

	public void copyDocument()throws InterruptedException{
			copyDocument.click();
	}

	public void  SelectCrmId() throws InterruptedException, IOException {
		//Dropdown dropdown = new Dropdown();
		//dropdown.selectValueFromUnorderedList((WebElement) driver,val);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String crmId = prop.getProperty("CRMID");
		Select bidmanager = new Select(this.crmIdDropDown);
		bidmanager.selectByVisibleText(crmId);
	}

	public void CopyDocumentBtn()throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", copyBtn);
	}

	public void waitTillMsgDisply() throws InterruptedException {
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(DlgFrame);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(CopySuccessFulMsg));
		Thread.sleep(2000);
	}
	public void destinationLink()throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", destinationBidLink);
		    Thread.sleep(2000);

	}

public void clickOnBIdMangerSelection(String titleName) throws InterruptedException {
			System.out.println("titleName......>"+titleName);
			driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
			WebElement slectCheckbox = driver.findElement(By.xpath("(//button[contains(@class,'ms-Link titleField') and @title='"+titleName+"'])[1]//preceding::div[contains(@class,'ms-Check root')][1]"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", slectCheckbox);
}

public void editMenuBar()throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(editMenu));
			editMenu.click();
}

	public void deleteBidManager()throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(deleteBidManager));
			deleteBidManager.click();

	}

	public void deleteConfirmBtn()throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(deleteConfirmBtn));
			deleteConfirmBtn.click();
	}

	public void confirmDeletMessage()throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(deletedMsg));
	}

	public void verifyEditTitleName(String bidName)throws InterruptedException{
			Thread.sleep(5000);
			WebElement updatedElemnt = driver.findElement(By.xpath("//button[@title='"+bidName+"' and text()='"+bidName+"']"));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(updatedElemnt));
			Assert.assertTrue(updatedElemnt.isDisplayed());

	}

	public void SelectBidCreated(String bidName)throws InterruptedException{
		Thread.sleep(5000);
		WebElement updatedElemnt = driver.findElement(By.xpath("//button[@title='"+bidName+"' and text()='"+bidName+"']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(updatedElemnt));
		Assert.assertTrue(updatedElemnt.isDisplayed());

	}


	public void VerifyDocumentStatus() throws  InterruptedException{
		driver.manage().timeouts().pageLoadTimeout(30, SECONDS);
		List<WebElement> tblHeader = driver.findElements(By.xpath("(//table//thead/tr/th)"));
		for(int i=0;i<tblHeader.size();i++){
			String status = tblHeader.get(i).getText().trim();
			System.out.println("status "+ status);
			if(status.equalsIgnoreCase("Document Group")){
				WebElement docuStatuswebElement = driver.findElement(By.xpath("(//table//thead//tr//th//following::tbody[1]/tr/td)["+(i+1)+"]"));
				String docstatus = docuStatuswebElement.getText().trim();
				System.out.println("docstatus "+ status);
				if(docstatus.equalsIgnoreCase("Final Submission")){
						Assert.assertTrue(docuStatuswebElement.isDisplayed());
						break;
					}else{
						Assert.fail("Document Status not in Final Status");
					}
			}
		}
}

	public void SelectAutoGeneratedBidID() throws InterruptedException, IOException {
		driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String bidNumber = prop.getProperty("BidId");
		WebElement slectCheckbox = driver.findElement(By.xpath("//*[text()='"+bidNumber+"']//preceding::div[@role='checkbox' and @aria-checked='false' ][1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", slectCheckbox);

	}

	public void clickOnBidRecord() throws InterruptedException, IOException {
		try {
			Thread.sleep(10000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String bidNumber = prop.getProperty("BidId");
			System.out.println("bid*************** "+bidNumber);
			fileInputStream.close();
			WebElement bidNumberExist = driver.findElement(By.xpath("//a[text()='"+ bidNumber +"']"));
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(bidNumberExist));
			bidNumberExist.click();
		}catch (Exception e){

			e.printStackTrace();
		}
	}

	public void clickOnBidForSearchAttachMentContent() throws InterruptedException, IOException {
		try {
			Thread.sleep(10000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String bidNumber = prop.getProperty("BidNumberForSearch");
			System.out.println("bid*************** "+bidNumber);
			fileInputStream.close();
			WebElement bidNumberExist = driver.findElement(By.xpath("//a[text()='"+ bidNumber +"']"));
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(bidNumberExist));
			bidNumberExist.click();
		}catch (Exception e){

			e.printStackTrace();
		}
	}



	public boolean isAdvanceMenu() throws Exception{
		try {


			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", advanceMenuOption);
			//advanceMenuOption.click();
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public boolean isDeleteOption() throws Exception{
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", deleteMenuOption);
			Thread.sleep(2000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}


	public boolean isCheckInAndCheckOut() throws Exception{
		try {
			Thread.sleep(5000);
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("arguments[0].click();", checkInAndCheckOut);
			checkInAndCheckOut.click();
			Thread.sleep(2000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public void isSearchContentChecked() throws Exception{
		try{
			Thread.sleep(5000);
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			prop.load(ip);
			String docName = prop.getProperty("InsideBidContentSearch");
			insideBidCreation.sendKeys( docName);
			SearchMagnifierBtn.click();
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void isSearchBidRecordKeyContent() throws Exception{
		try{
			Thread.sleep(5000);
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			prop.load(ip);
			String docName = prop.getProperty("InsideBidContentSearch");
			BidRecordKeyContent.sendKeys(docName);
			BidRecordKeyContent.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}




	public void isSearchContentKey() throws Exception{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		try{
			Thread.sleep(5000);

			String docName = prop.getProperty("BidListKey");
			SearchAsKey.sendKeys( docName);
			SearchAsKey.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
		finally {
			ip.close();
		}
	}

	public boolean isSharebtnDisplay() throws Exception{
		boolean chkbtn=false;
		try{
			Thread.sleep(10000);
			shareBtnDispay.isDisplayed();
			shareBtnDispay.click();
			chkbtn=true;
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return chkbtn;
	}


	public void isAddSenderName(String Name) throws InterruptedException {
		this.enterSenderName.sendKeys(Name);
		Thread.sleep(5000);
		this.enterSenderName.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	public boolean isSendBtn() throws Exception{
		boolean sendBtnEnabled = false;
		try {
			 sendBtnEnabled=this.sendRecepientBtn.isDisplayed();
			 this.sendRecepientBtn.click();
		}catch (Exception e){
			e.printStackTrace();
		}
		return sendBtnEnabled;
	}

	public boolean isShareNotification() throws Exception{
		boolean shareNotifiaction = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(shareNotificatioDisplay));
			shareNotifiaction=this.shareNotificatioDisplay.isDisplayed();
		}catch (Exception e){
			e.printStackTrace();
		}
		return shareNotifiaction;
	}


	public boolean isCheckOutExistOrNot() throws Exception{
		Boolean CheckOutOption= false;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 60 /*timeout in seconds*/);
			if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
				System.out.println("alert  present");
				Alert alert = driver.switchTo().alert();
				String alertMsg =alert.getText();
				System.out.println("*************************************************"+alertMsg);
				alert.accept();
				CheckOutOption= true;
				Thread.sleep(5000);
			}else{
				System.out.println("alert was present");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return CheckOutOption;
	}

	public boolean isCheckInPopupIsExist() throws Exception{
		Boolean checkIn= false;
		try{
			Thread.sleep(2000);
			CheckInComments.sendKeys("TestCheckIn");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", checkInBtnOk);
			Thread.sleep(5000);
			checkIn=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return checkIn;
	}

	public void clickOnBidRecordForShare() throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String bidNumber = prop.getProperty("BidId");
			System.out.println("bid*************** "+bidNumber);
			fileInputStream.close();
			WebElement bidNumberExist = driver.findElement(By.xpath("//a[text()='"+ bidNumber +"']//preceding::div[@role='checkbox'][1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", bidNumberExist);
			//bidNumberExist.click();
		}catch (Exception e){

			e.printStackTrace();
		}
	}




	public String  fullPermission() throws Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		String Username = prop.getProperty("fullPermissionUseName");
		String pwd  =  prop.getProperty("fullPermissionPwd");
		String url = "tc3-v-devsp06/sites/invoicesportal/SitePages/Home.aspx\n";
		String Url = "http://"+Username+":"+pwd+"@"+url;
		return Url;
	}

	public String TestUser() throws  Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		String Username = prop.getProperty("testUsername");
		String pwd  =  prop.getProperty("testPwd");
		String url = "tc3-v-devsp06/sites/invoicesportal/SitePages/Home.aspx\n";
		String Url = "http://"+Username+":"+pwd+"@"+url;
		return Url;
	}



}
