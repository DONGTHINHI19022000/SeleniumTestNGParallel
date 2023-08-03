package Nhi.Bai17PageObjectModelPOM.testcases;

import Nhi.BTSeleniumPOM.Bai5POM.AddCustomer;
import Nhi.Bai17PageObjectModelPOM.Pages.Customers.CustomersPage;
import Nhi.Bai17PageObjectModelPOM.Pages.DashboardPage;
import Nhi.common.BaseTest;
import Nhi.Bai17PageObjectModelPOM.Pages.Loginpage;
import drivers.DriverManager;
import helpers.PropertiesHelper;
import keywords.WebUI;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    Loginpage loginP;
    DashboardPage dashboardPage;
    CustomersPage customersPage;
    @Test
    public void loginTest1() throws InterruptedException {

        //khoi tao doi tuong Loginpage
        //truyen driver tu BaseTest
        loginP=new Loginpage();
        //goi ham loginP tu loginpage de dung
        loginP.login("admin@example.com","123456");
        Thread.sleep(2000);
        AddCustomer a=new AddCustomer(DriverManager.getDriver());
        a.xulyCustomer();
        dashboardPage=new DashboardPage(DriverManager.getDriver());
        dashboardPage.verifyCustomersPage();
    }
    @Test
    public void loginTest2() throws InterruptedException {

        //khoi tao doi tuong Loginpage
        //truyen driver tu BaseTest
        loginP=new Loginpage();
        //goi ham loginP tu loginpage de dung
        loginP.login("admin@example.com","123456");//bai 27

    }
  /*  @Test
    public void loginTest2() throws InterruptedException {

        //khoi tao doi tuong Loginpage
        //truyen driver tu BaseTest
        loginP=new Loginpage(driver);
        //goi ham loginP tu loginpage de dung
        loginP.loginInvalidEmail("admin@example.comm","123456");
        Thread.sleep(2000);


    }
    @Test
    public void loginTest3()  {//ktra trang web

        //khoi tao doi tuong Loginpage
        //truyen driver tu BaseTest
        loginP=new Loginpage(driver);
        //goi ham loginP tu loginpage de dung
        loginP.login("admin@example.com","123456");
        dashboardPage=new DashboardPage(driver);
        dashboardPage.verifyFilterStatistics();
        WebUI.sleep(2);
    }
    @Test
    public void KtraHeader(){
        loginP=new Loginpage(driver);
        loginP.login("admin@example.com","123456");
         customersPage=new CustomersPage(driver);
         customersPage.verifyCustomer();
         customersPage.verifyHeadersPage();


    }*/
}
