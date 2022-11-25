package OOP_7;

public class dongVat {
    private String name;
    private int age;
    private String address;
    private float weight;
    
    public dongVat(String name, int age, String address, float weight) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.weight = weight;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void eat (){
        System.out.println("eating ...");
    }
}
