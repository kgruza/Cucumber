package com.automation.stepDefinitions;

import Functions.BrowserFunctions;
import cucumber.api.java.en.Given;

public class BrowserSteps {
    BrowserFunctions browserF = new BrowserFunctions();
    @Given("^Simba website is open$")
    public void simbaWebsiteIsOpen() throws Throwable {
     browserF.getUrl("http://172.17.0.193:8081/zaloguj");
    }
}
