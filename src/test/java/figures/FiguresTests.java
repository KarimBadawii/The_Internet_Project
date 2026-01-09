package figures;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FiguresTests extends BaseTests {
    @Test
    public void testFiguresCaptions(){
        int index = 1 ;
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverFigure(index);
        caption.isDisplayed();
        assertTrue(caption.isDisplayed(), "Caption is not displayed");
        assertEquals(caption.getName(), "name: user1", "Caption name is incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption name is incorrect");
        assertTrue(caption.getLink().contains("/users/"+index), "Caption link is incorrect");
    }
}
