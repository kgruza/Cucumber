package com.automation;


import Functions.Tools;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hook {
Tools tools = new Tools();
    public static WebDriver driver;
    public WebDriverWait wait;
    @Before
    public  void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "C:\\kgruza\\chrome235\\chromedriver_win32(2)\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,15);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tools.generateTestDatas();
    }

    @After
    public void afterScenario(){
        driver.quit();
        }
}
