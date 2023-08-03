package Nhi.Bai24;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {//truyen du lieu vao xml de chay

    @Test
    @Parameters({"number1", "number2"})//parameters de truyen tham so
    public void Tong(int num1,@Optional("10") int num2) {// thêm @Optional("10") tư là để mặc định num2=10, nếu không nhập gtri num2 thì mặc định lấy 10
        System.out.println("Tong 2 so la:" + (num1 + num2));
        //return (num1 + num2);
    }

    @Test
    @Parameters({"Message"})
    public void thongbao(String mess){
        System.out.println("Thong bao la:"+mess);
    }

}
