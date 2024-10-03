package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Login {
	WebDriver driver;
	LoginPage login;
	Logger log;
	
	@Before
	public void init() {
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		log = Logger.getLogger(StepDefinition_Login.class);
		driver.manage().window().maximize();
		log.info("Browser launched , maximized and initialized page objects");
	}
	@After
	public void tearDown() {
		driver.quit();
		log.info("Browser close");
	}

	@Given("The user is in the firstcry home page")
	public void the_user_is_in_the_firstcry_home_page() {
		driver.get("https://www.firstcry.com/");
		log.info("Navigating to FirstCry homepage");
	}

	@When("The user clicks on login")
	public void the_user_clicks_on_login() throws InterruptedException {
		login.clickOnLoginButton();
		log.info("Clicking on login button");
	}

	@And("The user enters the mobile number")
	public void the_user_enters_the_mobile_number() throws InterruptedException {
		login.sendMobileNumber();
		log.info("Entering mobile number");
	}

	@Then("click on continue")
	public void click_on_continue() throws InterruptedException {
		login.clickOnContinueButton();
		log.info("Clicking on continue button");
	}

	@And("The user provides otp")
	public void the_user_provides_otp() {
		System.out.println("OTP");
		log.info("User provide otp");
	}

	@And("click on submit btn for login")
	public void click_on_submit_btn_for_login() throws InterruptedException {
		login.clickOnSubmitButton();
		log.info("Clicking on submit button");
	}

	@Then("The user must able to login")
	public void the_user_must_able_to_login() {
		Assert.assertTrue(driver.getPageSource().contains("My Account"));
		log.info("Login successful");
	}
}
