package images;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BrokenImagesTests extends BaseTests {

    @Test
    public void verifyBrokenImagesExist() {

        var page = homePage.clickBrokenImageLink();
        int brokenImages = 0;

        for (WebElement image : page.getImages()) {
            if (page.isBroken(image)) {
                brokenImages++;
            }
        }

        assertTrue(brokenImages > 0, "Expected At least one is broken");
    }
}
