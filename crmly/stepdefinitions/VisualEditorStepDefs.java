package com.crmly.stepdefinitions;

import com.crmly.pages.DashBoardPage;
import com.crmly.pages.LoginPage;
import com.crmly.pages.TasksPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

public class VisualEditorStepDefs {

    TasksPage tasksPage = new TasksPage();
    @Then("the user click on the Visual Editor")
    public void theUserClickOnTheVisualEditor() {
        Driver.get().switchTo().frame(tasksPage.iframe);
        tasksPage.visualEditor.click();
    }

    @And("Verify textbar is displayed")
    public void textbarDisplay() {
        tasksPage.textbar.isDisplayed();
    }



}

