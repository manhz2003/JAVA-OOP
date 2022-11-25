package OOP_3;

import java.util.Scanner;

public class main3b {
    // Hàm contructor nhập dữ liệu từ bàn phím
    public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);    

    System.out.print("nhập vào tên: ");
    String ten = sc.nextLine();
    System.out.print("nhập vào tuổi: ");
    int tuoi = sc.nextInt();
    System.out.print("nhập vào ngày sinh: ");
    String dayMonthYear = sc.nextLine(); sc.nextLine();
    System.out.print("nhập vào công: ");
    int ngayCong = sc.nextInt();
    System.out.print("nhập vào hệ số lương: ");
    int heSo = sc.nextInt();

    nhanVien nv = new nhanVien(ten, tuoi, dayMonthYear, ngayCong, heSo);
    System.out.println("Tên: "+nv.getName()+"\ntuổi: "+nv.getAge()+"\nngày sinh: "+
    nv.getDayMonthYear()+"\nngày công: "+nv.getNgayCong()+"\nhệ số lương: "+nv.getHeSo());
    
    nv.salary();
    }  
}
