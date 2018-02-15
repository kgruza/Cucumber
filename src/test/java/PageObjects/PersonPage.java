package PageObjects;



import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;


public class PersonPage {

    public By formPersonName = By.cssSelector("input[placeholder='Imię']");
    public By formPersonSurname = By.cssSelector("input[placeholder='Nazwisko']");
    public By formTelephone1 = By.cssSelector("input[placeholder='Telefon 1']");
    public By formPersonChannel = By.cssSelector("*[formcontrolname='channel'] select");
    public  By personDetailsSurname = By.cssSelector("tr:nth-child(2) td:nth-child(2)");


    public String addPerson = "a[routerlink='dodaj']";
    public String editButton = "table tr:nth-child(1) a[tooltip='Edytuj']";
    public String personDetailsButton = "table tr:nth-child(1) td:nth-child(1)";
    public String payersButton = "a[routerlink='platnicy-osoby']";
    public String addPersonPayerButton = ".tab-content a:nth-child(2)";
    public String addCompanyPayerButton= ".tab-content a:nth-child(4)";
    public String addPayerConfirmationButton = ".modal tr:nth-child(1) .btn";
    }

