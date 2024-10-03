package com.pages.RLL_240Testing_FirstCry_MyProfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAddressBookPage {

	WebDriver driver;
	WebDriverWait wait;

	public MyAddressBookPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	By myAddressBook = By.xpath("//*[text()='My Address Book']");
	By userName = By.id("txtAddName");
	By houseNo = By.id("txtAddAddress1");
	By address = By.id("txtAddAddress2");
	By landmark = By.id("txtAddAddress3");
	By pinCode = By.id("txtAddPincode");
	By mobile = By.id("txtAddMobile");
	By telReg = By.id("txtregion");
	By telNum = By.id("txtlandline");
	By addressSaveBtn = By.id("btnSaveAddress");
	By addNewAddress = By.id("addNewAddDiv");

	public void clickOnMyAddressBook() throws InterruptedException {
//		driver.findElement(myAddressBook).click();
//		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(myAddressBook)).click();
	}

	public void setUserNameinAddress(String name) throws InterruptedException {
//		driver.findElement(userName).sendKeys(name);
//		Thread.sleep(1000);
		WebElement userNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
		userNameElement.clear();
		userNameElement.sendKeys(name);
	}

	public void setHouseNumber(String houseNumber) throws InterruptedException {
//		driver.findElement(houseNo).sendKeys(houseNumber);
//		Thread.sleep(1000);
		WebElement houseNoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(houseNo));
		houseNoElement.clear();
		houseNoElement.sendKeys(houseNumber);
	}

	public void setAddress(String streetAddress) throws InterruptedException {
//		driver.findElement(address).sendKeys(streetAddress);
//		Thread.sleep(1000);
		WebElement addressElement = wait.until(ExpectedConditions.visibilityOfElementLocated(address));
        addressElement.clear();
        addressElement.sendKeys(streetAddress);
	}

	public void setLandMark(String landMark) throws InterruptedException {
//		driver.findElement(landmark).sendKeys(landMark);
//		Thread.sleep(1000);
		WebElement landmarkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(landmark));
        landmarkElement.clear();
        landmarkElement.sendKeys(landMark);
	}

	public void setPinCode(String pincode) throws InterruptedException {
		driver.findElement(pinCode).sendKeys(pincode);
		Thread.sleep(2000);
	}

	public void setMobileNumber(String mobileNumber) throws InterruptedException {
//		driver.findElement(mobile).sendKeys(mobileNumber);
//		Thread.sleep(1000);
		WebElement mobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(mobile));
        mobileElement.clear();
        mobileElement.sendKeys(mobileNumber);
	}

	public void setTelephoneRegion(String telRegion) throws InterruptedException {
//		driver.findElement(telReg).sendKeys(telRegion);
//		Thread.sleep(100);
		WebElement telRegElement = wait.until(ExpectedConditions.visibilityOfElementLocated(telReg));
        telRegElement.clear();
        telRegElement.sendKeys(telRegion);
	}

	public void setTelNumber(String telNumber) throws InterruptedException {
//		driver.findElement(telNum).sendKeys(telNumber);
//		Thread.sleep(1000);
		WebElement telNumElement = wait.until(ExpectedConditions.visibilityOfElementLocated(telNum));
        telNumElement.clear();
        telNumElement.sendKeys(telNumber);
	}

	public void clickOnAddressSaveBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(addressSaveBtn)).click();
	}

	public void clickOnAddNewAddress() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(addNewAddress).click();
		Thread.sleep(1000);
	}
}
