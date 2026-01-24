package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddAndRemovePage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By addElement = By.cssSelector("button[onclick='addElement()']");
    private final By deleteButtons = By.className("added-manually");

    public AddAndRemovePage(WebDriver driver){
        this.driver=driver ;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)) ;
    }

    public void clickAddElement(){
        driver.findElement(addElement).click();
    }

    public  void clickDelete(){
        driver.findElement(deleteButtons).click();
    }

    public int getDeleteButtomsCount(){
        return driver.findElements(deleteButtons).size();
    }

    public void deletLastElement(){
        List<WebElement> buttons = driver.findElements(deleteButtons);

        if(!buttons.isEmpty()){
            buttons.get(buttons.size() -1).click();
            wait.until(ExpectedConditions.numberOfElementsToBeLessThan(deleteButtons,buttons.size()));
        }
    }




}
