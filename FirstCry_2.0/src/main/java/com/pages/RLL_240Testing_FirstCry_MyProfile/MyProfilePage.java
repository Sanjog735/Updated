package com.pages.RLL_240Testing_FirstCry_MyProfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProfilePage {

	WebDriver driver;
	WebDriverWait wait;

	public MyProfilePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	
	
	By myAccount = By.xpath("//span[text()='My Account']");
	By myProfile = By.xpath("(//a[text()='My Profile'])[2]");

	public void clickOnMyAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(myAccount)).click();
	}

	public void clickOnMyProfile() {
		wait.until(ExpectedConditions.elementToBeClickable(myProfile)).click();
	}
	
	

	// My Profile
	By profileEditIcon = By.cssSelector("div[id='parent_1']");
	By profileName = By.cssSelector("input[id='userFnLName']");
	By profile_i_am = By.id("userGenderMale");
	By exp_Child_checkBox = By.xpath("//div[@class='seml']/span[@class='sprite-listing sp_ck1' and @data-val='N']");
	By profileDateBtn = By.xpath("(//input[@id='ExpChldDOBTop'])[1]");
	By profieDate = By.xpath("//div[@class='core border tue' and text()='8']");
	By profileSave = By.id("UpdateUserInfo");

	public void clickOnProfileEditIcon() {
		wait.until(ExpectedConditions.elementToBeClickable(profileEditIcon)).click();
	}

	public void enterName(String name) {
		WebElement enterNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(profileName));
		enterNameElement.clear();
		enterNameElement.sendKeys(name);
	}

	public void clickOnProfileIAm() {
		wait.until(ExpectedConditions.elementToBeClickable(profile_i_am)).click();
	}

	public void clickOnExpectingChildCheckBox() {
		wait.until(ExpectedConditions.elementToBeClickable(exp_Child_checkBox)).click();
	}

	public void setExpectedChildDate() {
		wait.until(ExpectedConditions.elementToBeClickable(profileDateBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(profieDate)).click();
	}

	public void clickOnProfileSave() throws InterruptedException {
//		wait.until(ExpectedConditions.elementToBeClickable(profileSave)).click();
		driver.findElement(profileSave).click();
		Thread.sleep(5000);

	}

}
