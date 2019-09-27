package rs.itbootcamp.humanity.TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import rs.itbootcamp.humanity.ExcelUtils;
import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class Testin_NickName_Pic {
	@Test
	public static void NickName(WebDriver driver) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	
		if (!driver.getCurrentUrl().equals(HumanityHome.URL)) {
			driver.navigate().to(HumanityHome.URL);
		}
		SoftAssert sa = new SoftAssert();
		HumanityHome.clickGoToLogin(driver);

		String src = "Data (2).xls";

		ExcelUtils.setExcell(src);
		ExcelUtils.setWorkSheet(0);

		String userName = ExcelUtils.getDataAt(1, 0);
		String password = ExcelUtils.getDataAt(1, 1);
		try {
			HumanityHome.inputUserName(driver, userName);
			HumanityHome.inputPssword(driver, password);
			ExcelUtils.closeExcell();

			HumanityHome.clickLogin(driver);
			HumanityProfile.clickProfiIcon(driver);
//		dodavanje slike
			HumanityProfile.clickIconSetting(driver);


			HumanityEditStaff.inputNickName(driver, " Draguljce");

			HumanityEditStaff.clickSaveEmploy(driver);
			if (driver.getCurrentUrl().equals(HumanityEditStaff.URL)) {
				System.out.println("Dodali smo nadimak");
			} else {
				System.out.println("Nesto ne valja");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Thread.sleep(3000);
		driver.quit();

	}

	@Test
	public static void testSlika(WebDriver driver) throws InterruptedException {
		
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		if (!driver.getCurrentUrl().equals(HumanityHome.URL)) {
			driver.navigate().to(HumanityHome.URL);
		}
		SoftAssert sa = new SoftAssert();
		HumanityHome.clickGoToLogin(driver);

		String src = "Data (2).xls";

		ExcelUtils.setExcell(src);
		ExcelUtils.setWorkSheet(0);

		String userName = ExcelUtils.getDataAt(1, 0);
		String password = ExcelUtils.getDataAt(1, 1);
		try {
			HumanityHome.inputUserName(driver, userName);
			HumanityHome.inputPssword(driver, password);
			ExcelUtils.closeExcell();

			HumanityHome.clickLogin(driver);
			HumanityProfile.clickProfiIcon(driver);
//		// dodavanje slike
			HumanityProfile.clickIconSetting(driver);
			HumanityEditStaff.inportUpdatePic(driver);

			HumanityEditStaff.clickSaveEmploy(driver);
			if (driver.getCurrentUrl().equals(HumanityEditStaff.URL)) {
				System.out.println("Ima slike");
			} else {
				System.out.println("Nema slike");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Thread.sleep(3000);
		driver.quit();
	}
}