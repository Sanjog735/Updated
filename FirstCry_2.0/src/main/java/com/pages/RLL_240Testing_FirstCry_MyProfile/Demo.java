package com.pages.RLL_240Testing_FirstCry_MyProfile;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		MyProfilePage mf = new MyProfilePage(driver);

		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();


		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Login /']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("8917355469");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='CONTINUE']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[text()='SUBMIT']")).click();
		Thread.sleep(1000);

		mf.clickOnMyAccount();
		mf.clickOnMyProfile();
		mf.clickOnProfileEditIcon();
//		mf.enterName();
		mf.clickOnProfileIAm();
		mf.clickOnExpectingChildCheckBox();
		mf.setExpectedChildDate();
		mf.clickOnProfileSave();

		Thread.sleep(5000);

//		mf.clickOnChildDetails();
//		mf.setChildName();
//		mf.selectChildDate();
//		mf.clickOnChildGender();
//		mf.setChildWeight();
//		mf.setChildHeight();
//		mf.clickOnChildSaveBtn();
//
//		Thread.sleep(5000);
//
//		mf.clickOnMyAddressBook();
//		mf.setUserNameinAddress();
//		mf.setHouseNumber();
//		mf.setAddress();
//		mf.setLandMark();
//		mf.setPinCode();
//		mf.setMobileNumber();
//		mf.setTelephoneRegion();
//		mf.setTelNumber();
//		mf.clickOnAddressSaveBtn();

		Thread.sleep(2000);

		driver.quit();

	}

}
