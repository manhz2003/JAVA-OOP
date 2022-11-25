/* FINAL
    - Được sử dụng phổ biến trong việc tạo ra các hằng số, cấm kế thừa, ghi đè
    - Ví dụ điển hình: lớp math, lớp String là các final class (chỉ sử dụng, không thể kế thừa)
    - Để tạo các hằng số,ta thêm final vào trước kiểu trả về của biến / thuộc tính
    - Để tạo các lớp không thể kế thừa, ta thêm final vào trước keyword class
    - Để cấm override, thêm final vào trước kiểu trả về của phương thức
 */
package OOP_14;

public class main14 {
    public static void main(String[] args) {
        
    }

    // class có keyword final, k lớp nào được phép kế thừa
    public final class father{

        public final void move (){
            // phương thức final, các lớp con k được phép kế thừa
        }

        public void aet(){
            final int MAX = 120;
            // MAX = 600 , không thể thay đổi giá trị của final
        }
        
    }

}
