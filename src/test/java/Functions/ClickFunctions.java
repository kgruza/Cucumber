package Functions;

import PageObjects.GeneralPage;
import PageObjects.MainPage;
import PageObjects.PersonPage;
import com.automation.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.Field;

public class ClickFunctions {

    Actions action = new Actions(Hook.driver);
WaitFunctions wait = new WaitFunctions();
    public void clickIn(By elementLocator){
        action.moveToElement(Hook.driver.findElement(elementLocator));
        Hook.driver.findElement(elementLocator).click();
        wait.waitForPageLoading();
        }

        public void clickFieldFromPage(Object arg0, String field) throws NoSuchFieldException, IllegalAccessException, InterruptedException {
            if(arg0.toString().equals("PersonPage")) {
                arg0 = new PersonPage();
            }
            if(arg0.toString().equals("GeneralPage")){
                arg0 = new GeneralPage();
            }
            if(arg0.toString().equals("MainPage")){
                arg0 = new MainPage();
            }
            Field edit = arg0.getClass().getField(field);
            Object value = edit.get(arg0).toString();
            action.moveToElement(Hook.driver.findElement(By.cssSelector(String.valueOf(value))));
            Hook.driver.findElement(By.cssSelector(String.valueOf(value))).click();
            wait.waitForPageLoading();
        }


    }






