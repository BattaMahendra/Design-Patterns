package Design.Principles.SOLID.DIP.Principle;

/**
 * High-level class depends only on the PaymentMethod interface.
 * It does NOT create its own dependencies — they're provided from outside (injection).
 */
public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    // Constructor injection — PaymentMethod can be any implementation
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        paymentMethod.pay(amount); // works for any PaymentMethod
    }
}

/**
 *
 * Practical tip:
 * If you see new SomeConcreteClass(); inside your business logic,
 * you might be violating DIP — prefer Dependency Injection instead.*/

/**
 *
 * Core essence
 *
 *  DIP - Dependency Inversion Principle
 *
 *  There are 2 principles
 *
 *  1.  High-level modules should depend on abstractions, not on concrete classes.
 *      ( In our example case PaymentProcessor class which is high level module depended on PaymentMethod (Abstraction)
 *      rather than CreditCardPayment ( concrete class)
 *
 *  2. Abstractions should not depend on details; details should depend on abstractions.
 *      (In our case PaymentMethod(Abstraction) didn't depend on CreditCardPayment(detailed subclass)
 *      Rather, PaymentMethod(Abstraction) defined a way how details ( CreditCardPayment, UPI Payment) should work)
 *
 *  */


