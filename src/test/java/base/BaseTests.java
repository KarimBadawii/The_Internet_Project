package base;

import Pages.HomePage;
import Utils.MyListener;
import Utils.WindowManager;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class BaseTests {
    private WebDriver driver ;
    protected HomePage homePage ;
    String targetUrl = "https://the-internet.herokuapp.com/" ;

    @BeforeClass
    public void setUp(){

//        driver = new ChromeDriver(getChromeOptions());
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
    private void setCockie(){
        Cookie cookie = new Cookie("token","12345");
        driver.manage().addCookie(cookie);
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions() ;
            chromeOptions.addArguments("--headless");
            chromeOptions.setExperimentalOption("--excludeSwitches", Arrays.asList("enable-automation"));
            chromeOptions.addArguments("--window-size=1920,1080");
            chromeOptions.addArguments("--disable-gpu");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-dev-shm-usage");

            return chromeOptions ;

    }
}
