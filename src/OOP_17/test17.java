/* Các hàm
 * indexOf()     => hàm tìm kiếm chuỗi
 * lastIndexOf() => tìm kiếm ngược lại từ phải sang trái
 */
package OOP_17;

public class test17 {
    public static void main(String[] args) {
        String s1 = "xin chào các bạn, xin chào các em";
        String s2 = "xin chào";
        String s3 = "xin chào 123";
        char c = 'á';
        
        // hàm indexOf() => hàm tìm kiếm chuỗi               
        System.out.println(s1.indexOf(s2)); // nếu kết quả >= 0 => tìm thấy
        System.out.println(s1.indexOf(s3)); // nếu kết quả là số âm => k tìm thấy

        // tìm kiếm từ vị trí khác vị trí đầu
        System.out.println("Vị trí của chuỗi 'xin chào' trong s1 từ phải sang trái là: "+s1.indexOf(s2));

        // tìm kiếm kí tự char
        System.out.println("Vị trí kí tự á trong s1 là: "+s1.indexOf(c));

        // lastIndexOf() => tìm kiếm ngược lại từ phải sang trái
        System.out.println("Vị trí của chuỗi 'xin chào' trong s1, tìm từ trái sang phải là: "+ s1.lastIndexOf(s2));
    }
}
