package pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import step_definitions.BaseClass;

//import com.sharepoint.qa.base.TestBase;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//span[contains(text(),'Create Contract')]")
	WebElement CreateContract;



	//span[text()='More' and contains(@class,'ms-ContextualMenu-itemText label-')]

	//span[text()='Workflow' and contains(@class,'ms-ContextualMenu-itemText label-')]







































	@FindBy(xpath = "//a[@title='Bid List']")
	WebElement BidListMenu;

	@FindBy(xpath = "//a[@title='Home']")
	WebElement HomeMenu;

	@FindBy(xpath = "//div[text()='Restricted bids']")
	WebElement restrictedBid;

	@FindBy(className = "CommandBarItem-commandText")
	List<WebElement> CommandBarItems;

	//@FindBy(xpath = "//span[contains(text(),'Create New Bid')]")   earlier xpath changed
	//WebElement CreateNewBid;



//	@FindBy(xpath = "//a[@title='Create New Bid']")
//	WebElement CreateNewBid = driver.findElement(By.xpath((String) BidOperationsPageprop.get("CreateNewBid")));

	@FindBy(xpath = "//iframe[@class='ms-dlgFrame']")
	WebElement CreateNewBidFrame;

	@FindBy(xpath = "//span[text()='Delete' and @class='CommandBarItem-commandText']")
	WebElement deleteBidManager;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickBidListMenu() throws InterruptedException {
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(BidListMenu));

		// Fluent wait
		// Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30,
		// TimeUnit.SECONDS).pollingEvery(1,
		// TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		try {
			BidListMenu.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickNew() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(CommandBarItems.get(5)));
		} catch (TimeoutException excep) {
			excep.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*for (int i = 0; i < CommandBarItems.size(); i++) {
			System.out.println("i = " + i + " text = " + CommandBarItems.get(i).getText());
			if(CommandBarItems.get(i).getText().trim().equals("Create Bid")) {
				//CommandBarItems.get(i).click();
				System.out.println("Tested");
			}
		}*/
	}



	public void switchToCreateNewBidFrame() {
		driver.switchTo().frame(CreateNewBidFrame);
	}

	public String getPageTitle() {
		return (driver.getTitle().trim());
	}



	public boolean isDeleteButtonDisplay() throws Exception{
		boolean checkIn= false;
		try{
			try {
				WebDriverWait wait = new WebDriverWait(driver, 60);
				checkIn = wait.until(ExpectedConditions.visibilityOf(deleteBidManager)).isDisplayed();
			}catch (Exception e){
				checkIn=false;
			}
			finally {
				if(checkIn==false){
					checkIn=true;
				}else{
					checkIn=false;
				}
			}
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}catch (Exception e){
			e.printStackTrace();
		}
		return checkIn;
	}


	public boolean HomeBtn() throws Exception{
		boolean homeBtn= false;
		try {
			 homeBtn= HomeMenu.isDisplayed();
			if(homeBtn) {
				HomeMenu.click();
				homeBtn=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return homeBtn;
	}

	public boolean ResttrictedWidget() throws Exception{
		boolean homeBtn= false;
		try {
			homeBtn= restrictedBid.isDisplayed();
			if(homeBtn) {
				restrictedBid.click();
				homeBtn=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return homeBtn;
	}

	public boolean CRMIDErrorMessage() throws Exception{
		boolean homeBtn= false;
		try {
			homeBtn= HomeMenu.isDisplayed();
			if(homeBtn) {
				HomeMenu.click();
				homeBtn=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return homeBtn;
	}


}
