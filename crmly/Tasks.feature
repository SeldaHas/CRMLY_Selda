@tasks
Feature: Assign tasks under Quick Navigate Menu
 @REM-850 @wip
  Scenario Outline: the user click on the High Priority checkbox

    Given the user logged in as "<userType>"
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the High Priority checkbox
    And Verify the checkbox is selected

    Examples:
      |userType|
      |hr      |
      |helpdesk|
      |marketing|
@REM-851
  Scenario Outline: User click on Visual Editor and see the editor text bar

    Given the user logged in as "<userType>"
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the Visual Editor
    And Verify textbar is displayed

    Examples:
      |userType|
      |hr      |
      |helpdesk|
      |marketing|
@REM-852
  Scenario Outline: the user can add a checklist item

    Given the user logged in as "<userType>"
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the checklist
    And Write inside the Things to do box
    And Click on the check sign
    Then Verify a checklist item is added

    Examples:
      |userType|
      |hr      |
      |helpdesk|
      |marketing|
@REM-853
  Scenario Outline: the user can add separator lines

    Given the user logged in as "<userType>"
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the checklist
    And  Things to do box is opened
    And Write inside the Things to do box
    Then Click on the check sign
    And Click on the seperator
    Then Verify  the seperator is added

    Examples:
      |userType|
      |hr      |
      |helpdesk|
      |marketing|
@REM-854
  Scenario Outline: The user can delete a checklist item

    Given the user logged in as "<userType>"
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the checklist
    And  Things to do box is opened
    And Write inside the Things to do box
    Then Click on the check sign
    And Click on the checkbox near checklist
    Then Verify the checklist item is deleted

    Examples:
      |userType|
      |hr      |
      |helpdesk|
      |marketing|
@REM-855
  Scenario Outline: The user can add a task

    Given the user logged in as "<userType>"
    When the user click on Tasks
    And the user click on New Task
    Then Click on the title button
    And Write inside the title
    And Click on the Add Task button
    Then Verify Task is added

    Examples:
      |userType|
      |hr      |
      |helpdesk|
      |marketing|