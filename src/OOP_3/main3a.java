/* PHƯƠNG THỨC KHỞI TẠO CONTRUCTOR
    - Còn được gọi là hàm khởi tạo, là một phương thức đặc biệt được gọi tới khi tạo đối tượng
    - Kiến tạo đối tượng với những thông tin bao đầu nào đó
    - Mỗi lớp luôn có một phương thức khởi tạo mặc định bên trong nó
    - Phương thức khởi tạo không có kiểu trả về và luôn có dấu hiệu nhận diện giống như tên của lớp
    - Mỗi lớp có thể có bao nhiêu phương thức khởi tạo tùy thích
 */

package OOP_3;

public class main3a {
    // hàm contructor truyền dữ liệu trực tiếp
    public static void main(String[] args) {
        nhanVien nv1 = new nhanVien("Mạnh", 19, "05/03/2003,", 100000, 15);
        System.out.println("Tên của nhân viên là: "+ nv1.getName());
        System.out.println("Tuổi của nhân viên là: "+ nv1.getAge());
        System.out.println("Ngày sinh của nhân viên là: "+ nv1.getDayMonthYear());
        nv1.salary();
    }
}
