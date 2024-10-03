package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyAddressBookPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyProfilePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_AddressDetails {

	WebDriver driver;
	LoginPage login;
	MyProfilePage profile;
	MyAddressBookPage address;
	Logger log;

	@Before
	public void init() {
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		profile = new MyProfilePage(driver);
		address = new MyAddressBookPage(driver);
		log = Logger.getLogger(StepDefinition_AddressDetails.class);
		driver.manage().window().maximize();
		log.info("Browser launched , maximized , initialized page objects and initialized test object");
	}
	@After
	public void tearDown() {
		driver.quit();
		log.info("Browser closed");
	}
	
//////////////////////////////////////////////////////////////////////////////
// UPDATE ADDRESS DETAILS USING VALID INPUTS 
/////////////////////////////////////////////////////////////////////////////

	@Given("The user is in the firstcry home page3")
	public void the_user_is_in_the_firstcry_home_page3() {
		driver.get("https://www.firstcry.com/");
		log.info("Navigating to FirstCry homepage");
	}

	@When("The user clicks on login3")
	public void the_user_clicks_on_login3() throws InterruptedException {
		login.clickOnLoginButton();
		log.info("Clicking on login button");
	}

	@And("The user enter the mobile num3")
	public void the_user_enter_the_mobile_num3() throws InterruptedException {
		login.sendMobileNumber();
		log.info("Entering mobile number");
	}

	@Then("click on continue3")
	public void click_on_continue3() throws InterruptedException {
		login.clickOnContinueButton();
		log.info("Clicking on continue button");
	}

	@And("click on submit link3")
	public void click_on_submit_link3() throws InterruptedException {
		login.clickOnSubmitButton();
		log.info("Clicking on submit button");
	}

	@Then("click on My Account3")
	public void click_on_My_Account3() throws InterruptedException {
		profile.clickOnMyAccount();
		log.info("Clicking on My Account");
	}

	@And("click on My Profile3")
	public void click_on_My_Profile3() throws InterruptedException {
		profile.clickOnMyProfile();
		log.info("Clicking on My Profile");
	}

	@Then("click on my address book")
	public void click_on_my_address_book() throws InterruptedException {
		address.clickOnMyAddressBook();
		log.info("Navigating to My Address Book");
	}

	@And("^user enter (.*) in address field$")
	public void user_enter_name_in_address_field(String name) throws InterruptedException {
		address.setUserNameinAddress(name);
		log.info("Entering name: " + name);
	}

	@And("^user enter (.*) in house number$")
	public void user_enter_houseNumber(String houseNumber) throws InterruptedException {
		address.setHouseNumber(houseNumber);
		log.info("Entering house number: " + houseNumber);
	}

	@And("^user enter (.*) in street address$")
	public void user_enter_streetAddress(String streetAddress) throws InterruptedException {
		address.setAddress(streetAddress);
		log.info("Entering street address: " + streetAddress);
	}

	@And("^user enter (.*) in landmark$")
	public void user_enter_landmark(String landMark) throws InterruptedException {
		address.setLandMark(landMark);
		log.info("Entering landmark: " + landMark);
	}

	@And("^user enter (.*) in pincode$")
	public void user_enter_pincode(String pincode) throws InterruptedException {
		address.setPinCode(pincode);
		log.info("Entering pincode: " + pincode);
	}

	@And("^user enter (.*) in mobile number$")
	public void user_enter_mobileNumber(String mobileNumber) throws InterruptedException {
		address.setMobileNumber(mobileNumber);
		log.info("Entering mobileNumber: " + mobileNumber);
	}

	@And("^user enter (.*) in telephone region$")
	public void user_enter_telephone_region_of_telephone(String telRegion) throws InterruptedException {
		address.setTelephoneRegion(telRegion);
		log.info("Entering Telephone Region: " + telRegion);
	}

	@And("^user enter (.*) in telephone number$")
	public void user_enter_telephoneNumber(String telNumber) throws InterruptedException {
		address.setTelNumber(telNumber);
		log.info("Entering Telephone Number: " + telNumber);
	}

	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		address.clickOnAddressSaveBtn();
		log.info("Clicking on save button");
	}

	@Then("users address  details successfully saved")
	public void users_address_details_successfully_saved() {
		String updatedAddress = driver.findElement(By.xpath("//span[@id='Address1_32862497']")).getText();
		Assert.assertTrue(updatedAddress.equalsIgnoreCase("PK458 ,Kharadi , Pune , Maharastra"));
		log.info("Address details saved successfully" + updatedAddress);
	}

