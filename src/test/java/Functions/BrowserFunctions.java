package Functions;

import com.automation.Hook;

public class BrowserFunctions {

    public void getUrl(String URL){
        Hook.driver.get(URL);
    }
}
