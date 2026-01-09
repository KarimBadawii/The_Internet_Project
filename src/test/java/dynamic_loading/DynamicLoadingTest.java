package dynamic_loading;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicLoadingTest extends BaseTests {
    @Test
    public void dynamicLoadingTests(){
        var dynamicLoading = homePage.clickDynamicLoadingLink() ;
        var dynamicLoadingEx1 = dynamicLoading.clickEx1();

        dynamicLoadingEx1.clickStartButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        var isDisplayed = dynamicLoadingEx1.isDisplayed();
        assertTrue(isDisplayed,"Loading is not displayed");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String text = dynamicLoadingEx1.getText();

        assertEquals(text,"Hello World!","Text is incorrect");
    }
}
