package com.crmly.stepdefinitions;

import com.crmly.pages.TasksPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddChecklistStepDefs {

    TasksPage tasksPage = new TasksPage();

    @And("Things to do box is opened")
    public void thingsToDoBoxIsOpened() {
        tasksPage.thingsToDoBox.isDisplayed();
    }

    @And("Write inside the Things to do box")
    public void writeInsideTheThingsToDoBox() {
        tasksPage.thingsToDoBox.sendKeys("Testcase");
    }

    @Then("Click on the check sign")
    public void clickOnTheCheckSign() {
        tasksPage.checkSign.click();
    }


    @Then("Verify a checklist item is added")
    public void verifyAChecklistItemIsAdded() {
        tasksPage.checklistitem.isDisplayed();
    }
}