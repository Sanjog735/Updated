package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyProfilePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinition_MyProfile {

	WebDriver driver;
	MyProfilePage profile;
	LoginPage login;
	Logger log;

	@Before
	public void init() {
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		profile = new MyProfilePage(driver);
		log = Logger.getLogger(StepDefinition_MyProfile.class);
		driver.manage().window().maximize();
		log.info("Browser launched , maximized and initialized page objects");
	}

	@After
	public void tearDown() {
		driver.quit();
		log.info("Browser closed");
	}

//////////////////////////////////////////////////////////////////////////////
// CHECK MY ACCOUNT LINK IS CLICKABLE OR NOT
/////////////////////////////////////////////////////////////////////////////

	@Given("user open the FirstCry website")
	public void user_open_the_FirstCry_website() {
		driver.get("https://www.firstcry.com");
		log.info("Navigated to FirstCry website");
	}

	@When("The user clicks on loginBtn")
	public void the_user_clicks_on_loginBtn() throws InterruptedException {
		login.clickOnLoginButton();
		log.info("Clicked on Login button");
	}

	@And("The user enters his mobile number")
	public void the_user_enters_his_mobile_number() throws InterruptedException {
		login.sendMobileNumber();
		log.info("Entered mobile number");
	}

	@And("click on continue btn")
	public void click_on_continue_btn() throws InterruptedException {
		login.clickOnContinueButton();
		log.info("Clicked on Continue button");
	}

	@And("click on submit btn")
	public void click_on_submit_btn() throws InterruptedException {
		login.clickOnSubmitButton();
		log.info("Clicked on Submit button");
	}

	@When("click On MyAccount link")
	public void click_On_MyAccount_link() {
		profile.clickOnMyAccount();
		log.info("Clicked on MyAccount link");
	}

	@Then("The user is able click on MyAccount")
	public void the_user_is_able_click_on_MyAccount() {
		Assert.assertTrue(driver.getCurrentUrl().contains("cashcoupons"));
		log.info("User is able to click on My Account");
	}

//////////////////////////////////////////////////////////////////////////////
//CHECK MY PROFILE LINK IS CLICKABLE OR NOT
/////////////////////////////////////////////////////////////////////////////

	@Given("user Open the FirstCry website")
	public void user_open_the_firstcry_website() {
		driver.get("https://www.firstcry.com");
		log.info("Navigated to FirstCry website");
	}

	@When("user clicks on loginBtn")
	public void user_clicks_on_loginBtn() throws InterruptedException {
		login.clickOnLoginButton();
		log.info("Clicked on Login button");
	}

	@When("user enters his mobile number")
	public void user_enters_his_mobile_number() throws InterruptedException {
		login.sendMobileNumber();
		log.info("Entered mobile number");
	}

	@When("user click on continue btn")
	public void user_click_on_continue_btn() throws InterruptedException {
		login.clickOnContinueButton();
		log.info("Clicked on Continue button");
	}

	@When("user click on submit btn")
	public void user_click_on_submit_btn() throws InterruptedException {
		login.clickOnSubmitButton();
		log.info("Clicked on Submit button");
	}

	@When("user click On MyAccount link")
	public void user_click_on_myaccount_link() {
		profile.clickOnMyAccount();
		log.info("Clicked on MyAccount link");
	}

	@When("user click on MyProfile")
	public void user_click_on_myprofile() {
		profile.clickOnMyProfile();
		log.info("Clicked on MyProfile");
	}

	@Then("The user is able click on MyProfile")
	public void the_user_is_able_click_on_myprofile() {
		Assert.assertTrue(driver.getCurrentUrl().contains("accountdetails"));
		log.info("User is able to click on My Profile");
	}

//////////////////////////////////////////////////////////////////////////////
// UPDATE USER PROFILE USING VALID INPUTS 
/////////////////////////////////////////////////////////////////////////////

	@Given("user Open the FirstCry website link")
	public void user_open_the_firstcry_website_link() {
		driver.get("https://www.firstcry.com/");
		log.info("Navigated to FirstCry website");
	}

	@When("user clicks on loginbtn")
	public void user_clicks_on_loginbtn() throws InterruptedException {
		login.clickOnLoginButton();
		log.info("Clicked on Login button");
	}

	@When("user enters his mobile Number")
	public void user_enters_his_mobile_Number() throws InterruptedException {
		login.sendMobileNumber();
		log.info("Entered mobile number");
	}

	@When("user click on continue Btn")
	public void user_click_on_continue_Btn() throws InterruptedException {
		login.clickOnContinueButton();
		log.info("Clicked on Continue button");
	}

	@When("user click on submit Btn")
	public void user_click_on_submit_Btn() throws InterruptedException {
		login.clickOnSubmitButton();
		log.info("Clicked on Submit button");
	}

	@When("user click On myAccount link")
	public void user_click_on_myAccount_link() {
		profile.clickOnMyAccount();
		log.info("Clicked on MyAccount link");
	}

	@When("user click on myProfile")
	public void user_click_on_myProfile() {
		profile.clickOnMyProfile();
		log.info("Clicked on MyProfile");
	}

	@When("user click on edit icon of My Profile")
	public void user_click_on_edit_icon_of_my_profile() {
		profile.clickOnProfileEditIcon();
		log.info("Clicked on Edit icon in My Profile");
	}

	@When("^user enters the name (.*)$")
	public void user_enters_the_name(String name) {
		profile.enterName(name);
		log.info("Entered the name: " + name);
	}

	@When("user clicks on radio button")
	public void user_clicks_on_radio_button() {
		profile.clickOnProfileIAm();
		log.info("Clicked on 'I am' radio button");
	}

	@When("user clicks on I am expecting another child checkbox")
	public void user_clicks_on_i_am_expecting_another_child_checkbox() {
		profile.clickOnExpectingChildCheckBox();
		log.info("Clicked on 'I am expecting another child' checkbox");
	}

	@When("user selects a due date")
	public void user_selects_a_due_date() {
		profile.setExpectedChildDate();
		log.info("Selected a due date");
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		profile.clickOnProfileSave();
		log.info("Clicked on Save button");
	}

	@Then("Users profile should be updated")
	public void users_profile_should_be_updated() {
		String text = driver.findElement(By.xpath("//*[text()='Expecting Father']")).getText();
		Assert.assertEquals("Expecting Father", text);
		log.info("User profile is updated successfully");
	}

//////////////////////////////////////////////////////////////////////////////
// UPDATE USER PROFILE USING NULL VALUES 
/////////////////////////////////////////////////////////////////////////////

	@Given("i Open the FirstCry website link")
	public void i_open_the_first_cry_website_link() {
		driver.get("https://www.firstcry.com");
	}

	@When("i clicks on loginbtn")
	public void i_clicks_on_loginbtn() throws InterruptedException {
		login.clickOnLoginButton();
	}

	@And("i enters mobile Number")
	public void i_enters_mobile_number() throws InterruptedException {
		login.sendMobileNumber();
	}

	@And("i click on continue Btn")
	public void i_click_on_continue_btn() throws InterruptedException {
		login.clickOnContinueButton();
	}

	@And("i click on submit Btn")
	public void i_click_on_submit_btn() throws InterruptedException {
		login.clickOnSubmitButton();
	}

	@And("i click On myAccount link")
	public void i_click_on_my_account_link() throws InterruptedException {
		profile.clickOnMyAccount();
	}

	@And("i click on myProfile")
	public void i_click_on_my_profile() throws InterruptedException {
		profile.clickOnMyProfile();
	}

	@And("i click on edit icon of My Profile")
	public void i_click_on_edit_icon_of_my_profile() throws InterruptedException {
		profile.clickOnProfileEditIcon();
	}

	@And("i do not enters the name")
	public void i_do_not_enters_the_name() throws InterruptedException {
		driver.findElement(By.cssSelector("input[id='userFnLName']")).clear();

	}

	@And("i do not clicks on radio button")
	public void i_do_not_clicks_on_radio_button() {

	}

	@And("i do not clicks on checkbox")
	public void i_do_not_clicks_on_checkbox() {

	}

	@And("i do not selects a due date")
	public void i_do_not_selects_a_due_date() {

	}

	@When("i clicks on save button")
	public void i_clicks_on_save_button() throws InterruptedException {
		profile.clickOnProfileSave();
	}

	@Then("the profile  should not be updated")
	public void the_profile_should_not_be_updated() {
		String errorMessage = driver.findElement(By.id("nameErrMsg")).getText();
		Assert.assertTrue(errorMessage.contains("Please Enter Name"));
		log.error("User profile was not updated: " + errorMessage);
	}

}
