package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
    private final WebDriver driver;
    private final String leftFrame  = "frame-left";
    private final String topFrame   = "frame-top";
    private final String middleFrame   = "frame-middle";
    private final String rightFrame   = "frame-right";
    private final String buttomFrame   = "frame-bottom";
    private final By body = By.tagName("body");


    public NestedFramesPage(WebDriver driver){
        this.driver = driver;

    }
    private String getFrameText(By frameName){
        return driver.findElement(frameName).getText();
    }

    public String getLeftFrameText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText(body);
        driver.switchTo().defaultContent();
        return text;
    }

    public String getRightFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(rightFrame);
        String text = driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return text ;
    }
    public String getMiddleFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(middleFrame);
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }
    public String getBottomFrame(){
        driver.switchTo().frame(buttomFrame);
        String text = driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return text ;
    }




}
