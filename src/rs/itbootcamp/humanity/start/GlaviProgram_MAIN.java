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
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		do {
			System.out.println("Gde zelite?");
			System.out.println("Na raspolaganju su vam sledece opcije:");
			System.out.println("1 - Home Page");
			System.out.println("2 - Home Menu");
			System.out.println("3 - Setting");
			System.out.println("4 - Edit Staff");
			System.out.println("5 - Add ");
			opcija = sc.nextInt();
			switch (opcija) {
			case 1:// home page
				do {
					System.out.println("1 - LogIn");
					System.out.println("2 - About Us");
					opcija = sc.nextInt();
					switch (opcija) {
					case 1:// log in
						HumanityLoginTests.Login(driver);
						break;
					case 2:// about au
						HumanityLoginTests.AboutUs(driver);
						break;
					default:
						System.out.println("Nije na raspolaganju, biraj ponovo! ");
						System.out.println();
						break;
					}
				} while (opcija != 0);
				break;

			case 2:// home menu
				do {
					System.out.println("1 - Dashboard");
					System.out.println("2 - Shift Planing");
					System.out.println("3 - Time Clock");
					System.out.println("4 - Leave");
					System.out.println("5 - Training");
					System.out.println("6 - Staff");
					System.out.println("7 - Payroll");
					System.out.println("8 - Reports");
					System.out.println("9 - Setting");
					System.out.println("10 - Profil Mani-Icon");
					opcija = sc.nextInt();
					switch (opcija) {
					case 1: HumanityMenu.clickDashbord(driver);
						;
						break;
					case 2: HumanityMenu.clickshifPlan_Button(driver);
						;
					case 3:
						;
						break;
					case 4:
						;
					case 5:
						;
						break;
					case 6:
						;
					case 7:
						;
						break;
					case 8:
						;
					case 9:
						;
						break;
					case 10:
						;
					default:
						System.out.println("Nije na raspolaganju, biraj ponovo! ");
						System.out.println();
					}

					break;
				} while (opcija != 0);
				HumanityAddNewEmployeeTests.Add_NewEmployee(driver);
				break;
			case 3:
				HumanitySettings_Test.Setting_Country_Language_TimeFormat();
				break;
			case 4:
				HumanityEditStaff_Test.Edit_Staff();
				break;
			default:
				System.out.println("Nije na raspolaganju, biraj ponovo! ");
				System.out.println();
				break;
			}
		} while (opcija != 0);
		////////////////////////////////////////////////////////////////////////
		// sema za do-while
		do {
			System.out.println();
			System.out.println();
			opcija = sc.nextInt();
			switch (opcija) {
			case 1:
				;
				break;
			case 2:
				;
			default:
				System.out.println("Nije na raspolaganju, biraj ponovo! ");
				System.out.println();
			}
///////////////////////////////////////////////////////////////////////////////////
		} while (opcija != 0);
		driver.quit();
	}

}
