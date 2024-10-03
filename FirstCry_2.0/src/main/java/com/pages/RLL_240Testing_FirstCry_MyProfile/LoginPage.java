package com.pages.RLL_240Testing_FirstCry_MyProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By LoginButton = By.xpath("//*[text()='Login /']");
	By phoneNumber = By.name("email");
	By continueButton = By.xpath("//*[text()='CONTINUE']");
	By submitButton = By.xpath("//*[text()='SUBMIT']");

	public void clickOnLoginButton() throws InterruptedException {
		driver.findElement(LoginButton).click();
		Thread.sleep(1000);
	}

	public void sendMobileNumber() throws InterruptedException {
		driver.findElement(phoneNumber).sendKeys("8917355469");
		Thread.sleep(1000);
	}

	public void clickOnContinueButton() throws InterruptedException {
		driver.findElement(continueButton).click();
		Thread.sleep(29000);
	}

	public void clickOnSubmitButton() throws InterruptedException {
		driver.findElement(submitButton).click();
		Thread.sleep(500);
	}

}
