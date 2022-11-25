package OOP_7;

public class hocSinh extends conNguoi {
    private String school;

    public hocSinh(String name, int age, String address, float weight, String speak, String school) {
        super(name, age, address, weight, speak);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void diemTb(double diemMontoan, double diemMonvan, double diemMonanh) {
        double diemTb = (diemMonanh + diemMontoan + diemMonvan) / 3;
        System.out.println("điểm trung bình của học sinh là: " + diemTb);
    }
}
