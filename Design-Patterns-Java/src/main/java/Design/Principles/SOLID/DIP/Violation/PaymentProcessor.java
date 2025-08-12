package Design.Principles.SOLID.DIP.Violation;

/** DIP - Dependency Inversion Principle
 *
 * High-level modules should depend on abstractions, not on concrete classes.
 * Abstractions should not depend on details; details should depend on abstractions.*/


/**
 * BAD: High-level class PaymentProcessor directly depends on a concrete class CreditCardPayment.
 * To switch to UPI or Cash, you must modify PaymentProcessor — breaking OCP and violating DIP.
 */
public class PaymentProcessor {
    private CreditCardPayment creditCardPayment; // tightly coupled

    public PaymentProcessor() {
        // Creates its own dependency (CreditCardPayment)
        this.creditCardPayment = new CreditCardPayment();
    }

    public void process(double amount) {
        // Hardcoded to credit card logic
        creditCardPayment.pay(amount);
    }
}

/**
 *
 * Why this violates DIP
 * PaymentProcessor cannot work with CashPayment or UpiPayment without code changes.
 * High-level module controls the creation of its dependency instead of receiving an abstraction.*/

