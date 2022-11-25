/*Khái niệm genneric
    Generic giúp 1 đối tượng có các thuộc tính sử dụng được linh hoạt các kiểu
    dữ liệu mà không bị bó hẹp vào 1 kiểu khai báo duy nhất ở class.

    E- Element (được sử dụng rộng rãi bởi java collections)
    K - khóa
    V - Value
    T - Type (kiểu dữ liệu bất kì thuộc wrapper class: String, interger, long, float..)
    N - Number (kiểu số: int, float, double...)
 */
package OOP_22;

public class test22 {
    public static void main(String[] args) {

        // class này k sử dụng Generic nên chỉ có thể truyền vào dữ liệu cho biến là int
        box box = new box(5);
        System.out.println("Giá trị: "+box.getValue());


        // t1 được thay thế giá trị bằng kiểu Interger
        testGeneric t1 = new testGeneric<Integer>(15);
        System.out.println(t1.getValue());

        // t2 được sử dụng sang kiểu dữ liệu String
        testGeneric t2 = new testGeneric<String> ("hello");
        System.out.println(t2.getValue());

        // chuyển đổi linh hoạt qua lại giữa các kiểu dữ liệu
        t2 = new testGeneric<Double>(3.2);
    }
    
}
