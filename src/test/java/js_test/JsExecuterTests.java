package js_test;

import base.BaseTests;
import org.testng.annotations.Test;

public class JsExecuterTests extends BaseTests {
    @Test
    public void testScrollToElement(){
        var scrollPage = homePage.clickLargeAndDeepDomLink();
        scrollPage.scrollTo();
    }
    @Test
    public void testScrollToParagraph(){
        var scrollPage = homePage.clickInfiniteScrollLink();
        scrollPage.scrollToParagraph(5);
    }
}
