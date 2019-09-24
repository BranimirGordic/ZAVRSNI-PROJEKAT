package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String URL = "https://boban1.humanity.com/app/staff/list/load/true/";
	private static final String ZAPOSLENI_1 = "//a[contains(text(),'Branimir go')]";
	private static final String ZAPOSLENI_2 = "//tr[3]//td[2]//a[1]";
	private static final String ZAPOSLENI_3 = "//tr[4]//td[2]//a[1]";
	private static final String ADD_EMPLOYEES = "//button[@id='act_primary']";
	private static final String FIRST_NAME_XPATH = "//input[@id='_asf";
	private static final String LAST_NAME_XPATH = "//input[@id='_asl";
	private static final String EMAIL_NAME_XPATH = "//input[@id='_ase";
	private static final String INPUT_ENDING_XPATH = "']";
	private static final String SAVE_EMPLOYEES = "//button[@id='_as_save_multiple']";

//	Zaposleni 1
	public static WebElement getZaposlenog_1(WebDriver driver) {
		return driver.findElement(By.xpath(ZAPOSLENI_1));
	}

	public static void clickZaposlenog_1(WebDriver driver) {
		getZaposlenog_1(driver).click();
	}

	// zposleni 2
	public static WebElement getZaposlenog_2(WebDriver driver) {
		return driver.findElement(By.xpath(ZAPOSLENI_2));
	}

	public static void clickZaposlenog_2(WebDriver driver) {
		getZaposlenog_2(driver).click();
	}

	// zaposleni 3
	public static WebElement getZaposlenog_3(WebDriver driver) {
		return driver.findElement(By.xpath(ZAPOSLENI_3));
	}

	public static void clickZaposlenog_3(WebDriver driver) {
		getZaposlenog_3(driver).click();
	}

	// ADD_EMPLOYEES
	public static WebElement getAddEmployees(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEES));
	}

	public static void clickAddEmployees(WebDriver driver) {
		getAddEmployees(driver).click();
	}
//	dodavanje novog zaposlenog

	// employee's first name

	public static WebElement getFirstNameInput(WebDriver driver, int redBr) {
		return driver.findElement(By.xpath(FIRST_NAME_XPATH + redBr + INPUT_ENDING_XPATH));
	}

	public static void setFirstNameInput(WebDriver driver, String name, int redBr) {
		getFirstNameInput(driver, redBr).sendKeys(name);
	}

	// employee's last name

	public static WebElement getLastNameInput(WebDriver driver, int redBr) {
		return driver.findElement(By.xpath(LAST_NAME_XPATH + redBr + INPUT_ENDING_XPATH));
	}

	public static void setLastNameInput(WebDriver driver, String name, int redBr) {
		getLastNameInput(driver, redBr).sendKeys(name);
	}

	// employee's email

	public static WebElement getEmailInput(WebDriver driver, int redBr) {
		return driver.findElement(By.xpath(EMAIL_NAME_XPATH + redBr + INPUT_ENDING_XPATH));
	}

	public static void setEmailInput(WebDriver driver, String name, int redBr) {
		getEmailInput(driver, redBr).sendKeys(name);
	}

	// save employees BUTTON
	public static WebElement getSaveEmployeesBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEES));
	}

	public static void clickSaveEmployeesBtn(WebDriver driver) {
		getSaveEmployeesBtn(driver).click();
	}

}