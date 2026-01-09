package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertPage {
    private WebDriver driver ;
    private By triggerAlretButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[Contains(text(),'JS Prompt')]");
    private By result = By.id("result");

    public JSAlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlretButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }


    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }


}
