package MenuItems;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MenuItemsTests extends BaseTests {

    @Test
    public void verifyMenuDoesNotBreakWhenGalleryDisappears(){
        var page = homePage.clickDisappearingElementsLink();

        assertTrue(page.isMenuItemDisplayed("Home"));
        assertTrue(page.isMenuItemDisplayed("About"));
        assertTrue(page.isMenuItemDisplayed("Contact Us"));
        assertTrue(page.isMenuItemDisplayed("Portfolio"));

        boolean gallaryExistance = page.isMenuItemDisplayed("Gallery");

        System.out.println("Gallary prensent: " + gallaryExistance);
    }
}
