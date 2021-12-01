package com.crmly.stepdefinitions;

import com.crmly.pages.TasksPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DeleteChecklistStepDefs {

    TasksPage tasksPage = new TasksPage();

    @Then("the user click on the checklist")
    public void theUserClickOnTheChecklist() {
        Driver.get().switchTo().frame(tasksPage.iframe);
        tasksPage.checklist.click();
    }

    @And("Verify Things to do is opened")
    public void thingsToDoIsOpened() {
        BrowserUtils.waitForVisibility(tasksPage.thingsToDoBox, 2);
        BrowserUtils.verifyElementDisplayed(tasksPage.thingsToDoBox);
    }
    @And("Click on the checkbox near checklist")
    public void clickOnTheCheckboxNearChecklist() {
        tasksPage.deleteChecklist.click();
    }

    @Then("Verify the checklist item is deleted")
    public void verifyTheChecklistItemIsDeleted() {
        BrowserUtils.waitFor(3);
        Assert.assertFalse(Boolean.parseBoolean("Element should not be visible"+ Driver.get().findElement(By.xpath("//*[contains(text(),'Testcase')]")).isDisplayed()));
    }
}
