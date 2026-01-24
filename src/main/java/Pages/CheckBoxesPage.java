package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesPage {
    private WebDriver driver;
    private final By checkBoxes = By.cssSelector("input[type='checkbox']");

    public CheckBoxesPage(WebDriver driver){
        this.driver = driver ;
    }

    public List<WebElement> getCheckBoxes(){
       return driver.findElements(checkBoxes);
    }

    public boolean isChecked(int index){
        return getCheckBoxes().get(index).isSelected();
    }

    public void check(int index){
        getCheckBoxes().get(index).click();
    }

    public void uncheck(int index){
        getCheckBoxes().get(index).click();
    }


}