///////////////////////////////////////////////////////////////////////////////////////
// UPDATE ADDRESS DETAILS WITH  INVALID INPUT
//////////////////////////////////////////////////////////////////////////////////////

	@Given("The user is in the firstcry home page4")
	public void the_user_is_in_the_firstcry_home_page4() {
		driver.get("https://www.firstcry.com/");
		log.info("Navigated to FirstCry homepage.");
	}

	@When("The user clicks on login4")
	public void the_user_clicks_on_login4() throws InterruptedException {
		login.clickOnLoginButton();
		log.info("Clicking on login button ");
	}

	@And("The user enter the mobile num4")
	public void the_user_enter_the_mobile_num4() throws InterruptedException {
		login.sendMobileNumber();
		log.info("User entered the mobile number.");
	}

	@Then("click on continue4")
	public void click_on_continue4() throws InterruptedException {
		login.clickOnContinueButton();
		log.info("User clicked on the contunue button");
	}

	@And("click on submit link4")
	public void click_on_submit_link4() throws InterruptedException {
		login.clickOnSubmitButton();
        log.info("User clicked on the submit link to verify login.");
	}

	@Then("click on My Account4")
	public void click_on_My_Account4() throws InterruptedException {
		profile.clickOnMyAccount();
        log.info("User clicked on 'My Account'.");
	}

	@And("click on My Profile4")
	public void click_on_My_Profile4() throws InterruptedException {
		profile.clickOnMyProfile();
        log.info("User clicked on 'My Profile'.");
	}

	@Then("click on my address book4")
	public void click_on_my_address_book4() throws InterruptedException {
		address.clickOnMyAddressBook();
        log.info("User clicked on 'My Address Book'.");
	}

	@Then("click on add new address")
	public void click_on_add_new_address() throws InterruptedException {
		address.clickOnAddNewAddress();
        log.info("User clicked on 'Add New Address' to start adding a new address.");
	}

	@And("^user enter (.*) in address field4$")
	public void user_enter_name_in_address_field4(String name) throws InterruptedException {
		address.setUserNameinAddress(name);
        log.info("User entered their name " + name);
	}

	@And("^user enter (.*) in house number4$")
	public void user_enter_houseNumber4(String houseNumber) throws InterruptedException {
		address.setHouseNumber(houseNumber);
        log.info("User entered house number " +  houseNumber);
	}

	@And("^user enter (.*) in street address4$")
	public void user_enter_streetAddress4(String streetAddress) throws InterruptedException {
		address.setAddress(streetAddress);
		log.info("User entered street address " +  streetAddress);
	}

	@And("^user enter (.*) in landmark4$")
	public void user_enter_landmark4(String landMark) throws InterruptedException {
		address.setLandMark(landMark);
		log.info("User entered landmark " +  landMark);
	}

	@And("^user enter (.*) in pincode4$")
	public void user_enter_pincode4(String pincode) throws InterruptedException {
		address.setPinCode(pincode);
		log.info("User entered pincode " +  pincode);
	}

	@And("^user enter (.*) in mobile number4$")
	public void user_enter_mobileNumber4(String mobileNumber) throws InterruptedException {
		address.setMobileNumber(mobileNumber);
		log.info("User entered mobile number " +  mobileNumber);
	}

	@And("^user enter (.*) in telephone region4$")
	public void user_enter_telephone_region_of_telephone4(String telRegion) throws InterruptedException {
		address.setTelephoneRegion(telRegion);
		log.info("User entered telephone region " +  telRegion);
	}

	@And("^user enter (.*) in telephone number4$")
	public void user_enter_telephoneNumber4(String telNumber) throws InterruptedException {
		address.setTelNumber(telNumber);
		log.info("User entered telephone number " +  telNumber);
	}

	@When("user click on save button4")
	public void user_click_on_save_button4() throws InterruptedException {
		address.clickOnAddressSaveBtn();
		log.info("Clicking on save button");
	}

	@Then("users address  details not added")
	public void users_address_details_not_added() {
		String errorMessage = driver
				.findElement(By.xpath(
						"//span[text()='Address details insufficient to attempt delivery. Please add more details.']"))
				.getText();
		Assert.assertTrue(
				errorMessage.contains("Address details insufficient to attempt delivery. Please add more details."));
		log.error("Address details not added and got a erroe message" + errorMessage);

	}

