package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class DashboardElements extends Parent {

    public DashboardElements(){
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    public WebElement bankAccount;


    public WebElement getWebElement(String str){
        switch (str)
        {
            case "setup" : return setup;
            case "parameters" : return parameters;
            case "bankAccount" : return bankAccount;
//            case "loginVerify" : return loginVerify;
        }

        return null;
    }
}
