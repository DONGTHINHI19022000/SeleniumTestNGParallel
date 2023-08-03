package Nhi.Bai17PageObjectModelPOM.Pages;

import keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DashboardPage {
    private String Page_URL="https://crm.anhtester.com/admin/clients";
    private String Page_Text="Dashboard Options";

    By menuCustomer = By.xpath("//span[normalize-space()='Customers']");
    By buttonOptionDashboard = By.xpath("//div[@class='screen-options-btn']");

    By widgetStatistics = By.xpath("//div[@id='widget-top_stats']");

    By checkboxQuickStatistics = By.xpath("//label[normalize-space()='Quick Statistics']");
    private WebDriver driver;
    public DashboardPage(WebDriver _driver){
        driver = _driver;
    }

//    private WebDriver driver;
//    public CustomersPage(WebDriver _driver){
//        driver = _driver;
//    }

    public void verifyCustomersPage(){//kiem tra header cua trang

        Assert.assertEquals(driver.getCurrentUrl(),Page_URL,"URL chua dung");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaa");
        // Assert.assertTrue(WebUI.checkElementExist(driver, String.valueOf(headPageCustomer)), "Head page khong ton tai");
        WebElement webElement=driver.findElement(menuCustomer);

        Assert.assertEquals(webElement.getText(),"Customers","sai headpage");
    }
    public void clickCheckboxQuickStatistics(){
        driver.findElement(buttonOptionDashboard).click();
        WebUI.sleep(2);
        WebUI.waitForElementVisible(checkboxQuickStatistics,5);
        driver.findElement(checkboxQuickStatistics).click();
        WebUI.sleep(2);

    }
    public void verifyFilterStatistics(){
        //ktra widget này đang hiển thị
        Assert.assertTrue( WebUI.verifyElementVisible(widgetStatistics,5),"widget này đang khong hiển thị");

        //nhấn uncheck this widget
        clickCheckboxQuickStatistics();
        //ktra widget trên đã bị ẩn(not visible)
        Assert.assertTrue( WebUI.verifyElementNotVisible(widgetStatistics,5),"widget này đang co hiển thị");
    }

}
