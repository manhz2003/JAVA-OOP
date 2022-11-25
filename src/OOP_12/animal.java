package OOP_12;

public interface animal {
    // Mọi thứ trong interface đều là public
    // interface có thể được coi là cha của mọi lớp

    // có thể khai báo 1 hằng số trong interface
    public static int hangSo = 10;
    
    public abstract void eat (); 
    void move(); // phương thức trong interface được ngầm định là abstract

}