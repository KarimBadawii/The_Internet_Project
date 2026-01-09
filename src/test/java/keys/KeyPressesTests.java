package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends BaseTests {
    @Test
    public void testKeyPresses(){
        var keyPresses = homePage.clickKeyPresses();
//        keyPresses.setText("B"+Keys.BACK_SPACE);
        keyPresses.setText(Keys.chord(Keys.SHIFT, "b"));
        assertEquals(keyPresses.getText(), "You entered: BACK_SPACE", "Wrong text");
    }
}
