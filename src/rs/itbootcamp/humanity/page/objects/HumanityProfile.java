package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	public static final String URL = "https://boban1.humanity.com/app/dashboard/";
	private static final String PROFIL_ICON ="//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String  ICON_PROFIL="//a[contains(text(),'Profile')]";
	private static final String  ICON_SETING="//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String  ICON_AVAILABILITY="//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String  ICON_SIGN_OUT="//a[contains(text(),'Sign Out')]";
	private static final String  APP_VERSION="//div[@id='humanityAppVersion']";
	
	// ULAZAK NA PROFIL IKONICU
	public static WebElement getProfiIcon(WebDriver driver) {
		return driver.findElement(By.xpath(PROFIL_ICON));
	}

	public static void clickProfiIcon(WebDriver driver) {
		getProfiIcon(driver).click();
	}
	// ulazak na profil
	public static WebElement getIconProfil(WebDriver driver) {
		return driver.findElement(By.xpath(ICON_PROFIL));
	}

	public static void click(WebDriver driver) {
		getIconProfil(driver).click();
	}
// ulazak na setting
	public static WebElement getIconSetting(WebDriver driver) {
		return driver.findElement(By.xpath(ICON_SETING));
	}

	public static void clickIconSetting(WebDriver driver) {
		getIconSetting(driver).click();
	}
	// ulazak na AVAILABILITY
	public static WebElement getIconAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(ICON_AVAILABILITY));
	}

	public static void clickIconAvailability(WebDriver driver) {
		getIconAvailability(driver).click();
	}
	// APP_VERSION
	public static WebElement getAppVersion(WebDriver driver) {
		return driver.findElement(By.xpath(APP_VERSION));
	}

	// izlaz sa profila _SIGN_OUT
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(ICON_SIGN_OUT));
	}

	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}
}
	

