package Design.Principles.SOLID.ISP.Violation;

/**
 * UpiPayment only uses pay() and scanQrCode(), but must still
 * implement irrelevant methods like validateCreditCard() and doBankTransfer().
 */
public class UpiPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid via UPI: ₹" + amount);
    }

    @Override
    public void validateCreditCard() {
        // NO-OP — irrelevant for UPI
    }

    @Override
    public void scanQrCode() {
        System.out.println("Scanning UPI QR Code...");
    }

    @Override
    public void doBankTransfer() {
        // NO-OP — irrelevant for UPI
    }
}