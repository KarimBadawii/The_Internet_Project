package login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
//import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
       LoginPage loginPage= homePage.clickFormAuthentication();
       loginPage.setUserNameField("tomsmith");
       loginPage.setPasswordField("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       assertTrue(secureAreaPage.getText().contains("You logged into a secure area!"),
               "Alert text is incorrect");
    }

}
