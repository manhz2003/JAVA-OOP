/* LỚP VÀ ĐỐI TƯỢNG
- Mọi thứ trong java đều được đặt trong các Lớp
- lớp là khuôn mẫu để tạo ra các sản phẩm là các đối tượng
- Các đối tượng là sản phẩm cụ thể sinh ra từ 1 lớp nào đó
- Mỗi lớp sẽ chứa:
                + Các đặc điểm đặc trưng thể hiện qua thuộc tính của lớp
                + Các hành vi, thể hiện thông qua các phương thức của lớp             
 */
package OOP_1;
public class cat {
    // khai báo (property)
    public String name;
    public int age;
    public float weight;
    public String color;

    // khởi tạo các (method)
    public void speak() {
        System.out.println(name + " is speaking !");
    }

    public void run() {
        System.out.println(name + " is running !");
    }

    public void eat() {
        System.out.println(name + " is eating !");
    }

    public void weight() {
        System.out.printf("weight of tom 2: %.2f kg !", weight);
    }

    public void color() {
        System.out.printf("\ncolor of tom 2: %s !", color);
    }
}
