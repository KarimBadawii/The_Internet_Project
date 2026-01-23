package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWindowPage {
    private WebDriver driver ;
    private By pageText = By.tagName("h3") ;

    public NewWindowPage (WebDriver driver){
        this.driver = driver ;
    }

    public String getPageText(){
        return driver.findElement(pageText).getText();
    }




}
