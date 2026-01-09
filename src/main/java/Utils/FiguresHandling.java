package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FiguresHandling {
    private WebElement caption ;
    private By link = By.tagName("a");
    private By name = By.tagName("h5");



    public FiguresHandling(WebElement figureCaption) {
        this.caption = figureCaption;
    }
    public boolean isDisplayed(){
        return caption.isDisplayed();
    }

    public String getLink() {
        return caption.findElement(link).getAttribute("href");
    }
    public String getLinkText() {
        return caption.findElement(link).getText();
    }

    public String getName() {
        return caption.findElement(name).getText();
    }


}
