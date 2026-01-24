package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokenImagesPage {
    private final WebDriver driver ;
    private final By image = By.tagName("img");

    public BrokenImagesPage(WebDriver driver){
        this.driver = driver ;
    }
    public List<WebElement> getImages(){
        return driver.findElements(image);
    }
    public boolean isBroken(WebElement image){
        return image.getAttribute("naturalWidth").equals("0");
    }


}
