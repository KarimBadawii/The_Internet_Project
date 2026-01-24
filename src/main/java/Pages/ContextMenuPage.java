package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private final WebDriver driver ;
    private final By Square = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver ;

    }

    public void rightClickSquare(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(Square)).perform();
    }
    public String getAlertText(){
        return  driver.switchTo().alert().getText();
    }








}
