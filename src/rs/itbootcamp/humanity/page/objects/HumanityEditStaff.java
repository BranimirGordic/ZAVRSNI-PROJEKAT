package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String URL = "https://boban1.humanity.com/app/dashboard/";
	private static final String EDIT_DETALIS ="//a[contains(text(),'Edit Details')]";
	private static final String UPDATE_PIC ="//input[@id='fileupload']";
	private static final String NICK_NAME ="//input[@id='nick_name']";
	private static final String SAVE_EMPLOYEE ="//button[@id='act_primary']";
	
	// EDIT DETALIS
	public static WebElement getEditDetalis(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETALIS));
	}

	public static void clickEditDetalis(WebDriver driver) {
		getEditDetalis(driver).click();
	}
	// dodavanje slike prifile_Icon
	public static WebElement getUpdatePic(WebDriver driver) {
		return driver.findElement(By.xpath(UPDATE_PIC));
	}

	public static void clickProfilIcon(WebDriver driver) {
		getUpdatePic(driver).click();
	}
	// ubacivanje nadimka NICK_NAME
	public static WebElement getNickName(WebDriver driver) {
		return driver.findElement(By.xpath(NICK_NAME));
	}

	public static void clickNickName(WebDriver driver) {
		getNickName(driver).click();
	}
	public static void inputNickName(WebDriver driver, String data) {
		getNickName(driver).sendKeys(data);
	}
	// SAVE_EMPLOYEE 
	public static WebElement getSaveEmploy(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE));
	}

	public static void clickSaveEmploy(WebDriver driver) {
		getSaveEmploy(driver).click();
	}
	
	
	


}
