package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DisappearingElementsPage {
    private WebDriver driver;
    private final By menuItems = By.cssSelector("ul li a");

    public DisappearingElementsPage(WebDriver driver) {
        this.driver = driver;
    }
    public List<String> getMenuItemsTexts(){
        return driver.findElements(menuItems)
                .stream()
                .map(e -> e.getText())
                .toList();
    }

    public boolean isMenuItemDisplayed(String menuItem){
        return getMenuItemsTexts().contains(menuItem);
    }
}
