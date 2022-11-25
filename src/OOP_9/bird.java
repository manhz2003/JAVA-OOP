package OOP_9;

public class bird extends animal {
    public bird(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void move() {
        System.out.println("flying birds ....");
    }   
}
