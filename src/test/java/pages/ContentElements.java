package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BaseDriver;

public class ContentElements extends Parent{
    public ContentElements() {

        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='iban']/input")
    public WebElement ibanInput;

    @FindBy(xpath = "(//mat-select[@role='combobox']//span[text()='Currency'])[2]")
    public WebElement currency;

    @FindBy(xpath = "//span[text()=' EUR ']")
    public WebElement EURInput;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Bank Account successfully created']")
    public WebElement successMessage;

    @FindBy(xpath="//div[contains(text(),'exists')]")
    public WebElement alreadyExists;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    public WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

//    @FindBy(xpath = "//td[contains(text(),'AzbC100223')]//following::div/ms-edit-button")
    @FindBy(css = "svg[data-icon='pen-to-square']")
    public WebElement editButton;

    @FindBy(css = "dynamic-view[class='ng-star-inserted']")
    public WebElement editMessage;

    public WebElement getWebElement(String str){
        switch (str)
        {
            case "addButton" : return addButton;
            case "nameInput" : return nameInput;
            case "ibanInput" : return ibanInput;
            case "currency" : return currency;
            case "EURInput" : return EURInput;
            case "saveButton" : return saveButton;
            case "successMessage" : return successMessage;
            case "alreadyExists" : return alreadyExists;
            case "searchNameInput" : return searchNameInput;
            case "searchButton" : return searchButton;
            case "editButton" : return editButton;
            case "editMessage" : return editMessage;
        }

        return null;
    }


}
