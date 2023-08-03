package Nhi.Bai18PageFactory;

import Nhi.common.BaseTest;
import drivers.DriverManager;
import org.testng.annotations.Test;

public class LoginTest2 extends BaseTest {
    LoginPageFactory loginPageFactory;
    @Test
    public void testLogin() throws Exception {
        loginPageFactory=new LoginPageFactory(DriverManager.getDriver());
        loginPageFactory.Login("admin@example.com","123456");
    }
}
