package OOP_9;

public class animal {
    // sử dụng protected để lớp con kế thừa mà k cần public, k cần setter và getter
    // protected chỉ có tác dụng trong lớp kế thừa, các lớp bên ngoài muốn sử dụng phải tạo get và set
    // nếu sử dụng private cần tạo các phương thức getter và setter để sử dụng bên ngoài
    protected String name; 
    protected float weight;

    public animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public void move() {
        System.out.println("Animal is moving ...");
    }
}
