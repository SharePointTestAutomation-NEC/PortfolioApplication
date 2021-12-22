package step_definitions;

import com.aventstack.extentreports.Status;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageobjects.CreateNewContractCreationPage;
import pageobjects.HomePage;
import pageobjects.PropertiesPageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.function.Function;


public class Generic_Steps extends BaseClass {

	CreateNewContractCreationPage createNewContractCreationPage = new CreateNewContractCreationPage();
	public String SubmissonDate;
	SoftAssert sa;
	@Given("^I have logged in full permission user model$")
	public void iHaveLoggedInFullPermissionUserModel() throws Exception {
		String Url = createNewContractCreationPage.fullPermission();
		driver.get(Url);
	}
	@And("^I click on Property icon from side bar$")
	public void iClickOnBacklogAndUnblockedMenuFromSideBarOption() throws InterruptedException {
		PropertiesPageObject property = new PropertiesPageObject();
		test.log(Status.INFO, "Properties Details: " + "");
		property.clickOnPropertyHeaderIcon();
	}

	@And("^I click on Facilities Manangment icon from side bar$")
	public void iClickOnFacilitiesManagment() throws InterruptedException {
		PropertiesPageObject property = new PropertiesPageObject();
		test.log(Status.INFO, "Facilities Management Details: " + "");
		property.clickOnFacilitiesManagment();
	}
	@And("^I click on Health and Facility icon from side bar$")
	public void iClickOnHealthAndFacility() throws InterruptedException {
		PropertiesPageObject property = new PropertiesPageObject();
		test.log(Status.INFO, "Health and Facilities  Details: " + "");
		property.clickOnHeathAndFacility();
	}



