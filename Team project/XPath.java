package constants;

public class XPath {

    //Artem Hrebeniuk
    public interface ChangePassword {
        header = "//h2[text()='Change Password']";
        currentPasswordInput = "//input[@id='txtCurrentPassword']";
        newPasswordInput = "//input[@id='txtNewPassword']";
        confirmPasswordInput = "//input[@id='txtConfirmPassword']";
        saveButton = "//button[@type='submit']";
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
    //Nick-Gold
    public interface User_Login{
        Login_Header = "//h5[text()='Login']";
        Username_Button = "//button[@name='username']";
        Password_Button = "//button[@name='password']";
        Login_Button = "//button[@type='submit']";
        Youtube_Link = "//a[@href='https://www.youtube.com/c/OrangeHRMInc']";
        Facebook_Link = "//a[@href='https://www.facebook.com/OrangeHRM/']";
        Linkedin_Link = "//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']";
        Twitter_Link = "//a[@href='https://twitter.com/orangehrm?lang=en']";
        Forgot_your_password_Header = "//p[text()='Forgot your password?']";
    }
 
    
}
