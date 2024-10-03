package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resource\\com\\features\\MyProfile\\ChildDetails.feature",
glue = {"com.stepdefinition.RLL_240Testing_FirstCry_MyProfile"},
monochrome = true)
public class MyProfileRunner {

}
