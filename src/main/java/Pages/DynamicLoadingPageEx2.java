package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageEx2 {
    private WebDriver driver ;
    private WebDriverWait wait ;
    private By loadingBar = By.id("#loading img");
    private By resultText = By.cssSelector("#finish h4");
    private By startButton = By.cssSelector("#start button");

    public DynamicLoadingPageEx2(WebDriver driver){
        this.driver =driver ;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public DynamicLoadingPageEx2 clickStart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(startButton));
        wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
        return this;
    }

    public DynamicLoadingPageEx2 waitUntilLoading(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(resultText));
        return this;
    }

    public String getResultText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultText)).getText().trim();
    }
}
