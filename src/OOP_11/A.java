package OOP_11;

// 1 abstract class vẫn có thể khai báo như 1 class bình thường
public abstract class A {
    private String name; 

    // 1 phương thức abstract chỉ dùng để khai báo, việc thực hiện sẽ được lớp kế thừa ghi đè và thực thi
    public abstract void eat();

    // vẫn có thể tạo contructor
    public A(String name) {
        this.name = name;
    }

    // và tạo các phương thức get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
