package OOP_3;

import java.util.Scanner;

public class main3c {
    // tạo contructor nhập từ bàn phím thông qua hàm setter
    private String name;
    private int age;

    public main3c(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhập tên: ");
        setName(sc.nextLine());
        System.out.println("Nhập tuổi: ");
        setAge(sc.nextInt());
    }

}
