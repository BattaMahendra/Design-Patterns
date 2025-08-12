package Design.Principles.SOLID.OCP.principle;

// Extend PaymentMethod for new types without touching PaymentProcessor
 class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Charging credit card for ₹" + amount);
    }
}

 class UpiPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paying via UPI for ₹" + amount);
    }
}

 public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount); // No if-else needed
    }
}


/**
 * Open Closed Principle
 *
 * Classes should be open for extension but closed for modification.*/
