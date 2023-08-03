package Nhi.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseWait {
    public WebDriver driver;
    @BeforeMethod
    public void createDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Chờ đợi trang load xong (trong 30s)
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
