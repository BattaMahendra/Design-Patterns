package Design.Principles.SOLID.DIP.Violation;

/**
 * This concrete class is a low-level detail.
 * The high-level PaymentProcessor should not be locked to this one.
 */
public class CreditCardPayment {
    public void pay(double amount) {
        System.out.println("Charged credit card: ₹" + amount);
    }
}