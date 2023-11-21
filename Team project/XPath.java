package constants;

public class XPath {

    XPath for Adding new Employee
    xpath=//div[@id='app']/div/div/header/div/div/i
    xpath=//span[contains(.,'PIM')]
    xpath=//button[contains(.,' Add')]
    xpath=//button[contains(.,'Save')]

    interface ChangePassword {
        String header = "//h2[text()='Change Password']";
        String currentPasswordInput = "//input[@id='txtCurrentPassword']";
        String newPasswordInput = "//input[@id='txtNewPassword']";
        String confirmPasswordInput = "//input[@id='txtConfirmPassword']";
        String saveButton = "//button[@type='submit']";

}

}
