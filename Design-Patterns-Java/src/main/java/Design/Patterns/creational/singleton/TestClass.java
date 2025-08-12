package Design.Patterns.creational.singleton;

public class TestClass {

    public static void main(String[] args) {
//        Mouse m = new Mouse();
//        System.out.println("the hash code of object  m is : "+m.hashCode());
//
//        Mouse m2 = new Mouse();
//        System.out.println("the hash code of object  m2 is : "+m2.hashCode());
//        Mouse m = Mouse.mouse;
//        System.out.println("the hash code of object  m is : "+m.hashCode());
//
//        m.price=10;
//        m.model="wireless";
//        System.out.println(m);
//
//        Mouse m2 = Mouse.mouse;
//        System.out.println("the hash code of object  m2 is : "+m2.hashCode());
//        m2.price=11;
//        m2.model="wired";
//
//        System.out.println(m2);

//        Mouse m = Mouse.mouse;
//       System.out.println("the hash code of object  m is : "+m.hashCode());

        LazySingleton obj1 = LazySingleton.getInstance();
        System.out.println("hashcode of obj1 : " + obj1.hashCode());

        LazySingleton obj2 = LazySingleton.getInstance();
        System.out.println("hashcode of obj2 : " + obj1.hashCode());




    }
}
