package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityEditStaff_Test {
	public static boolean test_HumanityEditStaff() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickGoToLogin(driver);

		HumanityHome.clickUserName(driver);
		HumanityHome.inputUserName(driver, "kaboget@net1mail.com");

		HumanityHome.clickPssword(driver);
		HumanityHome.inputPssword(driver, "bobanrajovic");

		HumanityHome.clickLogin(driver);

		HumanityProfile.clickProfiIcon(driver);
		HumanityProfile.clickIconSetting(driver);

		HumanityEditStaff.inputNickName(driver, "Ana");

		HumanityEditStaff.clickSaveEmploy(driver);

		Thread.sleep(5000);
		driver.quit();
		return true;
	}

}