/* Các hàm
 * equals()              => so sánh 2 chuỗi giống nhau, phân biệt dấu, viết hoa
 * equalsIgnoreCase()    => so sánh 2 chuỗi, không phân biệt viết hoa
 * compareTo()           => so sánh > < =
 * compareToIgnoreCase() => tương tự hàm compareTo nhưng không phân biệt hoa, thường
 * regionMatches()       => so sánh 1 đoạn
 * startWith()           => hàm kiểm tra các kí tự bắt đầu của chuỗi
 * endWith()             => hàm kiểm tra các kí tự cuối của chuỗi
 */
package OOP_16;

public class test16 {
    public static void main(String[] args) {
        String s1 = "mạnh";
        String s2 = "Mạnh";
        String s3 = "mạnh";

        // ví dụ bạn muốn check thông tin người dùng nhập vào có trùng với dữ liệu trong database
        // hàm equals() => so sánh 2 chuỗi giống nhau, phân biệt dấu, viết hoa
        System.out.println("S1 bằng s2: " + s1.equals(s2));
        System.out.println("S1 bằng s3: " + s1.equals(s3));

        // hàm equalsIgnoreCase() => so sánh 2 chuỗi, không phân biệt viết hoa
        System.out.println("S1 bằng s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("S1 bằng s3: " + s1.equalsIgnoreCase(s3));

        // hàm compareTo() => so sánh > < =
        // hàm compareToIgnoreCase() => tương tự hàm compareTo nhưng không phân biệt hoa, thường
        String sv1 = "Nguyễn Văn A";
        String sv2 = "Nguyễn Văn B";
        String sv3 = "Nguyễn Văn";
        String sv4 = "Nguyễn Văn A";

        System.out.println("sv1 so sánh sv2: " + sv1.compareTo(sv2)); // giá trị dương: lớn hơn '>'
        System.out.println("sv1 so sánh sv3: " + sv1.compareTo(sv3)); // giá trị âm: nhỏ hơn '<'
        System.out.println("sv1 so sánh sv4: " + sv1.compareTo(sv4)); // số 0: bằng nhau '='

        // hàm regionMatches() => so sánh 1 đoạn
        String r1 = "Nguyễn Văn Long";
        String r2 = "Nguyễn Văn A";
        boolean check = r1.regionMatches(false, 7, r2, 7, 3);
        System.out.println(check);
        // toffset: vị trí index bắt đầu của chuỗi r1
        // ooffset: vị trí index bắt đầu của chuỗi r2
        // len: số kí tự cần so sánh của r1 với r2
        // ignoreCase: true = được phép viết hoa, false = không được phép viết hoa

        // hàm startWith() => hàm kiểm tra các kí tự bắt đầu của chuỗi
        // ví dụ: kiểm tra nhà mạng thuê bao nào ?
        String sdt = "0987739823";
        System.out.println(sdt.startsWith("098"));
        System.out.println(sdt.startsWith("395"));

        // hàm endWith() => hàm kiểm tra các kí tự cuối của chuỗi
        // ví dụ: kiểm tra file ảnh có phải JPG

        String tenFile = "i love you.JPG";
        String tenFile2 = "học java.PDF";

        if (tenFile.endsWith("JPG")) {
            System.out.println("đây là file hình ảnh !");
        } else if (tenFile.endsWith("PDF")) {
            System.out.println("đây là file pdf !");
        }
       
    }
}
