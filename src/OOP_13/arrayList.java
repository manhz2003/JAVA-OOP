/* ARRAY LIST (mảng động)
    - Nhược điểm của kiểu mảng là số lượng phần tử cố định k thể thay đổi.
    - ArrayList là một phần của Collection framework và được chứa trong gói java.util.
    - ArrayList cung cấp nhiều thao tác có sẵn, không cần thiết phải khai báo kích thước.
    - Ta có thể thực hiện các hành động thêm, chèn, xóa, ... các phẩn tử trong ArrayList.
    - Một ArrayList có thể chứa nhiều loại đối tượng như Integer, String, Scanner, hay một đối tượng do người dùng tự khai báo.

    - ArrayList contructor
    - ArrayList arr = new ArrayList(); // đây là contructor được sử dụng phổ biến, nó trả về kết quả là một một mảng rỗng.
    - ArrayList arr = new ArrayList(new LinkedList()); // (ArrayList(Collection c))
    - ArrayList arr = new ArrayList(9); // sử dụng trong tường hợp người dùng đã xác định được lượng dữ liệu cần thêm vào mảng.

    * Các phương thức trong ArrayList
        + add(Object) : Thêm vào cuối
        + dd(int index, Object elem) : Chèn thêm phần tử vào vị trí
        + remove(Object) : Xóa phần tử
        + remove(int index) : Xóa và nhận phần tử tại vị trí
        + void clear() : Xóa sạch
        + set(int index, Object elem) : Thay đổi phần tử tại vị trí
        + get(int index) : Truy xuất phần tử tại vị trí
        + int size() : Số phần tử
        + contains(Object) : Kiểm tra sự tồn tại
        + isEmpty() : Kiểm tra rỗng
        + int indexOf(Object elem) : Tìm vị trí phần tử 
 */

package OOP_13;
// cần import arraylist trong gói util để sử dụn
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        // có thể truyền kiểu dữ liệu vào <>, nếu bỏ trống sẽ là object, phải ép kiểu   
        ArrayList<String> a = new  ArrayList<String>();
        a.add("Mạnh");
        a.add("Dũng");
        a.add("Long");
        a.add("Nam");

        // cách duyệt mảng
        for(int i = 0; i < a.size(); i++){
            String x = a.get(i);
            System.out.println(x);
        }

        // cách duyệt mảng bằng forEach
        for (String x : a) {
            System.out.println(x);
        }
    }
}
