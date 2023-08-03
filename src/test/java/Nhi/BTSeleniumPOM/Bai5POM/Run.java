package Nhi.BTSeleniumPOM.Bai5POM;

import Nhi.Bai17PageObjectModelPOM.Pages.Loginpage;
import Nhi.common.BaseTest;
import Nhi.common.BaseTestClass;
import org.testng.annotations.Test;

public class Run extends BaseTestClass {
    Loginpage loginP;
    AddCustomer addC;
    @Test(priority = 1)
    public void login() throws InterruptedException {

        //khoi tao doi tuong Loginpage
        //truyen driver tu BaseTest
        loginP=new Loginpage();
        //goi ham loginP tu loginpage de dung
        loginP.login("admin@example.com","123456");
        Thread.sleep(2000);

    }
    @Test(priority = 2)
    public void add(){
        addC=new AddCustomer(driver);
        addC.ADD("cty hihihihi","1201212","000000000");
    }

}
