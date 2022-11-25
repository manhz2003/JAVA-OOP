package OOP_7;

import java.util.jar.Attributes.Name;

// ví dụ về kế thừa đa cấp
public class main7 {
    public static void main(String[] args) {
        // đối tượng học sinh được kế thừa từ động vật và con người
        // tạo đối tượng học sinh từ lớp con người
        conNguoi hs = new hocSinh("Nguyễn Thế Mạnh", 19, "Hà Nội", 58, "say hello !", ""); 
        
        // thuộc tính school chỉ xuất hiện ở lớp học sinh nên cần tạo riêng 1 đối tượng học sinh
        hocSinh hs_school = new hocSinh(null, 0, null, 0, null, "EAUT");
        
        System.out.println("name: "+hs.getName());
        System.out.println("age: "+hs.getAge());
        System.out.println("address: "+hs.getAddress());
        System.out.println("weight: "+hs.getWeight());
        System.out.println("speak: "+hs.getSpeak());
        System.out.println("school: "+hs_school.getSchool());
        hs_school.diemTb(8, 7.5, 9);
        
    }
}
