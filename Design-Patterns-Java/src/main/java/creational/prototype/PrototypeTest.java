package creational.prototype;

public class PrototypeTest {

    public static void main(String[] args) {
        Computer c1 =new Laptop("HP", "probook",98);
        System.out.println(c1);
        Computer c2 = c1.copy();
        c2.company="Lenovo";
        c2.model="ThinkPad";
        System.out.println(c2);
        System.out.println(c1.equals(c2));
    }
}
