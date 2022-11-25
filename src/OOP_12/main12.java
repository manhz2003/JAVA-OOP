/* INTERFACE
    - Là 1 kiểu dữ liệu tham chiếu trong java
    - Là tập hợp các phương thức abstract
    - Khi 1 class implements 1 interface thì sẽ kế thừa những abstract của interface đó
    * 1 số đặc điểm
        - Không thể khởi tạo, nên không có phương thức khởi tạo
        - Tất cả phương thức trong interface luôn ở dạng public abstract mà không cần khai báo
        - Các thuộc tính trong interface luôn ở dạng public static final mà không cần khai báo, yêu cầu phải có giá trị
    * Mục đích của interface:
        Là để thay thế đa kế thừa lớp của những ngôn ngữ khác(ví dụ C++, python ...), ngoài ra, interface sẽ giúp
        đồng bộ và thống nhất trong việc phát triển hệ thống trao đổi thông tin.

        * 1 lớp kế thừa lại từ interface sử dụng từ khóa implements
        * Lợi ích:
                + giúp đạt được tính đa kế thừa
                + đạt được tính trừu tượng hoàn toàn
                + muốn chỉ ra 1 hành động cụ thể nào cần thực hiện nhưng k quan tâm lớp nào sẽ thực hiện nó
 */
package OOP_12;
public class main12 {
    public static void main(String[] args) {
        animal dog = new dog();
        dog.eat();
        dog.move();
    }
}
