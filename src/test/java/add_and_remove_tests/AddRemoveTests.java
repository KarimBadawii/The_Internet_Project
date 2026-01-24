package add_and_remove_tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRemoveTests extends BaseTests {

    @Test
    public void addSingleElementToTests() {
        var addAndRemovePage = homePage.clickAddAndRemoveLink();

        addAndRemovePage.clickAddElement();

        int numberOfElements = addAndRemovePage.getDeleteButtomsCount();

        assertEquals(numberOfElements, 1, "Delete button count should be 1");
    }

    @Test
    public void addMultibleElementsToTest() {
        var page = homePage.clickAddAndRemoveLink();

        for (int i = 0; i < 5; i++) {
            page.clickAddElement();
        }
        int numberOfElements = page.getDeleteButtomsCount();
        assertEquals(numberOfElements, 5, "Delete button count should be 5");

    }

    @Test
    public void removeElements(){
        var page = homePage.clickAddAndRemoveLink();
        for (int i = 0; i < 5; i++) {
            page.clickAddElement();
        }
        page.clickDelete();
        int numberOfElements = page.getDeleteButtomsCount();
        assertEquals(numberOfElements, 4, "Delete button count should be 4");

    }
    @Test
    public void removeAllElements(){
        var page = homePage.clickAddAndRemoveLink();
        for (int i = 0; i < 5; i++) {
            page.clickAddElement();
        }

        for (int i = 0; i < 5; i++) {
            page.deletLastElement();
        }

        int numberOfElements = page.getDeleteButtomsCount();
        assertEquals(numberOfElements, 0, "Delete button count should be 0");
    }
}
