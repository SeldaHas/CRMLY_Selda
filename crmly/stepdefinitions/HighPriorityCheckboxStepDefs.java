package com.crmly.stepdefinitions;

import com.crmly.pages.DashBoardPage;
import com.crmly.pages.LoginPage;
import com.crmly.pages.TasksPage;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class HighPriorityCheckboxStepDefs {

    TasksPage tasksPage = new TasksPage();
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String username = null;
        String password = null;

        if(userType.equals("hr")){
            username = ConfigurationReader.get("hr_username");
            password = ConfigurationReader.get("hr_password");
        }else if(userType.equals("helpdesk")){
            username = ConfigurationReader.get("helpdesk_username");
            password = ConfigurationReader.get("helpdesk_password");
        }else if(userType.equals("marketing")){
            username = ConfigurationReader.get("marketing_username");
            password = ConfigurationReader.get("marketing_password");
        }
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }


    @When("the user click on Tasks")
    public void the_user_click_on_Tasks() {
        DashBoardPage dashBoardPage = new DashBoardPage();
        dashBoardPage.Tasks.click();
    }

    @When("the user click on New Task")
    public void the_user_click_on_New_Task() {
        tasksPage.newTask.click();
    }

    @Then("the user click on the High Priority checkbox")
    public void the_user_click_on_the_High_Priority_checkbox() {

        Driver.get().switchTo().frame(tasksPage.iframe);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
        executor.executeScript("arguments[0].click();", tasksPage.checkbox);

    }

    @Then("Verify the checkbox is selected")
    public void the_checkbox_is_clicked() {

        tasksPage.checkbox.isSelected();
    }
}
