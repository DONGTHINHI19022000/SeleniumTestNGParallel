package Nhi.Bai17PageObjectModelPOM.testcases;

import Nhi.Bai17PageObjectModelPOM.Pages.Customers.CustomersPage;
import Nhi.Bai17PageObjectModelPOM.Pages.Loginpage;
import Nhi.common.BaseTest;
import drivers.DriverManager;
import org.testng.annotations.Test;

public class CustomeTest extends BaseTest {
    Loginpage loginpage;
    CustomersPage customersPage;
    @Test
    public void testAddNewCustomer(){
        loginpage=new Loginpage();
        loginpage.login("admin@example.com","123456");
        customersPage=new CustomersPage(DriverManager.getDriver());

        customersPage.verifyCustomersPage();
        customersPage.verifyNewCustomersButton();
    }
}
