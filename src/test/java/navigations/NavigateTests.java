package navigations;

import Pages.NewWindowPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NavigateTests extends BaseTests {

    @Test
    public void switchToTab(){
        var newWindowPage = homePage.clickMultipleWidowLink().clickNewWindow();
        getWindowManager().switchToTab("New Window");
        String text = newWindowPage.getPageText();
        assertEquals(text,"New Window","Text is incorrect");

    }
}
