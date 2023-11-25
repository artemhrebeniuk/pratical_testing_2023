package hw_fifth;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import static hw_fifth.XPath.addNewEmployye.*;

public class Main {
    @FindBy(xpath = PIM)
    private static String pimElement;
    @FindBy(xpath = ADD_BUTTON)
    private static String addButton;
    @FindBy(xpath = FIRST_NAME_FIELD)
    private static String fistName;
    @FindBy(xpath = SECOND_NAME_FIELD)
    private static String secondName;
    @FindBy(xpath = THIRD_NAME_FIELD)
    private static String thirdName;
    @FindBy(xpath = SAVE_BUTTON)
    private static String saveButton;

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.xpath(pimElement)).click();
        driver.findElement(By.xpath(addButton)).click();
        driver.findElement(By.xpath(fistName)).click();
        driver.findElement(By.xpath(fistName)).sendKeys("John");
        driver.findElement(By.xpath(secondName)).click();
        driver.findElement(By.xpath(secondName)).sendKeys("Adam");
        driver.findElement(By.xpath(thirdName)).click();
        driver.findElement(By.xpath(thirdName)).sendKeys("Smith");
        driver.findElement(By.xpath(saveButton)).click();
        driver.quit();

    }
}
