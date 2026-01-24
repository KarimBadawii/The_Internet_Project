package js_test;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void verifyContextMenuAlert(){

        var page = homePage.clickContextMenuLink();

        page.rightClickSquare();

        String alertText = page.getAlertText();

        assertEquals(alertText,"You selected a context menu","Alert text is incorrect");

    }
}
