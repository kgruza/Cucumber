package com.automation.stepDefinitions;

import Functions.InputFunctions;
import Functions.Tools;
import PageObjects.PersonPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class InputSteps {
     InputFunctions input = new InputFunctions();
     PersonPage personP = new PersonPage();
     Tools tools = new Tools();

    @When("^User logs as a CONSULTANT$")
    public void userLogsAsAConsultant() throws InterruptedException {
    input.logAs("CONSULTANT");
    }

    @When("^User fills the required form fields$")
    public void user_fills_the_required_form_fields() throws Throwable {
        input.sendInputIntoField(personP.formPersonName, tools.findXlsCellValueByAttribute("Name"));
        input.sendInputIntoField(personP.formPersonSurname, tools.findXlsCellValueByAttribute("Surname"));
        input.sendInputIntoField(personP.formTelephone1, tools.findXlsCellValueByAttribute("Telephone1"));
        input.selectFirstFromDropdown(personP.formPersonChannel);
    }


    @And("^User edits a last name field$")
    public void userEditsALastNameField() throws Throwable {
    input.editField(personP.formPersonSurname);
    }


}
