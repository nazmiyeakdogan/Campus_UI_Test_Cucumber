package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginElements;
import utilities.BaseDriver;

public class LoginSteps {

    LoginElements le = new LoginElements();
    @Given("Navigate to Campus")
    public void navigateToCampus() {

        BaseDriver.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter username and password and click button")
    public void enterUsernameAndPasswordAndClickButton() {
        le.sendKeysFunction(le.getWebElement("username"), "turkeyts");
        le.sendKeysFunction(le.getWebElement("password"), "TechnoStudy123");
        le.clickFunction(le.getWebElement("loginButton"));
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        le.verifyContainsTextFunction(le.getWebElement("loginVerify"), "Techno Study");
    }
}
