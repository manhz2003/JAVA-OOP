/*PACKAGE GÓI TRONG JAVA
    - Gói có thể coi như 1 thư mục dùng để nhóm các lớp có liên quan đến nhau lại một nơi
    - Sử dụng gói cho phép tránh xung đột về tên lớp khi trong project có nhiều lớp cùng tên
    - Có 2 loại package trong java
                                + Được xây dựng sẵn
                                + Do người lập trình tự định nghĩa
    - Mỗi lớp thường sẽ thuộc về 1 package nào đó
    - Để sử dụng 1 class nào đó ta phải import package chứa nó vào file chương trình
 */


package OOP_4;
import java.util.Scanner; //thêm lớp scanner từ gói package util
public class main4 {
     public static void main(String[] args) {
        System.out.print("Nhập vào họ tên của bạn: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("tên của bạn là: "+ name);
     }
    
}
