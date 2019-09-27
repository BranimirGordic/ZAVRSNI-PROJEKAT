package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettings_Test {
	public static boolean Setting_Country(WebDriver driver) throws InterruptedException {

		HumanityHome.clickGoToLogin(driver);
		HumanityHome.clickUserName(driver);
		HumanityHome.inputUserName(driver, "kaboget@net1mail.com");
		HumanityHome.clickPssword(driver);
		HumanityHome.inputPssword(driver, "bobanrajovic");
		HumanityHome.clickLogin(driver);

		HumanityMenu.clicSettingMenu(driver);

		HumanitySettings.inputCountry(driver, "Qatar");
		Thread.sleep(1000);
		HumanitySettings.inputLanguage(driver, "German (machine)");
		Thread.sleep(1000);
		HumanitySettings.inputTimeFormat(driver, "24 hour");

		Thread.sleep(5000);
		driver.quit();
		return true;
	}

	public static boolean Setting_Language(WebDriver driver) throws InterruptedException {

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickGoToLogin(driver);
		HumanityHome.clickUserName(driver);
		HumanityHome.inputUserName(driver, "kaboget@net1mail.com");
		HumanityHome.clickPssword(driver);
		HumanityHome.inputPssword(driver, "bobanrajovic");
		HumanityHome.clickLogin(driver);

		HumanityMenu.clicSettingMenu(driver);

		HumanitySettings.inputCountry(driver, "Qatar");
		Thread.sleep(1000);
		HumanitySettings.inputLanguage(driver, "German (machine)");
		Thread.sleep(1000);
		HumanitySettings.inputTimeFormat(driver, "24 hour");

		Thread.sleep(5000);
		driver.quit();
		return true;
	}

	public static boolean Setting_TimeFormat(WebDriver driver) throws InterruptedException {

		HumanityHome.clickGoToLogin(driver);
		HumanityHome.clickUserName(driver);
		HumanityHome.inputUserName(driver, "kaboget@net1mail.com");
		HumanityHome.clickPssword(driver);
		HumanityHome.inputPssword(driver, "bobanrajovic");
		HumanityHome.clickLogin(driver);

		HumanityMenu.clicSettingMenu(driver);

		HumanitySettings.inputCountry(driver, "Qatar");
		Thread.sleep(1000);
		HumanitySettings.inputLanguage(driver, "German (machine)");
		Thread.sleep(1000);
		HumanitySettings.inputTimeFormat(driver, "24 hour");

		Thread.sleep(5000);
		driver.quit();
		return true;
	}
}
