package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickNewWindow = By.cssSelector("div.example > a");

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver ;
    }

    public NewWindowPage clickNewWindow(){
         driver.findElement(clickNewWindow).click();
         return new NewWindowPage(driver);
    }



}
