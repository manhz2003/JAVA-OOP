/** GHI ĐÈ PHƯƠNG THỨC (OVERRIDE)
    - Chỉ xuất hiện trong mối quan hệ kế thừa/ thực thi interface
    - Cho phép lớp con định nghĩa lại một chức năng đã có ở lớp cha, để phù hợp với lớp con
    - Ghi đè chỉ áp dụng với phương thức, mục đích, tham số truyền vào, tên của phương thức k thay đổi.
    - Chỉ thay đổi nội dung của phương thức, giá trị trả về phải giống nhau
    + ví dụ: cùng 1 phương thức di chuyển, con người đi bộ, con cá bơi, con chim bay, con sâu bò....

    * Bật override = Chuột phải chọn Source action -> Override
 */
package OOP_9;

public class main9 {
    public static void main(String[] args) {
        bird bird = new bird("họa mi", 2);
        System.out.println("name: "+bird.name);
        System.out.println("weight: "+bird.weight);
        bird.move();
        System.out.println("----------------------------");
        fish fish = new fish("pro", 1);
        System.out.println("name: "+fish.name);
        System.out.println("weight: "+fish.weight);
        fish.move();
    }
}

