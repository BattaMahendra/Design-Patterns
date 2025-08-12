package Design.Principles.SOLID.OCP.violation;


/**
 *
 * Here if suppose new payment type emerges like bitcoin then we are going to add one more else if conditoin
 * which is violation of OCP as we are modifying the method */
public class PaymentProcessor {
    public void processPayment(String type) {
        if (type.equals("cash")) {
            // cash logic
        } else if (type.equals("credit_card")) {
            // credit card logic
        } else if (type.equals("upi")) {
            // upi logic
        }
    }
}
