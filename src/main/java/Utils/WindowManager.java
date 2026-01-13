package Utils;

import org.openqa.selenium.WebDriver;

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

}
