package creational.prototype;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrototypeTest {

    public static void main(String[] args) {
        ComputerFactory c1 =new Laptop("HP", "probook",98);
        System.out.println(c1);
        ComputerFactory c2 = c1.copy();
        c2.company="Lenovo";
        c2.model="ThinkPad";
        System.out.println(c2);
        System.out.println(c1.equals(c2));

        //creating a list of computers
        List<ComputerFactory> laptopList = IntStream
                .rangeClosed(0,5)
                .mapToObj(i ->{
                    return c1.copy();
                })
                .collect(Collectors.toList());
    }
}

/*
* When to Use:
When the cost of creating a new object is high (e.g., heavy initialization, expensive resources).
When you need to create many similar objects dynamically.
When you want to reduce the number of classes in an application by reusing existing objects through cloning.
* */
