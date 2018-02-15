package com.automation.stepDefinitions;

import Functions.AssertionFunctions;
import Functions.Tools;
import PageObjects.GeneralPage;
import PageObjects.PersonPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;


import java.io.IOException;

public class AssertionSteps {

    AssertionFunctions assertion = new AssertionFunctions();
    GeneralPage generalP = new GeneralPage();
    PersonPage personP = new PersonPage();
    Tools tools = new Tools();



    @Then("^New person should be added$")
    public void newPersonShouldBeAdded() throws Throwable {
        assertion.checkIfMessageIsDisplayedInField(generalP.confirmationMessage,"Dodano osobę!");

    }

    @Then("^Edited Datas should be saved$")
    public void editedDatasShouldBeSaved() throws Throwable {
        assertion.checkIfFieldContainsValue(personP.personDetailsSurname, tools.findXlsCellValueByAttribute("EditData"));
    }
}
