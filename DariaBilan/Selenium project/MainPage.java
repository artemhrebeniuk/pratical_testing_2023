package hw_seventh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static hw_seventh.XPath.addNewEmployye.PIM;

public class MainPage {
    WebDriver driver;
    public MainPage(WebDriver webDriver){
        this.driver = webDriver;
    }
    @FindBy(xpath = PIM)
    private WebElement pimElement;
    public PIMPage clickAddButton(){
        pimElement.click();
        return new PIMPage(driver);
    }
}
