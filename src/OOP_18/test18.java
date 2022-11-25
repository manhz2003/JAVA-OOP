/* Các hàm
 * concat()      => nối chuỗi
 * replace()     => thay thế
 * toLowerCase() => viết thường
 * toUpperCase() => viết hoa
 * trim()        => xóa khoảng trắng dư thừa ở đầu và cuối chuỗi
 * subString()   => cắt chuỗi con
 */
package OOP_18;

public class test18 {
    public static void main(String[] args) {
        String s1 = "mạnh";
        String s2 = " nguyễn";
        // hàm concat() => nối chuỗi
        String s3 = s1.concat(s2);
        System.out.println(s3);

        //  hàm replace() => thay thế
        //  regex: chuỗi cần thay thế
        //  replacement: chuỗi được thay thế
        String s5 = "lập trình php";
        String s6 = s5.replaceAll("php", "java");
        System.out.println(s6);

        // toLowerCase() => chuyển về viết thường
		// toUpperCase(=> chuyển về viết hoa
        String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		System.out.println(s7);
		System.out.println(s8);

        // trim() => xóa khoảng trắng dư thừa ở đầu và cuối chuỗi
		String s9 = "  Xin chào các bạn    ";
		System.out.println(s9.trim());

        //  subString() => cắt chuỗi con
        // beginIndex: vị trí bắt đầu cắt
        // endIndex: vị trí kết thúc cắt
        String s10 = "Xin chào các bạn";
        String s11 = s10.substring(10, 15);
        System.out.println(s11);
        String s12 = s10.substring(5); // cắt từ 5 đến hết chuỗi
        System.out.println(s12);
    }
}
