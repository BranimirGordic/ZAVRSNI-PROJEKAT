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
	
	
		try {
			
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
			 HumanityStaff.clickSaveEmployeesBtn(driver);

			Thread.sleep(5000);
			if (driver.getCurrentUrl().equals("https://boban1.humanity.com/app/staff/add/"))
			System.out.println("Uspesno dodavanje");
			else {
				System.out.println("Neuspesno dodavanje");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	driver.quit();
		return true;
	}

}
