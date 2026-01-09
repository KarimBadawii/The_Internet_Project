package Frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void leftFrameTest(){
        var framesPage = homePage.clickFramesPage();
        var nestedPage = framesPage.clickNestedFrames();
        String leftFrameText = nestedPage.getLeftFrameText();
        assertEquals(leftFrameText,"LEFT","Left frame text is Wrong");
    }
    @Test
    public void rightFrameTest(){
        var framesPage = homePage.clickFramesPage();
        var nestedPage = framesPage.clickNestedFrames();
        String rightFrameText = nestedPage.getRightFrame();
        assertEquals(rightFrameText,"RIGHT","Right frame text is Wrong");
    }

    @Test
    public void middleFrameTest() {
        var framesPage = homePage.clickFramesPage();
        var nestedPage = framesPage.clickNestedFrames();
        String middleFrameText = nestedPage.getMiddleFrame();
        assertEquals(middleFrameText,"MIDDLE","Middle frame text is Wrong");

    }
    @Test
    public void bottomFrameTest() {
        var framesPage = homePage.clickFramesPage();
        var nestedPage = framesPage.clickNestedFrames();
        String bottomFrameText = nestedPage.getBottomFrame();
        assertEquals(bottomFrameText,"BOTTOM","Bottom frame text is Wrong");
    }

}
