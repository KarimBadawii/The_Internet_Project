package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingEx1 {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
    private By loadingImg = By.id("loading");
    private By endtext = By.id("finish");


    public DynamicLoadingEx1(WebDriver driver){
        this.driver = driver ;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
    }

    public boolean isDisplayed() {
        return driver.findElement(loadingImg).isDisplayed();
    }
    public String getText(){
        return driver.findElement(endtext).getText();
    }




}
