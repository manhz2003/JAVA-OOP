package OOP_19;

public class sinhVien implements Comparable <sinhVien>{
    private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;

    public sinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
   
    // hàm lấy ra tên
    public String getTen() {
		String s = this.hoVaTen.trim();
		if(s.indexOf(" ") >= 0) { // tìm nếu có các khoảng trắng trong chuỗi thì
			int vt = s.lastIndexOf(" "); // thực hiện tìm khoảng trắng cuối cùng trong chuỗi
			return s.substring(vt+1); // cắt chuỗi từ vị trí sau khoảng trắng đến hết chuỗi -> tìm thấy tên
		}else {
			return s; // nếu không có khoảng trắng nào => chính là tên
		}
	}

    // hàm so sánh 2 chuỗi, sắp xếp tên theo thứ tự
    @Override
    public int compareTo(sinhVien o) {
        String tenThis = this.getTen();
		String tenO = o.getTen();
		return tenThis.compareTo(tenO);
    }

    // hàm sắp xếp theo mã sinh viên
    // @Override
    // public int compareTo(sinhVien o) {
	// 	return this.maSinhVien - o.maSinhVien;
    // }
}