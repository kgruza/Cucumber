package com.automation;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        tags = {"@Test"}
   //   glue = {"com.automation.stepDefinitions",}

)

public class Runner {
}
