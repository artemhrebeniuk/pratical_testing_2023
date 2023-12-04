package hw_seventh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static hw_fifth.XPath.addNewEmployye.*;
import static hw_fifth.XPath.addNewEmployye.SAVE_BUTTON;

public class AddNewEmployeePage {
    WebDriver driver;
    public AddNewEmployeePage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = FIRST_NAME_FIELD)
    private WebElement fistNameField;
    @FindBy(xpath = SECOND_NAME_FIELD)
    private WebElement secondNameField;
    @FindBy(xpath = THIRD_NAME_FIELD)
    private WebElement thirdNameField;
    @FindBy(xpath = SAVE_BUTTON)
    private WebElement saveButton;

    public AddNewEmployeePage typeFirstName(String firstName){
        fistNameField.click();
        fistNameField.sendKeys(firstName);
        return this;
    }

    public AddNewEmployeePage typeMiddleName(String middleName){
        secondNameField.click();
        secondNameField.sendKeys(middleName);
        return this;
    }

    public AddNewEmployeePage typeLastName(String lastName){
        thirdNameField.click();
        thirdNameField.sendKeys(lastName);
        return this;
    }

    public PIMPage submit(){
        saveButton.click();
        return new PIMPage(driver);
    }
}
