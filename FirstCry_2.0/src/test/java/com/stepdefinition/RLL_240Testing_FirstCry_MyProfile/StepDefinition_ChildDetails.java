package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.ChildDetailsPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyProfilePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinition_ChildDetails {
	
	WebDriver driver;
    LoginPage login;
    MyProfilePage profile;
    ChildDetailsPage child;
    Logger log;
    
    @Before
    public void init() {
        driver = new ChromeDriver();
        login = new LoginPage(driver);
        profile = new MyProfilePage(driver);
        child = new ChildDetailsPage(driver);
        log = Logger.getLogger(StepDefinition_ChildDetails.class);
        driver.manage().window().maximize();
		log.info("Browser launched , maximized and initialized page objects");
    }
    @After
    public void tearDown() {
		driver.quit();
		log.info("Browser closed after test.");
	}
    
//////////////////////////////////////////////////////////////////////////////
// UPDATE CHILD DETAILS WITH VALID VALUES
/////////////////////////////////////////////////////////////////////////////
    
    @Given("The user is in the firstcry home page1")
    public void the_user_is_in_the_firstcry_home_page1() {
        driver.get("https://www.firstcry.com/");
        log.info("Navigated to FirstCry home page.");
    }

    @When("The user clicks on login1")
    public void the_user_clicks_on_login1() throws InterruptedException {
        login.clickOnLoginButton();
        log.info("Clicked on login button.");
    }

    @And("The user enter the mobile num")
    public void the_user_enter_the_mobile_num() throws InterruptedException {
        login.sendMobileNumber();
        log.info("Entered mobile number.");
    }

    @Then("click on continue1")
    public void click_on_continue1() throws InterruptedException {
        login.clickOnContinueButton();
        log.info("Clicked on continue button.");
    }

    @And("click on submit link1")
    public void click_on_submit_link1() throws InterruptedException {
        login.clickOnSubmitButton();
        log.info("Clicked on submit button.");
    }

    @Then("click on My Account1")
    public void click_on_My_Account1() throws InterruptedException {
        profile.clickOnMyAccount();
        log.info("Clicked on My Account.");
    }

    @And("click on My Profile1")
    public void click_on_My_Profile1() throws InterruptedException {
        profile.clickOnMyProfile();
        log.info("Clicked on My Profile.");
    }

    @And("click on child details1")
    public void click_on_child_details1() throws InterruptedException {
        child.clickOnChildDetails();
        log.info("Clicked on Child Details.");
    }
    
    @Then("^enter the childs name as (.*)$")
    public void enter_the_childs_name_as_childName(String childName) throws InterruptedException {
        child.setChildName(childName);
        log.info("Entered child's name: " + childName);
    }


    @And("enter date of birth1")
    public void enter_date_of_birth1() throws InterruptedException {
        child.selectChildDate();
        log.info("Entered date of birth.");
    }

    @And("select a gender")
    public void select_a_gender() throws InterruptedException {
        child.clickOnChildGender();
        log.info("Selected gender.");
    }

    @And("^enter the child (.*) and child (.*)$")
    public void enter_and_child_weight_and_child_height(String weight, String height) throws InterruptedException{
        child.setChildWeight(weight);
        child.setChildHeight(height);
        log.info("Entered child weight: " + weight + " and height: " + height);
    }

    @When("click on save button")
    public void click_on_save_button() throws InterruptedException {
        child.clickOnChildSaveBtn();
        log.info("Clicked on Save button.");
    }

    @Then("child details successfully saved")
    public void child_details_successfully_saved() {
    	Assert.assertTrue(true);
    	String expectedName = driver.findElement(By.xpath("//span[@class='lbl CUNamelbl frm4']")).getText();
    	Assert.assertTrue(expectedName.contains("Mili"));
        log.info("Child details saved successfully. Expected child name found: " + expectedName);
    }
    
//////////////////////////////////////////////////////////////////////////
// UPDATE CHILD DETAILS WITH NULL VALUE
//////////////////////////////////////////////////////////////////////////   
    
    @Given("The user is in the firstcry home page2")
    public void the_user_is_in_the_firstcry_home_page2() {
    	driver.get("https://www.firstcry.com/");
        log.info("Navigated to FirstCry home page.");
        
    }
    @When("The user clicks on login2")
    public void the_user_clicks_on_login2() throws InterruptedException {
    	login.clickOnLoginButton();
        log.info("Clicked on login button.");
    }
    @And("The user enter the mobile num2")
    public void the_user_enter_the_mobile_num2() throws InterruptedException {
        login.sendMobileNumber();
        log.info("Entered mobile number.");
    }
    @Then("click on continue2")
    public void click_on_continue2() throws InterruptedException {
        login.clickOnContinueButton();
        log.info("Clicked on continue button.");
    }
    @And("click on submit link2")
    public void click_on_submit_link2() throws InterruptedException {
        login.clickOnSubmitButton();
        log.info("Clicked on submit button.");
    }
    @Then("click on My Account2")
    public void click_on_my_account2() throws InterruptedException {
        profile.clickOnMyAccount();
        log.info("Clicked on My Account.");
    }
    @And("click on My Profile2")
    public void click_on_my_profile2() throws InterruptedException {
        profile.clickOnMyProfile();
        log.info("Clicked on My Profile.");
    }
    @And("click on child details2")
    public void click_on_child_details2() throws InterruptedException {
        child.clickOnChildDetails();
        log.info("Clicked on Child Details.");
    }
    @And ("click on add another child")
    public void click_on_add_another_child() throws InterruptedException {
    	child.clickOnAddAnotherChild();
        log.info("Clicked on 'Add Another Child'.");
    }
    @And("do not enter the childs2")
    public void do_not_enter_the_childs2() {
    	
        
    }
    @And("do not enter date of birth2")
    public void do_not_enter_date_of_birth2() {
        
    }
    @And("do not select a gender2")
    public void do_not_select_a_gender2() {
        
    }
    @And("do not enter the child weight and child height")
    public void do_not_enter_the_child_weight_and_child_height() {
        
    }
    @When("click on save button2")
    public void click_on_save_button2() throws InterruptedException {
        child.clickOnChildSaveBtn();
        log.info("Clicked on Save button without filling all fields.");
    }
    @Then("child details can not saved")
    public void child_details_can_not_saved() {
        String error = driver.findElement(By.xpath("//span[@id='childnmErrMsg']")).getText();
        Assert.assertEquals("Please Enter Child Name",error);
        log.error("Child details not saved. Error: " + error);
    }

}
