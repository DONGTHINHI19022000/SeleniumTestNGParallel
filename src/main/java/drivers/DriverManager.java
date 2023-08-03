package drivers;
import org.openqa.selenium.WebDriver;
public class DriverManager {//quản lý các phiên làm việc của driver

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver.set(driver);
        DriverManager.setDriver(driver);//set gtri driver được khởi tạo vào ThreadLocal
    }

    public static void quit() {
        DriverManager.driver.get().quit();
        driver.remove();
    }
}