package OOP_22;
// có truyền Generic kiểu T
public class testGeneric<T> {
    private T value;

    public testGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
}
