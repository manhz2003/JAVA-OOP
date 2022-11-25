/*PHƯƠNG THỨC toString()
    - là một phương thức ghi đè, trả về 1 chuỗi
    - tránh phải viết code dài dòng
 */

/* PHƯƠNG THỨC equals() 
   - Là 1 phương thức so sánh của 1 lớp object
   - Sử dụng để kiểm tra xem 2 đối tượng có bằng nhau k
   - ví dụ: so sánh đối tượng A vs đối tượng A xem có bằng nhau k, nếu A so sánh vs B thì = false
   - Ta có thể override phương thức này:
               + kiểm tra hai đối tượng có là 1 hay không ?
               + kiểm tra đối tượng thứ 2 có là null không ?
               + kiểm tra kiểu của 2 đối tượng có giống nhau ?
               + ép kiểu đối tượng thứ 2 và so sánh các tiêu chí mong muốn
*/

// các phương thức trên đều gọi nhanh bằng cách mở trong source action

package OOP_10;

import java.util.Scanner;

public class main10 {
	public static void main(String[] args) {
		myDate md1 = new myDate(15, 5, 2025);
		myDate md2 = new myDate(11, 1, 2021);
		myDate md3 = new myDate(11, 1, 2021);

		// toString()
		// sau khi ghi đè phương thức toString bên class myDate ta có thể in trực tiếp
		// đối tượng md
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);

		// nếu không có phương thức toString ta sẽ phải viết như dòng 36 tại hàm main,
		// và xuất ra thông qua hàm getter, gây dài dòng.
		System.out.printf("day = %d, month = %d, year = %d\n", md1.getDay(), md1.getMonth(), md1.getYear());

		// equals()
		// khi so sánh 2 đối tượng phải sử dụng phương thức equals()
		// không thể so sánh 2 đối tượng bằng toán tử == , chỉ sử dụng toán tử == khi so sánh số hoặc kiểu dữ liệu nguyên thủy
		System.out.println("so sánh đối tượng md1 và md2: " + md1.equals(md2)); // false
		System.out.println("so sánh đối tượng md2 và md3: " + md2.equals(md3)); // true

	}
}
