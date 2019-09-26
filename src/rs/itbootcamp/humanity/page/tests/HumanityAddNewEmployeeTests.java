package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.ExcelUtils;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {
	public static boolean Add_NewEmployee(WebDriver driver) throws InterruptedException {
		// public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		driver.get(HumanityHome.URL);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		try {
//			HumanityHome.getGoToLogin(driver);
//			HumanityHome.clickGoToLogin(driver);
//
//			HumanityHome.getUserName(driver);
//			HumanityHome.clickUserName(driver);
//			HumanityHome.inputUserName(driver, "kaboget@net1mail.com");
//			HumanityHome.getPssword(driver);
//			HumanityHome.clickPssword(driver);
//			HumanityHome.inputPssword(driver, "bobanrajovic");
//
//			HumanityHome.getLogin(driver);
//			HumanityHome.clickLogin(driver);

			HumanityMenu.getStaffButton(driver);
			HumanityMenu.clickStaffButton(driver);

			// u staff-u biramo nekog zaposlenog
			// HumanityStaff.clickZaposlenog_1(driver);
			// HumanityStaff.clickZaposlenog_2(driver);
			// HumanityStaff.clickZaposlenog_3(driver);
			Thread.sleep(5000);
			HumanityStaff.getAddEmployees(driver);
			HumanityStaff.clickAddEmployees(driver);
			Thread.sleep(1000);
			String src = "Data (2).xls";
			ExcelUtils.setExcell(src);
			ExcelUtils.setWorkSheet(1);
			int r = ExcelUtils.getRowNumber();
			for (int i = 1; i <= r; i++) {
				String ime = ExcelUtils.getDataAt(i, 0);
				String prezime = ExcelUtils.getDataAt(i, 1);
				String email = ExcelUtils.getDataAt(i, 2);

				HumanityStaff.setFirstNameInput(driver, ime, i);
				HumanityStaff.setLastNameInput(driver, prezime, i);
				HumanityStaff.setEmailInput(driver, email, i);
			}
			ExcelUtils.closeExcell();
			// HumanityStaff.clickSaveEmployeesBtn(driver);

			Thread.sleep(5000);
			driver.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return true;
	}

}
