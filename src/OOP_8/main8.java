/**NẠP CHỒNG PHƯƠNG THỨC (OVERLOADING) 
    - tạo ra các hàm giống nhau về chức năng, nhưng khác nhau về kiểu dữ liệu
    + có thể nạp chồng các phương thức static
    + phải giống nhau về kiểu trả về
    + phải giống nhau về tên hàm
    + phải giống nhau về giá trị trả về
    + khác nhau về kiểu dữ liệu truyền vào

    ví dụ: tính tổng 2 số nguyên, 2 số thưc, 1 số nguyên vs 1 số thực, ......  
*/

package OOP_8;

public class main8 {   
        // overloading cho các phương thức static
        public static int sum(int a, int b) {
            return a + b;
        }

        public static float sum(float a, float b) {
            return a + b;
        }

        public static double sum(Double a, Double b, double c) {
            return a + b;
        }

        // overloading cho các phương thức không phải static
        public int phepTru (int x, int y){
            return x - y;
        }

        public double phepTru (Double x, Double y){
            return x - y;
        }

    public static void main(String[] args) {
        // overloading cho phương thức static, k cần khởi tạo đối tượng
       int sumInt = sum(19, 11);
       double sumDouble = sum(1.0, 1.2, 2.2);
       double sumFloat = sum(1.0, 1.2, 2.2);
       System.out.println("sum of int: "+ sumInt);

    // overloading cho phương thức không phải staic, cần phải tạo đối tượng
        main8 overloading = new main8();
        int ovInt = overloading.phepTru(10, 8);
        double ovDouble = overloading.phepTru(8.5, 3.2);
        System.out.println(ovDouble);
    }
}
