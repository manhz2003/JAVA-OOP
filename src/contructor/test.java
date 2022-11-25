package contructor;

public class test {
    // CONTRUCTOR TRUYỀN DỮ LIỆU TRỰC TIẾP
    public static void main(String[] args) {
        // NHẬP THÔNG TIN
        person p = new person("Bùi Quang Trung", 19, "Tuyên Quang");

        // XUẤT THÔNG TIN
        System.out.println("Tên: "+p.getName());
        System.out.println("Tuổi: "+p.getAge());
        System.out.println("Địa chỉ: "+p.getAddress());
    }
    
}
