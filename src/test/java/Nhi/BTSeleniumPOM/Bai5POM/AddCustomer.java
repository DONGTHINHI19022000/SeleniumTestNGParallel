package Nhi.BTSeleniumPOM.Bai5POM;

import keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AddCustomer {

    By btncustomer = By.xpath("//li[@class='menu-item-customers']/a");
    By btnnewcustomer = By.xpath("//a[normalize-space()='New Customer']");
    By tbcompany = By.xpath("//input[@id='company']");
    By tbvat = By.xpath("//input[@id='vat']");
    By tbphonenumber = By.xpath("//input[@id='phonenumber']");
    By btnsave = By.xpath("//button[@class='btn btn-primary only-save customer-form-submiter']");

    private WebDriver driver;

    public AddCustomer(WebDriver _driver) {
        driver = _driver;
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;


    public void xulyCustomer() {
        driver.findElement(btncustomer).click();
    }

    public void xulyNewcustomer() {
        driver.findElement(btnnewcustomer).click();
    }

    public void xulyCompany(String company) {
        driver.findElement(tbcompany).sendKeys(company);
    }

    public void xulyVAT(String vat) {
        driver.findElement(tbvat).sendKeys(vat);
    }

    public void xulyPhonenumber(String phonenumber) {
        driver.findElement(tbphonenumber).sendKeys(phonenumber);
    }

    public void xulySave() {
//
//        WebElement element = driver.findElement(btnsave);
//        js.executeScript("arguments[0].scrollIntoView(true);", element);//để true nó cuộn đến đầu element được chọn, fail là cuối element đươ chọn
        driver.findElement(btnsave).click();
    }

    public void ADD(String company, String vat, String phonenumber) {
        xulyCustomer();
        xulyNewcustomer();
        xulyCompany(company);
        xulyVAT(vat);
        xulyPhonenumber(phonenumber);
        WebUI.sleep(2);
        xulySave();
    }


}
