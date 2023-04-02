class Main {
    int x;
    public SuperClass(int x) {
        this.x = x;
    }
}

class SubClass extends SuperClass {
    int x;
    public SubClass(int x, int y) {
        super(x);
        this.x = y;
    }
    public void display() {
        System.out.println("Value of x in SuperClass: " + super.x);
        System.out.println("Value of x in SubClass: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100, 200);
        obj.display();
    }
}