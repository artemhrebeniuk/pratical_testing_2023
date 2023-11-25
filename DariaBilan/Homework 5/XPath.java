package hw_fifth;

public class XPath {
    public interface addNewEmployye{
        String PIM = ".//a[contains(@href, '/web/index.php/pim/viewPimModule')]",
                ADD_BUTTON = ".//button[contains(.,' Add')]",
                FIRST_NAME_FIELD = ".//input[@name='firstName']",
                SECOND_NAME_FIELD = ".//input[@name='middleName']",
                THIRD_NAME_FIELD = ".//input[@name='lastName']",
                SAVE_BUTTON = ".//button[contains(.,'Save')]";
    }
}
