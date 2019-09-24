package rs.itbootcamp.humanity.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityEditStaff_Test;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;
import rs.itbootcamp.humanity.page.tests.HumanitySettings_Test;

public class GlaviProgram_MAIN {

	public static void main(String[] args) throws InterruptedException {
		// logIn na humanity
		// HumanityLoginTests.testHumanityLogin();

		// dodavanje radnika
	//	HumanityAddNewEmployeeTests.testHumanityAddNewEmployee();

		// dodavanje slike i nadimka (treba ubaciti sliku)
	//	HumanityEditStaff_Test.test_HumanityEditStaff();
		
		//promeniti zemlju, jezik i time format
		HumanitySettings_Test.test_Humanity_Settings();

	}

}
