package rs.itbootcamp.humanity.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;

public class GlaviProgram_MAIN {

	public static void main(String[] args) throws InterruptedException {
		
	//	HumanityLoginTests.testHumanityLogin();
		HumanityAddNewEmployeeTests.testHumanityAddNewEmployee();
			

	}

}
