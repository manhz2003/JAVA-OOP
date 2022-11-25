package contructor;

import java.util.Scanner;

public class test1 {
    // CONTRUCTOR NHẬP DỮ LIỆU TỪ BÀN PHÍM
    public static void main(String[] args) {
        // TẠO ĐỐI TƯỢNG SCANNER
        Scanner sc = new Scanner(System.in);

        // NHẬP THÔNG TIN
        System.out.println("Họ và tên: ");
        String name = sc.nextLine();

        System.out.println("tuổi: ");
        int age = sc.nextInt();

        System.out.println("Địa chỉ: ");
        String address = sc.nextLine();

        // TẠO ĐỐI TƯỢNG
        person p = new person(name, age, address);

        // XUẤT THÔNG TIN
        System.out.println("Tên: "+p.getName());
        System.out.println("Tuổi: "+p.getAge());
        System.out.println("Địa chỉ: "+p.getAddress());
    }
}

