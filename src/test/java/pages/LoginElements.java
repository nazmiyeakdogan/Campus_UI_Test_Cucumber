package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LoginElements extends Parent{

    public LoginElements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement loginVerify;

    public WebElement getWebElement(String str){
        switch (str)
        {
            case "username" : return username;
            case "password" : return password;
            case "loginButton" : return loginButton;
            case "loginVerify" : return loginVerify;


        }

        return null;
    }
}
