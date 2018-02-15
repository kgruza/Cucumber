package Functions;

import com.automation.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFunctions {
    WebDriverWait wait = new WebDriverWait(Hook.driver, 10);

    public void waitForPageLoading() {
        // wait for Ajax actions to begin
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.wait.until(new ExpectedCondition<Boolean>() {

            private final int MAX_NO_JQUERY_COUNTER = 3;
            private int noJQueryCounter = 0;

            @Override
            public Boolean apply(WebDriver driver) {
                String documentReadyState = (String) ((JavascriptExecutor) driver).executeScript("return document.readyState;");

                Long jQueryActive = (Long) ((JavascriptExecutor) driver)
                        .executeScript("if(window.jQuery) { return window.jQuery.active; } else { return -1; }");
                System.out.println(String.format("waitForPageLoading -> document.readyState: %s, jQuery.active: %d", documentReadyState, jQueryActive));

                if (jQueryActive == -1) {
                    noJQueryCounter++;

                    if (noJQueryCounter >= MAX_NO_JQUERY_COUNTER) {
                        return true;
                    }

                } else {
                    noJQueryCounter = 0;
                }

                return "complete".equals(documentReadyState) && jQueryActive == 0;
            }
        });

        // wait for Ajax responses to be processed
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void waitForElemenToBeClickable(By locator) {
        this.wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
