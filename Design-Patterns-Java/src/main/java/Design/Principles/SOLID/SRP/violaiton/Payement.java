package Design.Principles.SOLID.SRP.violaiton;


/**
 *
 * Single Responsibility Principle - A unit should sole and single responsibility
 *
 * Here we are using Payment class for both pay() and refund() which is violating SRP */
public class Payement {

    public void pay(){
        System.out.println("Payment is done");
    }

    // removing this would help as it violates SRP
    public void refund(){
        System.out.println("Refund is issued");
    }
}
