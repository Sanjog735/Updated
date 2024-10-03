package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.ChildDetailsPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.ContactDetailsPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyProfilePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinition_ContactDetails {

	WebDriver driver;
	LoginPage login;
	MyProfilePage profile;
	ContactDetailsPage contact;
	Logger log;

	@Before
	public void init() {
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		profile = new MyProfilePage(driver);
		contact = new ContactDetailsPage(driver);
		driver.manage().window().maximize();
		log = Logger.getLogger(StepDefinition_ContactDetails.class);
		log.info("Browser launched , maximized and initialized page objects");
	}

	@After
	public void tearDown() {
		driver.quit();
		log.info("Browser closed");
	}

//////////////////////////////////////////////////////////////////
// UPDATE MOBILE NUMBER WITH VALID NUMBER
/////////////////////////////////////////////////////////////////

	@Given("person is on Firstcry website homepage")
	public void person_is_on_Firstcry_website_homepage() {
		driver.get("https://www.firstcry.com");
		log.info("Navigated to FirstCry website");
	}

	@And("person click on login")
	public void person_click_on_login() throws InterruptedException {
		login.clickOnLoginButton();
		log.info("Clicked on Login button");
	}

	@And("person enter registered number")
	public void person_enter_registered_number() throws InterruptedException {
		login.sendMobileNumber();
		log.info("Entered mobile number");
	}

	@And("person click on continue")
	public void person_click_on_continue() throws InterruptedException {
		login.clickOnContinueButton();
		log.info("Clicked on Continue button");
	}

	@And("click on submit for login")
	public void click_on_submit_for_login() throws InterruptedException {
		login.clickOnSubmitButton();
		log.info("Clicked on Submit button");
	}

	@And("person click On myAccount")
	public void person_click_On_myAccount() throws InterruptedException {
		profile.clickOnMyAccount();
		log.info("Click on MyAccount");
	}

	@And("person click on myProfile")
	public void person_click_on_myProfile() throws InterruptedException {
		profile.clickOnMyProfile();
		log.info("Click on My Profile");
	}

	@And("person click on contact details")
	public void person_click_on_contact_details() throws InterruptedException {
		contact.clickOnContactDetails();
		log.info("Click on Contact Details");
	}

	@And("person click on edit icon on contact details")
	public void person_click_on_edit_icon_on_contact_details() throws InterruptedException {
		contact.clickOnMyContactEditIcon();
		log.info("Click on edit icon of contact details");
	}

	@And("^update the (.*)$")
	public void update_the_mobileNumber(String mobileNumber) throws InterruptedException {
		contact.setContactNumber(mobileNumber);
		log.info("Update the mobile number " + mobileNumber);
	}

	@When("click on verify button")
	public void click_on_verify_button() throws InterruptedException {
		contact.clickOnContactVerifyBtn();
		log.info("click on verify button");
	}

	@And("click on submit")
	public void click_on_submit() throws InterruptedException {
		contact.clickOnSubmitOtpBtn();
		log.info("Click on Submit button");
	}

	@Then("contact number updated successfully")
	public void contact_number_updated_successfully() {
		String updatedNumber = driver.findElement(By.xpath(
				"//span[@class='ccode lbl country_code' and normalize-space(text())='+91']/following-sibling::span[@class='lbl' and normalize-space()='8917355469']"))
				.getText();
		Assert.assertTrue(updatedNumber.equals("9547077715"));
		log.info("Mobile number updated successfully " + updatedNumber);
	}

/////////////////////////////////////////////////////////////
// UPDATE MOBILE NUMBER WITH NULL VALUE
/////////////////////////////////////////////////////////////

	@Given("person is on Firstcry website homepage2")
	public void person_is_on_Firstcry_website_homepage2() {
		driver.get("https://www.firstcry.com");
		log.info("Navigated to FirstCry website");
	}

	@And("person click on login2")
	public void person_click_on_login2() throws InterruptedException {
		login.clickOnLoginButton();
		log.info("Person click on login link");
	}

	@And("person enter registered number2")
	public void person_enter_registered_number2() throws InterruptedException {
		login.sendMobileNumber();
		log.info("Person enter mobile number");
	}

	@And("person click on continue2")
	public void person_click_on_continue2() throws InterruptedException {
		login.clickOnContinueButton();
		log.info("Click on continue");
	}

	@And("click on submit for login2")
	public void click_on_submit_for_login2() throws InterruptedException {
		login.clickOnSubmitButton();
		log.info("Person click on submit button");
	}

	@Given("person click On myAccount2")
	public void person_click_on_my_account2() {
		profile.clickOnMyAccount();
		log.info("Click on My Account");
	}

	@And("person click on myProfile2")
	public void person_click_on_myProfile2() {
		profile.clickOnMyProfile();
		log.info("Click on My Profile");
	}

	@And("person click on contact details2")
	public void person_click_on_contact_details2() throws InterruptedException {
		contact.clickOnContactDetails();
		log.info("Click on contact details");
	}

	@And("person click on edit icon on contact details2")
	public void person_click_on_edit_icon_on_contact_details2() throws InterruptedException {
		contact.clickOnMyContactEditIcon();
		log.info("Click on edit icon of contact details");
	}

	@And("remove the number and do not provide number")
	public void remove_the_number_and_do_not_provide_number() throws InterruptedException {
		WebElement number = driver.findElement(By.id("txtAddMobilenew"));
		number.clear();
		log.info("user clear the previous number and do not add new number");

	}

	@When("click on submit2")
	public void click_on_submit2() {
		contact.clickOnSubmitOtpBtn();
		log.info("person click on submit button");
	}

	@Then("contact number not updated")
	public void contact_number_not_updated() {
		String errorMessage = driver.findElement(By.id("MblErrMsg")).getText();
		Assert.assertEquals(errorMessage, "Please enter Mobile No.");
		log.error("Mobile number not updated");
	}

}
