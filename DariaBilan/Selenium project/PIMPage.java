package hw_seventh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static hw_fifth.XPath.addNewEmployye.ADD_BUTTON;

public class PIMPage {
    WebDriver driver;
    public PIMPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = ADD_BUTTON)
    private WebElement addButton;
    public AddNewEmployeePage clickAddButton(){
        addButton.click();
        return new AddNewEmployeePage(driver);
    }
}
