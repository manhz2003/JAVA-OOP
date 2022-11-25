package OOP_7;

public class conNguoi extends dongVat {
    private String speak;

    public conNguoi(String name, int age, String address, float weight, String speak) {
        super(name, age, address, weight);
        this.speak = speak;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

}