	@And("^I click on Property Details option$")
	public void iClickOnRaiseRequestForBackLogAndUnblockLogRequest() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on Properties details Header option" + "");
		homepage.clickOnPropertiesDetailsOption();
	}

	@And("^I click on FM Call Log Details option$")
	public void iClickOnFMCallLogin() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on FM Call Login details Header option" + "");
		homepage.clickOnFMCallLogOption();
	}

	@And("^I click on NPS Facility Service Provider option$")
	public void iClickOnNPSFacilityServiceProvider() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on NPS Facility Service Provider option" + "");
		homepage.clickOnNPSFacilitServiceProviderOption();
	}

	@And("^I click on Accident option$")
	public void iClickOnAccident() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on Accident option" + "");
		homepage.clickOnAccidentOption();
	}

	@And("^I click on Potential Accident option$")
	public void iClickOnPotentialAccident() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on Accident option" + "");
		homepage.clickOnPotentialAccidentOption();
	}

	@And("^I click on SiteAssisment and Inception option$")
	public void iClickOnSiteAssisment() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on SiteAssisment option" + "");
		homepage.clickOnSiteAssismentOption();
	}

	@And("^I click on Fire Safety and Inception option$")
	public void iClickOnFireSafey() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on SiteAssisment option" + "");
		homepage.clickOnFireSafetyOption();
	}

	@And("^I click on Property Lease Details option$")
	public void iClickOnRaiseLeaseDetails() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on Properties Lease details Header option" + "");
		homepage.clickOnPropertiesLeaseDetailsOption();
	}


	@And("^I click on Property Licences Details option$")
	public void iClickOnRaiseLicencesDetails() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on Properties Licences details Header option" + "");
		homepage.clickOnPropertiesLicencesDetailsOption();
	}

	@And("^I click on Property Lease Calendar option$")
	public void iClickOnRaiseLeaseCalendarDetails() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on Properties Lease Calendar Header option" + "");
		homepage.clickOnPropertiesLeaseCalendarOption();
	}

	@And("^I click on Property Licenses Calendar option$")
	public void iClickOnRaiseLicensesCalendarDetails() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on Properties Licenses Calendar Header option" + "");
		homepage.clickOnPropertiesLicensesCalendarOption();
	}

	@And("^I click on Document Store option$")
	public void iClickOnDocumentStore() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on Documnt store option" + "");
		homepage.clickOnDocuementStoreOption();
	}

	@And("^I click on Template Store option$")
	public void iClickOnTemplateStore() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "click on Documnt store option" + "");
		homepage.clickOnTemplateStoreOption();
	}

	@And("^I click on Create plus icon button and creating the NPS General Details$")
	public void iClickOnNewPlusIconButtonAndCreatingTheFolderForArchival() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Click on Create plus icon button: " + "");
		homepage.setCreatebtnClick();

	}

	@And("^I click on New plus icon button and creating the NPS Serive Provider details$")
	public void iClickOnNewButtonAndCreatingTheFolderForArchival() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Click on Create plus icon button: " + "");
		homepage.setNewBtnClick();

	}






	@And("^I click on New plus icon button and creating the Property Licences Details$")
	public void iClickOnNewPlusPropertyLicencesDetails() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Click on New plus icon button: " + "");
		homepage.setNewBtnClick();
	}

	@And("^I verify the Lease calendar home page$")
	public void leaseCalendarHomePage() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Lease Calendar Home Page: " + "");
		homepage.LeaseCalendarHomePage();
	}

	@And("^I verify the Licenses calendar home page$")
	public void licensesCalendarHomePage() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Licenses Calendar Home Page: " + "");
		homepage.LicensesCalendarHomePage();
	}

	@And("^I verify the Document Store home page$")
	public void documentStoreHomePage() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Document Store Home Page: " + "");
		homepage.setDocumentStoreHomePage();
	}

	@And("^I verify the Template Store home page$")
	public void TemplateStoreHomePage() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Temlate Store Home Page: " + "");
		homepage.setTemplateStoreHomePage();
	}

	@And("^I click on Folder link button$")
	public void iClickOnStoreHomePage() throws InterruptedException, FileNotFoundException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Click on Folder" + "");
		homepage.iClickOnFolderBtnClick();
		homepage.CreateFolder();
	}

	@And("^I verify the folder created$")
	public void iVerifyTheFolderButton() throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Click on Folder" + "");
		homepage.verifyFolderCreated();
	}



	@And("^Fill the NPS Property details and Site location as (.*) and Save it$")
	public void fillTheNPSPropertyDetailsAndSaveIt(String site) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Switch the frame " + "");
		homepage.switchToCreateFrame();
		homepage.fillPrpertiesDetails(site);
	}

	@And("^Fill the Facilities Management Details and Save it$")
	public void fillTheFacilitiesManagementAndSaveIt() throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Switch the frame " + "");
		homepage.switchToCreateFrame();
		homepage.fillFacilitiesFMCallLogOpneStatusManagement();
	}

	@And("^Fill the Accident Details and Save it$")
	public void fillTheAccidentDetailsSaveIt() throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Switch the frame " + "");
		homepage.switchToCreateFrame();
		homepage.fillAccidentDetails();
	}

	@And("^Fill the Site Assisment and Inception Details and Save it$")
	public void fillTheSiteAssementSaveIt() throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Switch the frame " + "");
		homepage.switchToCreateFrame();
		homepage.fillSiteAssismentDetails();
	}

	@And("^Fill the Fire Safety Details and Save it$")
	public void fillTheFireSafetySaveIt() throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Switch the frame " + "");
		homepage.switchToCreateFrame();
		homepage.fillFireSafetyDetails();
	}

	@And("^Fill the NPS Facility Service Provider Details and Save it$")
	public void fillTheNPSFacilitySeriveProviderSaveIt() throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		//test.log(Status.INFO, "Switch the frame " + "");
		//homepage.switchToCreateFrame();
		homepage.filTheNPSServiceProviderDetails();
	}

	@And("^Fill the Facilities Management Close Details and Save it$")
	public void fillTheFacilitiesCloseManagementAndSaveIt() throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Switch the frame " + "");
		homepage.switchToCreateFrame();
		homepage.fillFacilitiesFMCallLogCLoseStatusManagement();
	}

	@And("^Fill the NPS Property details for Inactive Site location as (.*) and Save it$")
	public void fillSiteLocatioForInactive(String site) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Switch the frame " + "");
		homepage.switchToCreateFrame();
		homepage.fillPrpertiesDetailsWithInactive(site);
	}


	@And("^Fill the NPS Property Lease details and Save it$")
	public void fillPropertyLeaseDetails() throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Property Lease Details " + "");
		homepage.switchToCreateFrame();
		homepage.fillPropertyLeaseDetails();
	}


	@And("^Fill the NPS Property Licences details with title Name as(.*) and reference No as(.*)$")
	public void fillPropertyLicencesDetails(String titleName, String RefNo) throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Property Licences Details " + "");
		homepage.fillPropertyLicencesDetails(titleName,RefNo);
	}

	@And("^Fill the lease calendar property name(.*) and date type as(.*)$")
	public void fillPropertyLeaseCalendarDetails(String propertyName, String dateType) throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Property Lesase Details " + "");
		homepage.fillPropertyLeaseCalendar(propertyName,dateType);
	}

	@And("^Fill the licenses calendar property name(.*) and date type as(.*)$")
	public void fillPropertyLicensesCalendarDetails(String propertyName, String dateType) throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Property licenses Details " + "");
		homepage.fillPropertyLicensesCalendar(propertyName,dateType);
	}

	public String getContractDataFromPropertyFile(String KeyName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/InvoiceApplicationData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyName = prop.getProperty(KeyName);
		return keyName;
	}

	public String getWorkFlowFromPropertyFile(String KeyName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/WorkFlowData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyName = prop.getProperty(KeyName);
		return keyName;
	}



	@And("^I click the on the Save Button$")
	public void iClickTheOnTheSaveButton() throws InterruptedException {
		PropertiesPageObject invoice = new PropertiesPageObject();
		invoice.SavebtnClick();
		createNewContractCreationPage.WaitForSpecificTime();
	}

	@And("^I click the on the Save Button for NPSSeriveProvider$")
	public void iClickTheOnTheSaveButtonForNPS() throws InterruptedException {
		PropertiesPageObject invoice = new PropertiesPageObject();
		invoice.SaveLicensesbtnClick();
		createNewContractCreationPage.WaitForSpecificTime();
	}



	@And("^Click on the created complain FM call with (.*) status$")
	public void CheckRecentComplain(String test) throws InterruptedException {
		PropertiesPageObject invoice = new PropertiesPageObject();
		Thread.sleep(10000);
		invoice.checkBoxCheck();
		invoice.EditClick();
		invoice.EditStatusClosed(test);


	}



	@And("^I click the on the Save Button for Licenses$")
	public void save() throws InterruptedException {
		PropertiesPageObject invoice = new PropertiesPageObject();
		invoice.SaveLicensesbtnClick();
		createNewContractCreationPage.WaitForSpecificTime();
	}







	@And("^I verify the Create Invoice page is navigated or not$")
	public void iVerifyTheCreateInvoicePageIsNavigatedOrNot() {
		PropertiesPageObject invoiceApp = new PropertiesPageObject();
		test.log(Status.INFO, "Create Invoice Page");
		Assert.assertTrue(invoiceApp.createInvoice.isDisplayed(),"Create Invoice page navigated");
	}

	@And("^Select the csutomer and CRM id from respective drop down$")
	public void selectTheCsutomerAndCRMIdFromRespectiveDropDown() throws IOException, InterruptedException {
		Thread.sleep(60000);
		PropertiesPageObject invoice = new PropertiesPageObject();
		invoice.selectcustomerDrpDown.click();
		invoice.setCustomerName(getContractDataFromPropertyFile("customerName"));
		Thread.sleep(10000);
		invoice.selectCRMDropDowm.click();
		invoice.setCRMID(getContractDataFromPropertyFile("CRMID"));
	}




	@Given("^I have logged in full permission user model(.*)$")
	public void iHaveLoggedInFullPermissionUserModel(String AdminRights) throws Exception {
		String permission= "AdminRights";
		try {
			if(permission.equals(AdminRights.trim())){
				String Url = createNewContractCreationPage.fullPermission();
				driver.get(Url);
			}else {
				String Url = createNewContractCreationPage.TestUser();
				driver.get(Url);
			}
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			Thread.sleep(10000);
			HomePage homepage = new HomePage();
			sa = new SoftAssert();
			test = rep.createTest("Testing...");
			String expectedtitle = "Contracts - Contracts - All Items";
			String actualtitle = homepage.getPageTitle();
			System.out.println("------------------->actualtitle = " + actualtitle);
			sa.assertEquals(actualtitle, expectedtitle);
			test.log(Status.INFO, "Expected title = " + expectedtitle);
			test.log(Status.INFO, "Actual title = " + actualtitle);
			if (expectedtitle.equals(actualtitle.trim())) {
				test.log(Status.PASS, "Expected and Actual title is a match");
			} else {
				test.log(Status.FAIL, "Expected and Actual title does NOT match");
			}
		}

	}






	@Then("^Verify Archival Logs get created along with status No and Url should not be created$")
	public void verifyArchivalLogsGetCreatedAlongWithStatusNoAndUrlShouldNotBeCreated() {
		//todo;
	}

	@And("^Verify the Archival Status folder Yes and url should get generated\\.$")
	public void verifyTheArchivalStatusFolderYesAndUrlShouldGetGenerated() {
		//todo;
	}


	@And("^verify the records are present or not for this cutomer$")
	public void verifyTheRecordsArePresentOrNotForThisCutomer() {
		PropertiesPageObject invoice = new PropertiesPageObject();
		Assert.assertTrue(invoice.recordchkbox.isDisplayed(),"Records present for selected Customer");
	}

	@And("^I click on the records checkbox and raise the request$")
	public void iClickOnTheRecordsCheckboxAndRaiseTheRequest() throws InterruptedException {
		PropertiesPageObject invoice = new PropertiesPageObject();
		invoice.recordchkbox.click();
		invoice.fetchUnqRefNumbers();
		invoice.raiseInvoiceBtn.click();
	}

	@And("^Verify CRMNumber and Create Invoice$")
	public void verifyCRMNumberAndCreateInvoice() throws IOException, InterruptedException {
		PropertiesPageObject invoice = new PropertiesPageObject();
		invoice.fetchUnqRefNumbersAndActualCrm(getContractDataFromPropertyFile("CRMID"));
		invoice.CreateInvoiceBtn.click();
		invoice.InvoiceSussfullyCreated.isDisplayed();
		Thread.sleep(10000);
		invoice.cllLink.click();
	}


	@Then("^Verify NPS Property details record once we Save it for Active$")
	public void verifyNPSPropertyDetailsRecordOnceWeSaveIt() throws InterruptedException, IOException {
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String activeSiteLocation = prop.getProperty("sitelocationforActiveAdd");
		System.out.println("activeSiteLocation*************** "+activeSiteLocation);
		manageFluientWaits(driver.findElement(By.xpath("//*[text()='"+activeSiteLocation+"' and @title='"+activeSiteLocation+"']//preceding::div[1]")));
		driver.findElement(By.xpath("//*[text()='"+activeSiteLocation+"' and @title='"+activeSiteLocation+"']//preceding::div[1]")).click();
		Thread.sleep(10000);

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

	@Then("^Verify FM Call Log record once we Save it for Active$")
	public void verifyFMCallLogRecordOnceWeSaveIt() throws InterruptedException, IOException {
		Thread.sleep(10000);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String CallDescss = prop.getProperty("callDescOpen");
		System.out.println("activeSiteLocation*************** "+CallDescss);
		driver.findElement(By.xpath("//*[text()='"+CallDescss+"']")).isDisplayed();

	}

	@Then("^Verify the Accident record once we Save it$")
	public void verifyAccidentRecordOnceWeSaveIt() throws InterruptedException, IOException {
		Thread.sleep(10000);
		PropertiesPageObject invoice = new PropertiesPageObject();
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		invoice.VerifyRecordForAccident();
		invoice.GroupHederExpand();
		String CallDescss = prop.getProperty("ActiveAdd");
		System.out.println("activeSiteLocation*************** "+CallDescss);
		driver.findElement(By.xpath("//*[text()='"+CallDescss+"']")).isDisplayed();

	}


	@Then("^Verify the NPS Serive Provider saved Details$")
	public void verifyNPSServiceProviderSaveDetails() throws InterruptedException, IOException {
		Thread.sleep(10000);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String CallDescss = prop.getProperty("NPSSeriveProviderTitleName");
		System.out.println("activeSiteLocation*************** "+CallDescss);
		driver.findElement(By.xpath("//*[text()='"+CallDescss+"']")).isDisplayed();

	}

	@Then("^Verify FM Call Log record once we Save it for Active closed$")
	public void verifyFMCallLogRecordOnceWeCLose() throws InterruptedException, IOException {
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='CommandBarItem-commandText']//following::i[contains(@class,'od-CommandBarItem-down ms-Icon')]"));
		manageFluientWaits(ele);
		ele.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='ClosedItem']")).click();
		Thread.sleep(10000);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String CallDescss = prop.getProperty("callDescClose");
		System.out.println("activeSiteLocation*************** "+CallDescss);
		driver.findElement(By.xpath("//*[text()='"+CallDescss+"']")).isDisplayed();

	}

	@Then("^Verify FM Call Log record once we Save it for Active Opened$")
	public void verifyFMCallLogRecordOnceWeOpen() throws InterruptedException, IOException {
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='CommandBarItem-commandText']//following::i[contains(@class,'od-CommandBarItem-down ms-Icon')]"));
		manageFluientWaits(ele);
		ele.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='OPenItemLoggedByMe']")).click();
		Thread.sleep(10000);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String CallDescss = prop.getProperty("callDescClose");
		System.out.println("activeSiteLocation*************** "+CallDescss);
		driver.findElement(By.xpath("//*[text()='"+CallDescss+"']")).isDisplayed();

	}

	@Then("^I delete the Respctive FM call Log state as (.*)$")
	public void DeletTheFMCallLog(String state) throws InterruptedException, IOException {
		PropertiesPageObject propertiesPageObject = new PropertiesPageObject();
		propertiesPageObject.DeleteRecordCheck(state);
		propertiesPageObject.CheckBoxCheck();
		propertiesPageObject.deleteConfirmBtn();
		propertiesPageObject.confirmDeletMessage();
	}

	@Then("^I delete the NPS Serive Provider Facility Saved Datails$")
	public void DeletTheFMsCallLog() throws InterruptedException, IOException {
		PropertiesPageObject propertiesPageObject = new PropertiesPageObject();
		propertiesPageObject.DeleteNPSRecordCheck();
		propertiesPageObject.CheckBoxCheck();
		propertiesPageObject.deleteConfirmBtn();
		propertiesPageObject.confirmDeletMessage();
	}


	@Then("^Verify NPS Property details record once we Save it for InActive$")
	public void verifyNPSInactiveetails() throws InterruptedException, IOException {
		Thread.sleep(10000);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String activeSiteLocation = prop.getProperty("InActiveAdd");
		System.out.println("activeSiteLocation*************** "+activeSiteLocation);
		manageFluientWaits(driver.findElement(By.xpath("//*[text()='"+activeSiteLocation+"' and @title='"+activeSiteLocation+"']//preceding::div[1]")));
		driver.findElement(By.xpath("//*[text()='"+activeSiteLocation+"' and @title='"+activeSiteLocation+"']//preceding::div[1]")).click();
		Thread.sleep(10000);
	}

	@And("^I click on earlier created active property details$")
	public void iClickOnEarlierCreatedActivePropertyDetails() throws InterruptedException, IOException {
		Thread.sleep(10000);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String activeSiteLocation = prop.getProperty("sitelocationforInActiveAdd");
		System.out.println("activeSiteLocation*************** "+activeSiteLocation);
		driver.findElement(By.xpath("//*[text()='"+activeSiteLocation+"' and @title='"+activeSiteLocation+"']")).click();
		Thread.sleep(50000);

	}

	@Then("^Verify NPS Property Lease details$")
	public void verifyNPSPropertyLeaseDetails() throws IOException, InterruptedException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String referenceNumber = prop.getProperty("referenceNo");
		WebElement PropertyLeaseDetails = driver.findElement(By.xpath("//span[text()='"+referenceNumber+"']//preceding::div[@role='checkbox'][1]"));
		manageFluientWaits(PropertyLeaseDetails);
		PropertyLeaseDetails.isDisplayed();
		PropertyLeaseDetails.click();
		Thread.sleep(10000);
	}

	@Then("^Verify NPS Property Licenses details$")
	public void verifyNPSPropertyLicensesDetails() throws IOException, InterruptedException {
		PropertiesPageObject invoice = new PropertiesPageObject();
		invoice.VerifyRecordApprovalTypeForLicensesDetails();
		Thread.sleep(10000);
	}

	@And("^I click on Edit button and make it as (.*) Status.$")
	public void iClickOnEditButtonAndMakeItAsActiveStatus(String status) throws InterruptedException {
		PropertiesPageObject invoice = new PropertiesPageObject();
		invoice.Editbtnclick();
		invoice.getleaseStatusSelect(status);
		invoice.saveBtnClick();
	}

	@And("^Verify respective site location is Active or Inactive (.*) and (.*)$")
	public void verifyRespectiveSiteLocationIsActiveOrInactiveSiteStatus(String siteStatus,String address) throws IOException, InterruptedException {
		PropertiesPageObject invoice = new PropertiesPageObject();
		invoice.VerifyRecordApprovalTypeForInActive(address);
		invoice.VerifyActiveAndInactive(siteStatus);
	}
}
