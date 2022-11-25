package OOP_19;
public class test19 {
    public static void main(String[] args) {
        sinhVien sv1 =new sinhVien(150, "Tran Van Thanh", "Lop 1", 9);
		sinhVien sv2 =new sinhVien(160, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
		sinhVien sv3 =new sinhVien(199, "Nguyen Van An", "Lop 2", 8);
				
		// > 0 => lớn hơn => xếp sau
		// < 0 => nhỏ hơn => xếp trước
		// = 0 => bằng

		// in ra kết quả so sánh các chuỗi
		System.out.println(sv1.compareTo(sv2)); // nếu ra 1 số lớn hơn 0 => xếp phía sau
		System.out.println(sv3.compareTo(sv1)); // nếu ra 1 số nhỏ hơn 0 => xếp phía trước

		// in ra tên của sinh viên
		System.out.println("tên của sinh viên là: "+sv1.getTen());
    }
}