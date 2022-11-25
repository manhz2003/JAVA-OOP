package OOP_9;

public class fish extends animal{

    
    public fish(String name, float weight) {
        super(name, weight);
    }
    
    @Override
    public void move() {       
        // super.move(); , tham chiếu đến lớp cha, nếu k dùng có thể bỏ đi
        System.out.println("the fish is swimming....");
    }
}