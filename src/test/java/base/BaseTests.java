package base;

import Pages.HomePage;
import Utils.MyListener;
import Utils.WindowManager;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private WebDriver driver ;
    protected HomePage homePage ;
    String targetUrl = "https://the-internet.herokuapp.com/" ;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        goHome();
    }
    @BeforeMethod
    public void goHome(){
        WebDriverListener listener = new MyListener();
        WebDriver decorated = new EventFiringDecorator<>(listener).decorate(driver) ;
        decorated.get(targetUrl);
        homePage = new HomePage(decorated);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }


    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var takeScreenshot = (TakesScreenshot) driver;
            File screenShot = takeScreenshot.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot, new File("src/main/resources/screenshots"+result.getName()+".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}
