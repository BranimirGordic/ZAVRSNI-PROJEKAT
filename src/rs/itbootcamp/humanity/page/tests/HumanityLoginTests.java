package rs.itbootcamp.humanity.page.tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.ExcelUtils;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityLoginTests {

	public static boolean Login(WebDriver driver) throws InterruptedException {
//	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		driver.get(HumanityHome.URL);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		try {
			HumanityHome.clickGoToLogin(driver);

			String src = "Data (2).xls";

			ExcelUtils.setExcell(src);
			ExcelUtils.setWorkSheet(0);

			String userName = ExcelUtils.getDataAt(1, 0);
			String password = ExcelUtils.getDataAt(1, 1);

			HumanityHome.inputUserName(driver, userName);
			HumanityHome.inputPssword(driver, password);
			ExcelUtils.closeExcell();

			HumanityHome.clickLogin(driver);
			Thread.sleep(5000);

			if (driver.getCurrentUrl().equals(HumanityHome.URL)) {
				System.out.println("Uspesno smo se ulogovali");
			} else {
				System.out.println("Doslo je do greske!");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return true;
	}
	public static boolean AboutUs(WebDriver driver) throws InterruptedException {
		HumanityHome.clickButtonAboutUs(driver);
	
	return true;
	}
}
