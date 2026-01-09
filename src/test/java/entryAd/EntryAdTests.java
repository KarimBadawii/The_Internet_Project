package entryAd;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EntryAdTests extends BaseTests {
    @Test
    public void adTests(){
        var adPage = homePage.clickAdPage();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        adPage.clickCloseButton();
        String text = adPage.getEntryAd();
        assertEquals(text,"Entry Ad","the text is incorrect");
    }
}
