package com.automation.stepDefinitions;

import Functions.ClickFunctions;
import Functions.Tools;
import PageObjects.GeneralPage;
import PageObjects.LoginPage;
import PageObjects.MainPage;
import PageObjects.PersonPage;
import com.automation.Hook;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ClickSteps  {
    LoginPage loginP = new LoginPage();
    ClickFunctions click = new ClickFunctions();
    MainPage mainP = new MainPage();
    PersonPage personP = new PersonPage();
    GeneralPage generalP = new GeneralPage();
Tools tools = new Tools();



    @And("^\"([^\"]*)\": User clicks \"([^\"]*)\"$")
    public void userClicks(Object arg0, String arg1) throws Throwable {
click.clickFieldFromPage(arg0,arg1);

    }
}
