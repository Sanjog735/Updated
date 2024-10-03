package com.pages.RLL_240Testing_FirstCry_MyProfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildDetailsPage {

	WebDriver driver;
	WebDriverWait wait;

	public ChildDetailsPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Child Details
	By childDetails = By.xpath("(//*[text()='Child Details'])[1]");
	By childname = By.id("childFnLName");
	By childDate = By.id("EditChildDOB");
	By childPreviousArrowOfDateButton = By.xpath("//*[@class='prev-arrow']");
	By childDate19July = By.xpath("//div[text()='12']");
	By childGender = By.id("childGenderBoy");
	By childWeight = By.id("weight");
	By childHeight = By.id("height");
	By childSaveBtn = By.id("saveChild");

	By addChild = By.id("ch_defalut");

	public void clickOnChildDetails() throws InterruptedException {
		driver.findElement(childDetails).click();
		Thread.sleep(1000);
	}

	public void setChildName(String childName) throws InterruptedException {
		driver.findElement(childname).sendKeys(childName);
		Thread.sleep(500);
	}

	public void selectChildDate() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='sprite-ac sp_cal'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[text()='1'])[1]")).click();
		Thread.sleep(1000);
	}

	public void clickOnChildGender() throws InterruptedException {
		driver.findElement(childGender).click();
		Thread.sleep(1000);
	}

	public void setChildWeight(String weight)  {
		WebElement weightElement = wait.until(ExpectedConditions.visibilityOfElementLocated(childWeight));
        weightElement.clear();  
        weightElement.sendKeys(weight);
	}

	public void setChildHeight(String height)  {
		WebElement heightElement = wait.until(ExpectedConditions.visibilityOfElementLocated(childHeight));
        heightElement.clear();  
        heightElement.sendKeys(height);
	}

	public void clickOnChildSaveBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(childSaveBtn)).click();
	}

	public void clickOnAddAnotherChild() {
		wait.until(ExpectedConditions.elementToBeClickable(addChild)).click();
	}

}
