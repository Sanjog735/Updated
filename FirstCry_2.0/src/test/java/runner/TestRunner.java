package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src\\test\\resource\\com\\features\\MyProfile\\ContactDetails.feature", 
glue = {"com.stepdefinition.RLL_240Testing_FirstCry_MyProfile"},
monochrome = true,
plugin = {"pretty","html:report/HTML-Report.html"}
,tags="@UpdateMobileNumberWithNullValue"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
