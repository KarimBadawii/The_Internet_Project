package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdPage {
    private final WebDriver driver ;
    private final By closeButton = By.className("modal-footer");
    private final By adEntry = By.cssSelector("div.example h3");
    private final By clickAdLink = By.id("restart-ad");

    public AdPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCloseButton(){
        driver.findElement(closeButton).click();
    }
    public String getEntryAd(){
        return driver.findElement(adEntry).getText();
    }
    public void clickAdLink(){
        driver.findElement(clickAdLink).click();
    }
}
