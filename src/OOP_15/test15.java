package OOP_15;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s;
            System.out.print("Nhập vào chuỗi: ");
            s = sc.nextLine();

            // hàm length() => lấy độ dài chuỗi
            System.out.println("Độ dài của chuỗi là: "+s.length());

            // hàm charAt (vị trí) => lấy ra index của từng kí tự trong chuỗi
            int doDai = s.length();
            for (int i = 0; i < doDai; i++) {
                System.out.println("vị trí "+i +" là: "+s.charAt(i));
            }
        }
    }
}
