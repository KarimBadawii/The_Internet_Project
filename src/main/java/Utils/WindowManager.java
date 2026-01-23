package Utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation ;
    public WindowManager(WebDriver driver){
        this.driver = driver ;
        navigation = driver.navigate();
    }

    public void goBack(){
        navigation.back();
    }

    public void goForward(){
        navigation.forward();
    }

    public void refresh(){
        navigation.refresh();
    }

    public void goTo(String url){
        navigation.to(url);
    }

    public void switchToTab(String tabTitle){
       Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("Number of tabs: " + windowHandles.size());
        for(String windowHandle : windowHandles){
            System.out.println(windowHandle);
        }

        for (String windowHandle : windowHandles){
            driver.switchTo().window(windowHandle);
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }


    }

}
