/* TÍNH CHẤT KẾ THỪA (EXTEND)
    - Cho phép tái sử dụng, tận dụng các lớp đã có để tạo ra lớp mới.
    - Sử dụng từ khóa extends.
    - Các lớp được lớp khác kế thừa gọi là lớp cha.
    - Các lớp mà kế thừa từ lớp cha gọi là lớp con.
    - java chỉ có tính đơn kế thừa, mỗi lớp con chỉ kế thừa 1 lớp cha duy nhất.
    - lớp cha có thể có nhiều lớp con, nhưng lớp con chỉ có 1 lớp cha.
    - Có thể chia sẻ hay mở rộng các đặc tính sẵn có mà không phải tiến hành định nghĩa lại.
 */

 /* CÁC TÍNH CHẤT KẾ THỪA
  * 1. đơn kế thừa (1 lớp con kế thừa 1 lớp cha) | động vật - con người
  * 2. kế thừa phân cấp (các lớp khác nhau cùng kế thừa chung 1 lớp cha) | động vật: con chó, con mèo, con gà....
  ^ 3. kế thừa đa cấp (lớp con kế thừa cha, cháu kế thừa con) | động vật - con người - nhân viên
  */
/*PROTECTED
    - Là thành phần thường được sử dụng trong mối quan hệ kế thừa
    - cho phép các lớp con có thể truy xuất trực tiếp vào các thành phần đó
 */

 /*từ khóa supper
  1. Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất.
  2. super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
  3. Từ khóa super được sử dụng để gọi trực tiếp phương thức của lớp cha.
  */

// 1 lớp không kế thừa lại từ 1 lớp khác được gọi là lớp object, ví dụ như lớp animal, main...
// Lớp object có 1 số phương thức hay được sử dụng như equals, toString ...

// ví dụ về đơn kế thừa phân cấp.
package OOP_6;

public class main6 {
    public static void main(String[] args) {
        dog d1 = new dog("micky", 1, 2.4);
        System.out.printf("name: %s \nage: %d \nweight %f kg\n", d1.name, d1.age, d1.weight);
        d1.speak("Gâu gâu !");
        System.out.println("--------------------------------");

        cat c1 = new cat("tom", 2, 1.2);
        System.out.printf("name: %s \nage: %d \nweight %f kg\n", c1.name, c1.age, c1.weight);
        c1.speak("meo meo !");
        System.out.println("--------------------------------");

        bird b1 = new bird("họa mi", 1, 0.4);
        System.out.printf("name: %s \nage: %d \nweight %f kg\n", b1.name, b1.age, b1.weight);
        b1.speak("chíp chíp !");
        System.out.println("--------------------------------");
    }
}