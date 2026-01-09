package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By ex1 = By.xpath("//a[text()=\"Example 1: Element on page that is hidden\"]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingEx1 clickEx1() {
    driver.findElement(ex1).click();
    return new DynamicLoadingEx1(driver);


    }


}
