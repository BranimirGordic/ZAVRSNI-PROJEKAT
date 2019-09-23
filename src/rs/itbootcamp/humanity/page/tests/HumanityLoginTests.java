package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTests {
	
	public static boolean testHumanityLogin() throws InterruptedException {
//	public static void main(String[] args) throws InterruptedException {
		
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
		
		
		Thread.sleep(2000);
		
		return true;
	}
	}

