package rs.itbootcamp.humanity.start;

import java.util.Scanner;
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
		Scanner sc = new Scanner(System.in);
		int opcija;
		int opcija2;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		do {

			System.out.println("Gde zelite?");
			System.out.println("Na raspolaganju su vam sledece opcije:");
			System.out.println(" Prvo moras da se ulogujes!");
			System.out.println("1 - Login");
			System.out.println("2 - Staff");
			System.out.println("3 - Setting");
			System.out.println("4 - Edit Staff");
			System.out.println("5 - Add ");
			opcija = sc.nextInt();
			switch (opcija) {
			case 1:
				HumanityLoginTests.Login(driver);
				break;
			case 2:
				do {
					System.out.println("1 - Add Employees");
					opcija2 = sc.nextInt();
					switch (opcija2) {
					case 1:
						HumanityAddNewEmployeeTests.Add_NewEmployee(driver);
						break;
					default:
						System.out.println("Nije na raspolaganju, biraj ponovo! ");
						break;
					}
				} while (opcija2 != 0);
				break;
			case 3:
				do {
					System.out.println("1 - Dodavanje slike");
					System.out.println("2 - Dodavanje nadimka");
					opcija2 = sc.nextInt();
					switch (opcija2) {
					case 1:
						HumanityEditStaff_Test.Edit_Pic(driver);
						break;
					case 2:
						HumanityEditStaff_Test.Edit_NickName(driver);
						break;
					default:
						System.out.println("los izbor, biraj ponovo");
						break;
					}
				} while (opcija2 != 0);
				break;
			case 4:
				
			}

		} while (opcija != 0);

		driver.quit();
	}
}
