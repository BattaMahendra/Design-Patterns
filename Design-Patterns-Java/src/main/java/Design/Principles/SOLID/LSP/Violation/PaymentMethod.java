package Design.Principles.SOLID.LSP.Violation;

public interface PaymentMethod {
    void pay();
    void refund();
}


/*
* here we are violation Liskov substitution principle as the CashPayment class is not supportive of refund() method*/
 class CashPayment implements PaymentMethod {
    public void pay() {
        // pay with cash
    }

    public void refund() {
        throw new UnsupportedOperationException("Refund not supported for cash payments");
    }
}


/**
 *
 * Liskov Substitution Principle (LSP)
 *
 * "If class S is a subtype of class T,
 * then objects of type T should be replaceable with objects of type S without altering the correctness of the program."
 *
 * */


