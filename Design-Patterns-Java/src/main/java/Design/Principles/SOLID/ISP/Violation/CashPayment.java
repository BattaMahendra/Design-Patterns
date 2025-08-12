package Design.Principles.SOLID.ISP.Violation;

/**
 * CashPayment only needs pay(), but is forced to implement all other methods.
 * This leads to meaningless empty methods or dummy implementations.
 */
public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Cash collected: ₹" + amount);
    }

    @Override
    public void validateCreditCard() {
        // NO-OP — irrelevant for cash
    }

    @Override
    public void scanQrCode() {
        // NO-OP — irrelevant for cash
    }

    @Override
    public void doBankTransfer() {
        // NO-OP — irrelevant for cash
    }
}
