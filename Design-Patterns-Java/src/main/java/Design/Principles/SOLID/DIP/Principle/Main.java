package Design.Principles.SOLID.DIP.Principle;

/**
 * Application-level code (composition root) decides the concrete implementation.
 */
public class Main {
    public static void main(String[] args) {
        PaymentMethod payment = new UpiPayment(); // Could be CashPayment, CreditCardPayment, etc.
        PaymentProcessor processor = new PaymentProcessor(payment);
        processor.process(1200.0); // Flexible — no code changes in PaymentProcessor
    }
}


