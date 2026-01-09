package js_test;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JsTests extends BaseTests {
    String text = "I am a JS prompt";

    @Test
    public void testAcceptAlert() {
        var jsAlertPage = homePage.clickJSAlert();
        jsAlertPage.triggerAlert();
        jsAlertPage.alert_clickToAccept();
        assertEquals(jsAlertPage.getResult(), "You successfully clicked an alert", "Result text incorrect");
    }

    @Test
    public void testDismissAlert() {
        var jsAlertPage = homePage.clickJSAlert();
        jsAlertPage.triggerConfirm();
        assertEquals(jsAlertPage.getResult(), text, "You clicked: Cancel");
        jsAlertPage.alert_clickToDismiss();
        assertEquals(jsAlertPage.getResult(), "You clicked: Cancel");
    }

    @Test
    public void testPromptAlert() {
        var jsAlertPage = homePage.clickJSAlert();
        String text = "route";
        jsAlertPage.triggerPrompt();
        jsAlertPage.alert_setInput(text);
        jsAlertPage.alert_clickToAccept();
    }
}
