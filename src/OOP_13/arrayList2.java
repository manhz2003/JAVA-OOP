/*ARRAY LIST PAST 2
    + addAll : Hợp 2 tập hợp
    + removeAll : Hiệu 2 tập hợp
    + retainAll : Giao 2 tập hợp
    + boolean containsAll : Kiểm tra sự tồn tại
    + toArray(T[]) : Chuyển đổi sang mảng

    * Lớp tiện ích Collections cung cấp các hàm tiện ích hỗ trợ việc xử lý ArrayList
    + int binarySearch (List list, Object key) : Tìm kiếm theo thuật toán chia đôi
    + void fill (List list, Object value) : Gán giá trị cho tất cả phần tử 
    + void shuffle (List list) : Hoán vị ngẫu nhiên
    + void sort (List list) : Sắp xếp tăng dần
    + void reverse (List list) : Đảo ngược
    + void rotate (List list, int distance) : Xoay vòng
    + void swap(List list, int i, int j) : Tráo đổi
 */
package OOP_13;

import java.util.*;

public class arrayList2 {
    public static void main(String[] args) {
        ArrayList test1 = new ArrayList();
        test1.add(3);
        test1.add(4);

        ArrayList test2 = new ArrayList();
        test2.add(4);
        test2.add(5);

        test1.addAll(test2); // thêm các phần tử từ test2 vào test 1
        System.out.println(test1);

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(9);
        a.add(8);
        a.add(2);

        Collections.swap(a, 0, 2);
        Collections.shuffle(a);
        Collections.sort(a);
        Collections.reverse(a);

        /*Collections.sort(ArrayList, Comparator) //bổ sung tiêu chí so sánh cho các phần tử. Cách này thường áp dụng cho các lớp do người dùng 
        định nghĩa (NhanVien, SinhVienPoly...) */
    }
}
