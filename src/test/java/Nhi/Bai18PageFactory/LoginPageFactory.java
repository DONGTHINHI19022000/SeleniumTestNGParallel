package Nhi.Bai18PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    private String URL="https://crm.anhtester.com/admin/authentication";
    private String Page_Text="Login";
    @FindBy (xpath = "//input[@id='email']")
    private WebElement inputEmail;
    @FindBy (xpath = "//input[@id='password']")
    private WebElement inputPassword;
    @FindBy (xpath = "//button[normalize-space()='Login']")
    private WebElement btnLogin;
    @FindBy (xpath = "//h1[normalize-space()='Login']")
    private WebElement headerPage;
//khai bao ham xay dung
    private WebDriver driver;
    public LoginPageFactory(WebDriver _driver) {driver=_driver;

        //gọi hàm initElementa của class PageFactory để khởi tạo WebElement bên trên
        PageFactory.initElements(driver,this);
    }
    public void Login(String email,String password){
        driver.get(URL);
        this.inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }

}
