package PageObjects;

import org.openqa.selenium.By;

public class LoginPage {

    public By emailField = By.cssSelector("input[placeholder='E-mail']");
    public By passwordField = By.cssSelector("input[placeholder='Hasło']");
    public String loginButton = "button[type='submit']";

}
