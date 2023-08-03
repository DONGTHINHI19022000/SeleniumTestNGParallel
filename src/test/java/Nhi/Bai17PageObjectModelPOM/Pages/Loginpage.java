package Nhi.Bai17PageObjectModelPOM.Pages;

import keywords.WebUI;

import static Nhi.common.BaseTest.*;
import static keywords.WebUI.*;//để gọi các hàm chó trạng thais static trong WebUI, để sau không cần gọi WebUI. nữa

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Loginpage {

    private String URL = "https://crm.anhtester.com/admin/authentication";
    private String PAGETEXT = "Login";
    //luu object cau trang login
    By headerPage = By.xpath("//h1[normalize-space()='Login']");//khai bao doi tuong headerPage
    By Txtemail = By.id("email");
    By Txtpassword = By.id("password");
    By btnlogin = By.xpath("//button[normalize-space()='Login']");
    By textInvalid = By.xpath("//div[@class='text-center alert alert-danger']");

    //ham xay dung de truyen vao driver


    //viet cac ham xu ly cho trang login
    public void xulyLogin() {

        //WebElement w= driver.findElement(headerPage);
        ;
        Assert.assertEquals(getTextElement(headerPage), "Login", "Sai tieu de");
    }

    public void xulyEmail(String email) {
        setText(Txtemail, email);
    }

    public void xulyPassWord(String password) {
        setText(Txtpassword, password);

    }

    //    public void xulyTextInvalid(){
//
//        System.out.println("co hien text invalid khong?"+textInvalid.isDisplayed());
//        System.out.println(w.getText());
//        Assert.assertEquals(w.getText(),"Invalid email or passworddsfsdf","Thong bao hien thi sai");
//    }
    public void xulyBtnLogin() {
        clickElement(btnlogin);
    }

    public void login(String email, String password) {

        openURL(URL);
        xulyLogin();
        xulyEmail(email);
        xulyPassWord(password);
        xulyBtnLogin();
    }

    public void loginInvalidEmail(String email, String password) {
        openURL(URL);
        xulyLogin();
        xulyEmail(email);
        xulyPassWord(password);
        xulyBtnLogin();
        // xulyTextInvalid();
    }
}
