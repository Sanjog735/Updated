package com.pages.RLL_240Testing_FirstCry_MyProfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactDetailsPage {

	WebDriver driver;
	 WebDriverWait wait;

	public ContactDetailsPage(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	// My Contact
	By contactDetails = By.xpath("//a[contains(@href, 'accountdetails') and contains(text(), 'Contact Details')]");
	By myContactEditIcon = By.id("editt");
	By contactMobile = By.id("txtAddMobilenew");
	By contactVerifyBtn = By.id("callmebtn");
	By contactMobileOtp = By.id("mobotp");
	By contactEmailOtp = By.id("emailotp");
	By contatSubmit = By.id("otpsubmit");
	By contactOverlay = By.xpath("//div[@class='otp-popup-overlay']");
	By verifyBtn = By.id("callmebtn");
	By submitOtp = By.id("otpsubmit");

	public void clickOnContactDetails() throws InterruptedException {
	
	}

	public void clickOnMyContactEditIcon() throws InterruptedException {
		driver.findElement(myContactEditIcon).click();
		Thread.sleep(1000);
	}

	public void setContactNumber(String mobileNumber) throws InterruptedException {
		WebElement updatedNumber = driver.findElement(contactMobile);
		updatedNumber.clear();
		Thread.sleep(1000);
		updatedNumber.sendKeys(mobileNumber);
		
	}

	public void clickOnContactVerifyBtn() throws InterruptedException {
		driver.findElement(verifyBtn).click();
		Thread.sleep(15000);
	}
	
	public void clickOnSubmitOtpBtn() {
		driver.findElement(submitOtp).click();
	}

}