//////////////////////////////////////////////////////////////////////////////////
// UPDATE ADDRESS DETAILS USING NULL VALUES
///////////////////////////////////////////////////////////////////////////////////
	
	@Given("The user is in the firstcry home page5")
	public void the_user_is_in_the_firstcry_home_page5() {
		driver.get("https://www.firstcry.com/");
		log.info("Navigated to FirstCry homepage");
	}

	@When("The user clicks on login5")
	public void the_user_clicks_on_login5() throws InterruptedException {
		login.clickOnLoginButton();
		log.info("Clicking on login button");
	}

	@And("The user enter the mobile num5")
	public void the_user_enter_the_mobile_num5() throws InterruptedException {
		login.sendMobileNumber();
		log.info("User enter their registerred mobile number");
	}

	@Then("click on continue5")
	public void click_on_continue5() throws InterruptedException {
		login.clickOnContinueButton();
		log.info("Clicking on continue button");
	}

	@And("click on submit link5")
	public void click_on_submit_link5() throws InterruptedException {
		login.clickOnSubmitButton();
		log.info("Clicking on submit button for login");
	}

	@Then("click on My Account5")
	public void click_on_My_Account5() throws InterruptedException {
		profile.clickOnMyAccount();
		log.info("Clicking on my account");
	}

	@And("click on My Profile5")
	public void click_on_My_Profile5() throws InterruptedException {
		profile.clickOnMyProfile();
		log.info("Clicking on my profile");
	}

	@Then("click on my address book5")
	public void click_on_my_address_book5() throws InterruptedException {
		address.clickOnMyAddressBook();
		log.info("Clicking on my address link");
	}

	@Then("click on add new address5")
	public void click_on_add_new_address5() throws InterruptedException {
		address.clickOnAddNewAddress();
		log.info("Clicking on add new address");
	}

	@And("user do not  enter name in address field5")
	public void user_do_not_enter_name_in_address_field5()  {

	}

	@And("user do not  enter houseNumber in house number5")
	public void user_do_not_enter_houseNumber_in_house_number5() {

	}

	@And("user do not  enter streetAddress in street address5")
	public void user_do_not_enter_streetAddress_in_street_address5() {

	}

	@And("user do not enter landMark in landmark5")
	public void user_do_not_enter_landMark_in_landmark5()  {

	}

	@And("user do not enter pincode in pincode5")
	public void user_do_not_enter_pincode_in_pincode5()  {
	}

	@And("user do not enter mobileNumber in mobile number5")
	public void user_do_not_enter_mobileNumber_in_mobile_number5() {

	}

	@And("user do not  enter telRegion in telephone region5")
	public void user_do_not_enter_telRegion_in_telephone_region5()  {

	}

	@And("user do not  enter telNumber in telephone number5")
	public void user_do_not_enter_telNumber_in_telephone_number5()  {

	}

	@When("user click on save button5")
	public void user_click_on_save_button5()  {
		address.clickOnAddressSaveBtn();
        log.info("Clicked on Save button without filling all fields.");
	}

	@Then("users address  details not added5")
	public void users_address_details_not_added5() {
		String errorMessage = driver.findElement(By.xpath("//span[text()='Please enter Flat/House No./Building']"))
				.getText();
		Assert.assertTrue(errorMessage.contains("Please enter Flat/House No./Building"));
        log.error("Address details not saved. Error: " + errorMessage);

	}

}
