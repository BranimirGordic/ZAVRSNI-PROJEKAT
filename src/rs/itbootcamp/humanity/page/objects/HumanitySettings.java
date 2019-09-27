package rs.itbootcamp.humanity.page.objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	
	public static final String URL ="https://boban1.humanity.com/app/admin/settings/";
	private static final String COUNTRY_MENU ="//select[@id='country']";
	private static final String DEFAULT_LANGUAGE_MENU ="//td[@class='nowrap']//select[@name='language']";
	private static final String TIME_FORMAT_MENU ="//select[@name='pref_24hr']";

	//SELECT COUNTRYhttps://boban1.humanity.com/app/staff/edit/5089092/

		public static Select getCountry(WebDriver driver) {
			return new Select(driver.findElement(By.xpath(COUNTRY_MENU)));

		}

		public static void inputCountry(WebDriver driver, String data) {
			getCountry(driver).selectByVisibleText(data);
		}

		// SELECT DEFAULT LANGUAGE
		public static Select getLanguage(WebDriver driver) {
			return new Select(driver.findElement(By.xpath(DEFAULT_LANGUAGE_MENU)));

		}

		public static void inputLanguage(WebDriver driver, String data) {
			getLanguage(driver).selectByVisibleText(data);
		}

		// SELECT TIME FORMAT
		public static Select getTimeFormat(WebDriver driver) {
			return new Select(driver.findElement(By.xpath(TIME_FORMAT_MENU)));

		}

		public static void inputTimeFormat(WebDriver driver, String data) {
			getTimeFormat(driver).selectByVisibleText(data);
			
		}
}