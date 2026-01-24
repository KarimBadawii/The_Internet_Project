package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver ;
    private final By formAuthentication = By.linkText("Form Authentication");
    private final By hovers     = By.linkText("Hovers");
    private final By keyPresses = By.linkText("Key Presses");
    private final By JSAlert    = By.linkText("JavaScript Alerts");
    private final By fileUpload = By.linkText("File Upload");
    private final By adLink     = By.linkText("Entry Ad");
    private final By framesLink = By.linkText("Frames");
    private final By largeAndDeepDomLink     = By.linkText("Large & Deep DOM");


    public HomePage(WebDriver driver){
        this.driver = driver ;
    }


    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    private void clickLink(By linkElement){
        driver.findElement(linkElement).click();
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthentication).click();
        return new LoginPage(driver);
    }

    public HoversPage clickHovers (){
//        clickLink("Hovers");
        driver.findElement(hovers).click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses (){
        driver.findElement(keyPresses).click();
        return new KeyPressesPage(driver);
    }

    public JSAlertPage clickJSAlert () {
        driver.findElement(JSAlert).click();
        return new JSAlertPage(driver);
    }

    public FileUploadPage fileUploadPage(){
        driver.findElement(fileUpload).click();
        return new FileUploadPage(driver);
    }

    public AdPage clickAdPage(){
        driver.findElement(adLink).click();
        return new AdPage(driver);
    }

    public FramesPage clickFramesPage(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDomLink(){
        clickLink(largeAndDeepDomLink);
        return new LargeAndDeepDomPage(driver);
    }

    public InfinteScrollPage clickInfiniteScrollLink(){
        clickLink("Infinite Scroll");
        return new InfinteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWidowLink(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    public AddAndRemovePage clickAddAndRemoveLink(){
        clickLink("Add/Remove Elements");
        return new AddAndRemovePage(driver);
    }

    public BrokenImagesPage clickBorkenImageLink(){
        clickLink("Broken Images");
        return new BrokenImagesPage(driver);
    }

    public CheckBoxesPage clickCheckBoxesLink(){
        clickLink("Checkboxes");
        return new CheckBoxesPage(driver);
    }

    public ContextMenuPage clickContextMenuLink(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public DisappearingElementsPage clickDisappearingElementsLink(){
        clickLink("Disappearing Elements");
        return new DisappearingElementsPage(driver);
    }

}
