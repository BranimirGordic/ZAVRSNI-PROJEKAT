package rs.itbootcamp.humanity.page.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.ExcelUtils;
import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class   LogIN {
	@Test
	//	public static void main(String[] args) throws InterruptedException {
	public static void loggingTest() {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
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
				Thread.sleep(5000);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(5000);
				Assert.assertEquals(driver.getCurrentUrl(), HumanityHome.URL);
			}catch(Exception e) {
				System.out.println(e.toString());
				
			}
				
		driver.quit();			
		}

		}
	