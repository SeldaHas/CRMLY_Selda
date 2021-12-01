package com.crmly.stepdefinitions;

import com.crmly.pages.TasksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddSeperatorStepDefs {

    TasksPage tasksPage = new TasksPage();

    @And("Click on the seperator")
    public void clickOnTheSeperator() {
        tasksPage.separator.click();
    }

    @Then("Verify  the seperator is added")
    public void verifyTheSeperatorIsAdded() {
        tasksPage.separatorline.isDisplayed();
    }
}