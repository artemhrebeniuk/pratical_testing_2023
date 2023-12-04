package hw_seventh;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static hw_fifth.XPath.addNewEmployye.*;

public class Main {
    static WebDriver driver;

    public static void main(String[] args) {
        try {
//            System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Testing\\Java_test\\DariaBilan\\java_testing\\src\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
            mainPage.clickAddButton();
            PIMPage pimPage = PageFactory.initElements(driver, PIMPage.class);
            pimPage.clickAddButton();
            AddNewEmployeePage addNewEmployeePage = PageFactory.initElements(driver, AddNewEmployeePage.class);
            addNewEmployeePage.typeFirstName("John");
            addNewEmployeePage.typeMiddleName("George");
            addNewEmployeePage.typeLastName("Smith");
            addNewEmployeePage.submit();
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
