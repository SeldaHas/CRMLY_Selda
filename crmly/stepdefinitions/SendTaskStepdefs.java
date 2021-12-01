package com.crmly.stepdefinitions;

import com.crmly.pages.TasksPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SendTaskStepdefs {
    TasksPage tasksPage = new TasksPage();

    @Then("Click on the title button")
    public void clickOnTheTitleButton() {
        Driver.get().switchTo().frame(tasksPage.iframe);
        tasksPage.title.click();
    }

    @And("Write inside the title")
    public void writeInsideTheTitle() {
        tasksPage.title.sendKeys("Jenkins");
    }

    @Then("Click on the content edit area")
    public void clickOnTheContentEditArea() {

        tasksPage.content.click();
    }

    @And("Write inside the content edit area")
    public void writeInsideTheContentEditArea() {

        tasksPage.content.sendKeys("Pass");
    }

    @And("Click on the Add Task button")
    public void clickOnTheAddTaskButton() {
        tasksPage.sendtask.click();
    }
    @Then("Verify Task is added")
    public void verifyTaskIsAdded() {
        tasksPage.AddedTask.isDisplayed();
    }
}
