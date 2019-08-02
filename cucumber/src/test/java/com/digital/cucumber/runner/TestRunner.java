package com.digital.cucumber.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;


@CucumberOptions(
features={"src/test/resources/features/"}
,glue={"src//test//java//com.digital.cucumber.stepDefinition"}
,plugin = {"pretty", "html:target/cucumber"}
)


@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
