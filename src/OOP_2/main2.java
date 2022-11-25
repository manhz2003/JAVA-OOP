/* TÍNH ĐÓNG GÓI DỮ LIỆU
- Các thuộc tính thường để private
- Các phương thức vận hành dựa trên các thuộc tính của lớp để public
- Thuộc tính của lớp nào thì chỉ lớp đó có quyền trực tiếp quản lý, lớp khác hoặc bên
  ngoài phạm vi lớp muốn sử dụng, sửa đổi các thuộc tính thì phải thông qua các thành phần public
 => ẩn giấu thông tin, dễ dàng kiểm soát

* PHƯƠNG THỨC GETTER VÀ SETTER
get và set đóng vai trò là "cổng" vào và cổng ra cho data.
-> chức năng cho phép truy cập và sửa đổi data.
+ get -> cổng ra của dữ liệu
+ set -> cổng vào của dữ liệu
+ get: lấy thông tin ra
+ set: cài đặt và sửa đổi thông tin

* Cách tạo nhanh set và get
b1: chuột phải vào đoạn code 
b2: chọn source action...
b3: chọn generate getter and setter

* cách tạo nhanh hàm contructor : 
b1: chuột phải vào đoạn code 
b2: chọn source action...
b3: chọn generate contructor
 */

package OOP_2;

public class main2 {
     public static void main(String[] args) {
          student s1 = new student();
          // gọi đến phương thức set để thiết lập
          s1.setAddress("Hà Nội");
          s1.setName("IT3");
          s1.setAge(19);
          s1.setPhone("0987739823");

          // gọi đến phương thức get để in ra
          System.out.println("tên: " + s1.getAddress());
          System.out.println("địa chỉ: " + s1.getAddress());
          System.out.println("tuổi: " + s1.getAge());
          System.out.println("số điện thoại: " + s1.getPhone());
     }
}
