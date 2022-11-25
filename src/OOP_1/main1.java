package OOP_1;

public class main1 {
    public static void main(String[] args) {
        // khởi tạo đối tượng tom từ class cat
        cat tom = new cat();

        // khởi tạo các thuộc tính từ class cat
        tom.name = "Tom";
        tom.age = 6;
        tom.run(); // gọi hàm
        tom.eat(); // gọi hàm
        System.out.println("cat's name: " + tom.name);
        System.out.println("------------------------------");

        // có thể tạo nhiều đối tượng từ 1 class
        cat tom2 = new cat();
        tom2.weight = 2.4f;
        tom2.color = "white";
        tom2.weight();
        tom2.color();
    }
}