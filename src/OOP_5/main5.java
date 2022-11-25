/* CÁC THÀNH PHẦN STATIC
    - có thể sử dụng trực tiếp mà không cần đến đối tượng
    - thành phần static bắt đầu bởi từ khóa static
    - tạo các lớp static, các phương thức, các khối static
    - đây là các thành phần chia sẻ chung cho tất cả các đối tượng của lớp chứa nó
    - giá trị của các biến static được sinh ra mà khởi tạo giá trị tại lần đầu tiên được load
    - ví dụ như phương thức main, math ...
 */

package OOP_5;
public class main5 {
    // có thể tự tạo các giá trị static
    public class test{
        public static int id = 1212;
        public static String name = "manh";
    }

    public static void main(String[] args) {
        int a = Math.min(10, 11); // ví dụ về thành phần thuộc static
        System.out.println(a);
     
    }
}
