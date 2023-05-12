package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.ContentElements;
import pages.DashboardElements;

import java.util.List;

public class BankAccountsSteps {

    ContentElements ce = new ContentElements();
    DashboardElements de = new DashboardElements();
    @And("Click on the element in DashboardElements")
    public void clickOnTheElementInDashboardElements(DataTable dt) {

        List<String> list = dt.asList(String.class);

        for (String i : list ){
            WebElement element = de.getWebElement(i);
            de.clickFunction(element);
        }
    }

    @And("Enter new account information")
    public void enterNewAccountInformation(DataTable dt) {

        List<List<String>> list = dt.asLists(String.class);

        for (int i = 0; i < list.size(); i++) {
            WebElement element = ce.getWebElement(list.get(i).get(0));
            ce.sendKeysFunction(element, list.get(i).get(1));
        }
    }


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        ce.verifyContainsTextFunction(ce.getWebElement("successMessage"), "successfully" );
    }

    @Then("Already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {

        ce.verifyContainsTextFunction(ce.getWebElement("alreadyExists"), "already" );

    }

    @When("Admin user searches for registered bank account")
    public void adminUserSearchesForRegisteredBankAccount(DataTable dt) {
        List<List<String>> list = dt.asLists(String.class);

        for (int i = 0; i < list.size(); i++) {
            WebElement element = ce.getWebElement(list.get(i).get(0));
            ce.sendKeysFunction(element, list.get(i).get(1));
        }
    }

    @And("Click on the button")
    public void clickOnTheButton(DataTable dt) {

        List<String> list = dt.asList(String.class);

        for (String i : list ){
            WebElement element = ce.getWebElement(i);
            ce.waitUntilClickable(ce.getWebElement("searchButton"));
            ce.clickFunction(element);
        }
    }


    @Then("Success edit message should be displayed")
    public void successEditMessageShouldBeDisplayed() {
        ce.verifyContainsTextFunction(ce.getWebElement("editMessage"), "success");
    }
}
