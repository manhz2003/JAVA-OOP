/* Tạo tập tin và thư mục
 * exits()  => kiểm tra xem thư mục có tồn tại hay không
 * mkdir()  => tạo 1 thư mục
 * mkdirs() => tạo nhiều thư mục cùng lúc
 * createNewFile() => tạo file có phần mở rộng
 */

package OOP_24;

import java.io.File;
import java.io.IOException;

public class test24 {
    public static void main(String[] args) {
        // Lưu ý:
        // trong windows: muốn sử dụng dấu \ phải gõ \\  ví dụ: C:\\folder 1\\ folder 2\\ file.xxx";
        // trong linux, macOS: /
            File folder1 = new File("D:\\JAVA\\JAVA CORE\\JAVA_OOP\\src");
    
            // exits() => kiểm tra xem thư mục có tồn tại hay không
            System.out.println("Kiểm tra folder1 có tồn tại hay không: "+folder1.exists());
            
            // Tạo thư mục
            // mkdir() => tạo 1 thư mục
            File f1 = new File("D:\\JAVA\\JAVA CORE\\JAVA_OOP\\src\\OOP_31");
            f1.mkdir();
    
            // mkdirs() => tạo nhiều thư mục cùng lúc
            File d2 = new File("D:\\JAVA\\JAVA CORE\\JAVA_OOP\\src\\OOP_31\\OOP_32\\OOP_33");
            d2.mkdirs();
        
            // Tạo tập tin (có phần mở rộng: .exe, .txt, .doc, .xls......)
            // createNewFile() => tạo file có phần mở rộng
             f1 = new File("D:\\JAVA\\JAVA CORE\\JAVA_OOP\\src\\OOP_31\\test.txt");
            
            try {
                f1.createNewFile();
            } catch (IOException e) {
                // sử dụng try catch để bắt 1 số lỗi như: 
                // không có quyền tạo file
                // ổ cứng bị đầy
                // sai đường dẫn
                e.printStackTrace();
            }
        }
}
