/* LỚP TRỪU TƯỢNG (ABSTRACT)
    - Khai báo với keyword abstract.
    - 1 class trừu tượng thường chứa 1 hoặc nhiều phương thức abstract.
    - Lớp abstract cho phép thực hiện kế thừa nhưng không cho phép tạo mới 1 đối tượng.
    - Phương thức abstract là phương thức chỉ khai báo, không định nghĩa.
    - Việc thực hiện cụ thể sẽ do các lớp con đảm nhiệm.
    - Các lớp extend từ lớp abstract sẽ ghi đè lại phương thức đó và thực thi.
    - Có thể chứa cả các các phương thức đã được định nghĩa và các thuộc tính, các trường static.
    - Mục đính sử dụng: ẩn giấu các cách thức thực thi cụ thể.   
 */

package OOP_11;

public class main11 {
   public static void main(String[] args) {
     // A a = new A(); -> k thể tạo mới 1 đối tượng từ abstract class

    A b = new B(""); // hợp lệ
    B b1 = new B("Mạnh"); // hợp lệ
    System.out.println("name: "+b1.getName());
    b1.eat();

   }
}
