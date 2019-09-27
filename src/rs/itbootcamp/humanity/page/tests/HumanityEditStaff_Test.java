package rs.itbootcamp.humanity.page.tests;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.ExcelUtils;
import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityEditStaff_Test {

	public static boolean Edit_Pic(WebDriver driver) throws InterruptedException {
		

		
		
		// dodavanje slike
		HumanityMenu.clicSettingMenu(driver);
		HumanityProfile.clickIconSetting(driver);
		HumanityEditStaff.inportUpdatePic(driver);
		
		HumanityEditStaff.inputNickName(driver, " Draguljce");

		// HumanityEditStaff.clickSaveEmploy(driver);

		Thread.sleep(2000);
		
		 return true;
	}
	public static boolean Edit_NickName(WebDriver driver) throws InterruptedException {
		// nick Name
		HumanityMenu.clicSettingMenu(driver);
		HumanityProfile.clickIconSetting(driver);
		
		
		HumanityEditStaff.inputNickName(driver, " Draguljce");

	

		Thread.sleep(2000);
		
		 return true;
	}
}
