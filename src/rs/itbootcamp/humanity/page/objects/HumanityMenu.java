package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static final String URL = "https://boban1.humanity.com/app/dashboard/";
	private static final String DASHBORD_BUTTON = "//div[@id='userm']";
	private static final String SHFITPLANNING_BUTTON = "//div[@id='userm']";
	private static final String TIMECLOCK_BUTTON = "//div[@id='userm']";
	private static final String LEAVE_BUTTON = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String TRAINING_BUTTON = "//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF_BUTTON = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String PAYROLL_BUTTON = "//i[@class='primNavQtip__icon icon-payroll']";
	private static final String REPOTS_BUTTON = "//i[@class='primNavQtip__icon icon-chart']";
	private static final String SETTING_MENU ="//i[@class='primNavQtip__icon icon-gear']";
	
	public static WebElement getDashbord(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBORD_BUTTON));
	}

	public static void clickDashbord(WebDriver driver) {
		getDashbord(driver).click();
	}
	// shfit planing
	public static WebElement getshifPlan_Button(WebDriver driver) {
		return driver.findElement(By.xpath(SHFITPLANNING_BUTTON));
	}

	public static void clickshifPlan_Button(WebDriver driver) {
		getshifPlan_Button(driver).click();
	}
	// time clock
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIMECLOCK_BUTTON));
	}

	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}
	// leave button
	public static WebElement getLeaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_BUTTON));
	}

	public static void clickLeaveButton(WebDriver driver) {
		getLeaveButton(driver).click();
	}
	// TRAINING_BUTTON
	public static WebElement getTrainingButton(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_BUTTON));
	}

	public static void clickTrainingButton(WebDriver driver) {
		 getTrainingButton(driver).click();
	}
	// STAFF_BUTTON
	public static WebElement getStaffButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_BUTTON));
	}

	public static void clickStaffButton(WebDriver driver) {
		getStaffButton(driver).click();
	}
	//PAYROLL_BUTTON
	public static WebElement getPayRollButton(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_BUTTON));
	}

	public static void clickPayRollButton(WebDriver driver) {
		getStaffButton(driver).click();
	}
//REPOTS_BUTTON
	public static WebElement getRepotsButton(WebDriver driver) {
		return driver.findElement(By.xpath(REPOTS_BUTTON));
	}

	public static void clickRepotsButton(WebDriver driver) {
		getRepotsButton(driver).click();
	}
	// setting menu
		public static WebElement getSettingMenu(WebDriver driver) {
			return driver.findElement(By.xpath(SETTING_MENU));
		}

		public static void clicSettingMenu(WebDriver driver) {
			getSettingMenu(driver).click();
		}

	
}
