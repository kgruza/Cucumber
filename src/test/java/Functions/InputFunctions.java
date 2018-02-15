package Functions;

import PageObjects.LoginPage;
import com.automation.Hook;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class InputFunctions {
    WaitFunctions wait = new WaitFunctions();
    ClickFunctions click = new ClickFunctions();
    Faker faker = new Faker();
    LoginPage loginP = new LoginPage();
    Actions action = new Actions(Hook.driver);
    Tools tools = new Tools();
    public void sendInputIntoField(By elementLocator, String Text){
        action.moveToElement(Hook.driver.findElement(elementLocator));
        Hook.driver.findElement(elementLocator).sendKeys(Text);
        }

    public void selectFirstFromDropdown(By dropdownLocator){
        WebElement mySelectElement = Hook.driver.findElement(dropdownLocator);
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByIndex(1);
    }

    public void selectValueFromDropdown(By dropdownLocator, String searchedText){
        WebElement mySelectElement = Hook.driver.findElement(dropdownLocator);
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByVisibleText(searchedText);
    }

    public void editField(By field) throws IOException {
        action.moveToElement(Hook.driver.findElement(field));
        WebElement element = Hook.driver.findElement(field);
        element.clear();
        element.sendKeys(tools.findXlsCellValueByAttribute("EditData"));

    }

    public void logAs(String role) throws InterruptedException {
        if(role.equals("CONSULTANT")){
            sendInputIntoField(loginP.emailField, "konsultantPl@gmail.com");
            sendInputIntoField(loginP.passwordField, "konsprofil");
             }
             if(role.equals("DIRECTOR")){
                 sendInputIntoField(loginP.emailField, "dyrektor_haps@gmail.com");
                 sendInputIntoField(loginP.passwordField, "dyrhaps");
             }
             if(role.equals("ADMIN")){
                 sendInputIntoField(loginP.emailField, "admin@wsip.com");
                 sendInputIntoField(loginP.passwordField, "admin123");
             }
            Hook.driver.findElement(By.cssSelector(loginP.loginButton)).click();
    }
}
