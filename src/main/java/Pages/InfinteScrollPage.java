package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfinteScrollPage {
    private WebDriver driver ;
    private final By paragraph = By.className("jscroll-added");

    public InfinteScrollPage(WebDriver driver){
        this.driver = driver ;
    }

    public void scrollToParagraph(int index){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0,document.body.scrollHeight);";
        while (index>getParagraphsNum()){
            js.executeScript(script);
            System.out.println(getParagraphsNum());
        }

    }
    public int getParagraphsNum(){
        return driver.findElements(paragraph).size();
    }
}
