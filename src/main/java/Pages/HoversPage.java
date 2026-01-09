package Pages;

import Utils.FiguresHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver ;
    private By figureBox = By.className("figure");
    private By figureCaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver ;
    }

    /**
     *
     * @param index is start from 1 not 0.
     */
    public FiguresHandling hoverFigure(int index){
       WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FiguresHandling(figure.findElement(figureCaption));
    }

}
