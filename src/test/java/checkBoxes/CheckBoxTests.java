package checkBoxes;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckBoxTests extends BaseTests {

    @Test
    public void verifyCheckBoxesBehavior(){
        var page = homePage.clickCheckBoxesLink();

        assertFalse(page.isChecked(0),
                "Checkbox 1 should be unchecked by default");

        assertTrue(page.isChecked(1),
                "Checkbox 2 should be checked by default");

        page.check(0);
        page.uncheck(1);

        assertTrue(page.isChecked(0),
                "Checkbox 1 should be checked after action");

        assertFalse(page.isChecked(1),
                "Checkbox 2 should be unchecked after action");

    }
}
