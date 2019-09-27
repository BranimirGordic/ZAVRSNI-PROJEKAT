package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String URL = "https://www.humanity.com/";
	private static final String ABOUT_US_BUTTON = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String FIND_NAME = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String START_FREE_TRIALE = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String START_FREE_TRIALE2 = "//a[@class='button pale']";
	private static final String GO_TO_LOGIN = "//p[contains(text(),'LOGIN')]";
	private static final String EMAIL_USER_NAME = "//input[@id='email']";
	private static final String PASSWORD = "//input[@id='password']";
	private static final String LOG_IN = "//button[contains(text(),'Log in')]";
//	private static final String MY_USER_NAME = "kaboget@net1mail.com";
// 	private static final String MY_PASSWORD = "bobanpiroman";

//ABOUT US

	public static WebElement getButtonAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_BUTTON));
	}

	public static void clickButtonAboutUs(WebDriver driver) {
		getButtonAboutUs(driver).click();
	}

//FULL NAME
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FIND_NAME));
	}

	public static void clickFullName(WebDriver driver) {
		getFullName(driver).click();
	}

	public static void inputFullName(WebDriver driver, String data) {
		getFullName(driver).sendKeys(data);
	}

// WORK EMAIL
	public static WebElement getWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL));
	}

	public static void clickWorkEmail(WebDriver driver) {
		getWorkEmail(driver).click();
	}

	public static void inputWorkEmail(WebDriver driver, String data) {
		getWorkEmail(driver).sendKeys(data);
	}

//START MY FREE TRIALE
	public static WebElement getFreeTriale(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE_TRIALE));
	}

	public static void clickFreeTriale(WebDriver driver) {
		getFreeTriale(driver).click();
	}

//START MY FREE TRIALE2
	public static WebElement getFreeTriale2(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE_TRIALE2));
	}

	public static void clickFreeTriale2(WebDriver driver) {
		getFreeTriale2(driver).click();
	}

//	GO TO LOGIN
	public static WebElement getGoToLogin(WebDriver driver) {
		return driver.findElement(By.xpath(GO_TO_LOGIN));
	}

	public static void clickGoToLogin(WebDriver driver) {
		getGoToLogin(driver).click();
	}

//USER NAME/EMAIL
	public static WebElement getUserName(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_USER_NAME));
	}

	public static void clickUserName(WebDriver driver) {
		getUserName(driver).click();
	}

	public static void inputUserName(WebDriver driver, String data) {
		getUserName(driver).sendKeys(data);
	}

	// USER PASSWORD
	public static WebElement getPssword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD));
	}

	public static void clickPssword(WebDriver driver) {
		getPssword(driver).click();
	}

	public static void inputPssword(WebDriver driver, String data) {
		getPssword(driver).sendKeys(data);
	}

	// LOGIN
	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOG_IN));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

}
