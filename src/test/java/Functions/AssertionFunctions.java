package Functions;

import com.automation.Hook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AssertionFunctions {
    WaitFunctions wait = new WaitFunctions();

    public void checkIfMessageIsDisplayedInField(By field, String expectedMessage){
        wait.waitForElemenToBeClickable(field);
        String message = Hook.driver.findElement(field).getText();
        Assert.assertEquals(expectedMessage, message );
    }

    public void checkIfFieldContainsValue(By field, String expectedValue){
        wait.waitForElemenToBeClickable(field);
        String value = Hook.driver.findElement(field).getText();
        Assert.assertEquals(expectedValue, value );
    }
}
