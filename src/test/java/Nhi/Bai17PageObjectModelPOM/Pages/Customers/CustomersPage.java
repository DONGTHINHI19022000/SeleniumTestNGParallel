package Nhi.Bai17PageObjectModelPOM.Pages.Customers;

import keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static keywords.WebUI.getCurrentUrl;

public class CustomersPage {// chayj thu o ben LoginTest
    private String Page_URL="https://crm.anhtester.com/admin/";
    private String Page_Text="Customers Summary";

    By headerPageCustomer= By.xpath("(//div[@class='panel-body']//h4)[1]");
    By btnNewCustomer= By.xpath("//a[normalize-space()='New Customer']");
    By btnInportSummary= By.xpath("//a[normalize-space()='Import Customers']");
    By txtSearch= By.xpath("//input[@class='form-control input-sm']");

    By btnCustomers= By.xpath("//span[normalize-space()='Customers']");


    private WebDriver driver;
    public CustomersPage(WebDriver _driver){
        driver = _driver;
        //new WebUI(driver)
    }

    public void verifyCustomersPage(){

        Assert.assertEquals(getCurrentUrl(),Page_URL,"URL chua dung");
        Assert.assertTrue(WebUI.checkElementExist(headerPageCustomer),"sai head page customer");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaa");
        // Assert.assertTrue(WebUI.checkElementExist(driver, String.valueOf(headPageCustomer)), "Head page khong ton tai");
        WebElement webElement=driver.findElement(headerPageCustomer);

        Assert.assertEquals(webElement.getText(),Page_Text,"sai headpage");
    }
    public  void verifyNewCustomersButton(){
        driver.findElement(btnNewCustomer).click();
        WebUI.sleep(2);
    }
    public  void verifyCustomer(){
        driver.findElement(btnCustomers).click();
        WebUI.sleep(2);
    }
    public void verifyHeadersPage(){
        Assert.assertEquals(driver.getCurrentUrl(),Page_URL,"URL chua dung!");
        Assert.assertTrue(WebUI.checkElementExist(headerPageCustomer),"Header khong ton tai");
        WebElement w=driver.findElement(headerPageCustomer);
        Assert.assertEquals(w.getText(),"Customers Summary","Tieu de khong dung");
    }



}
