package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {
	public static boolean testHumanityAddNewEmployee () throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		HumanityHome.getGoToLogin(driver);
		HumanityHome.clickGoToLogin(driver);
		
		HumanityHome.getUserName(driver);
		HumanityHome.clickUserName(driver);
		HumanityHome.inputUserName(driver, "kaboget@net1mail.com");
		HumanityHome.getPssword(driver);
		HumanityHome.clickPssword(driver);
		HumanityHome.inputPssword(driver, "bobanrajovic");
		
		HumanityHome.getLogin(driver);
		HumanityHome.clickLogin(driver);
		
		HumanityMenu.getStaffButton(driver);
		HumanityMenu.clickStaffButton(driver);
		HumanityStaff.getAddEmployees(driver);
		HumanityStaff.clickAddEmployees(driver);
		Thread.sleep(1000);
		for(int i=1; i<=1; i++) {
			HumanityStaff.setFirstNameInput(driver, "Milos", i);
			HumanityStaff.setLastNameInput(driver, "Sreckovic", i);
			HumanityStaff.setEmailInput(driver, "milos.sreckovic@gmail.com", i);
			HumanityStaff.clickSaveEmployeesBtn(driver);
		}
	

		Thread.sleep(3000);
		driver.close();
		return true;
	}

}
