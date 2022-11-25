package OOP_3;

public class nhanVien {
    private String name;
    private int age;
    private String dayMonthYear;
    private int ngayCong;
    private int heSo;

    // Phương thức khởi tạo contructor
    public nhanVien(String name, int age, String dayMonthYear, int ngayCong, int heSo) {       
        this.name = name;
        this.age = age;
        this.dayMonthYear = dayMonthYear;
        this.ngayCong = ngayCong;
        this.heSo = heSo;
        // từ khóa this để tham chiếu tới thuộc được tạo từ lớp
        // name bên trái là thuộc tính, name bên phải là tham số
        // name bên phải mang giá trị mặc định như: int = 0; float = 0.0f; double = 0.0d; String = null....
        // gán giá trị name mặc định cho this.name là giá trị hiện hành của thuộc tính
    } 

    // tạo getter và setter
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

    public String getDayMonthYear() {
        return dayMonthYear;
    }

    public void setDayMonthYear(String dayMonthYear) {
        this.dayMonthYear = dayMonthYear;
    } 

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public void salary (){
        int salary = ngayCong * heSo;
        System.out.printf("Lương của nhân viên là: %d vnđ", salary);
    }
}
