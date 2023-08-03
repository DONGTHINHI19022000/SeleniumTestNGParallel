package helpers;

import java.io.File;

public class SystemsHelper {
    //hàm lấy path của project
    public static String getCurrentDir() {
        String current = System.getProperty("user.dir") + File.separator;//File.separator: thêm 1 dấu / hoặc \ tùy vào đường dẫn
        return current;
    }
}
