package constants;

public class XPath {
    public interface ChangePassword {
        String header = "//h2[text()='Change Password']";
        String currentPasswordInput = "//input[@id='txtCurrentPassword']";
        String newPasswordInput = "//input[@id='txtNewPassword']";
        String confirmPasswordInput = "//input[@id='txtConfirmPassword']";
        String saveButton = "//button[@type='submit']";
    }

    //Bilan Daria
    public interface addNewEmployye{
        String PIM = "//a[contains(@href, '/web/index.php/pim/viewPimModule')]",
            addButton = "//button[contains(.,' Add')]",
            firstNameField = "//input[@name='firstName']",
            secondNameField = "//input[@name='middleName']",
            thirdNameField = "//input[@name='lastName']",
            saveButton = "//button[contains(.,'Save')]";
        }
 
    
}
