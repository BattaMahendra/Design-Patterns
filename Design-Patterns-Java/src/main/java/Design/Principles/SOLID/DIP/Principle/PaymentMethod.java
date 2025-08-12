package Design.Principles.SOLID.DIP.Principle;

/**
 * Abstraction for payment.
 * High-level code will depend on this interface instead of a concrete class.
 */
public interface PaymentMethod {
    void pay(double amount);
}

/**
 * Low-level implementations depend on the abstraction (PaymentMethod).
 */
 class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Charged credit card: ₹" + amount);
    }
}

 class UpiPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid via UPI: ₹" + amount);
    }
}