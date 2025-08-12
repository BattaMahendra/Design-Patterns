package Design.Principles.SOLID.ISP.Principle;

/**
 * CashPayment implements only what it actually needs.
 */
public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Cash collected: ₹" + amount);
    }
}

/**
 * UpiPayment implements PaymentMethod and QRCodeScanner — nothing else.
 */
 class UpiPayment implements PaymentMethod, QRCodeScanner {
    @Override
    public void pay(double amount) {
        System.out.println("Paid via UPI: ₹" + amount);
    }

    @Override
    public void scanQrCode() {
        System.out.println("Scanning UPI QR Code...");
    }
}

/**
 * CreditCardPayment implements PaymentMethod and CreditCardValidator.
 */
class CreditCardPayment implements PaymentMethod, CreditCardValidator {
    @Override
    public void pay(double amount) {
        System.out.println("Charged credit card: ₹" + amount);
    }

    @Override
    public void validateCreditCard() {
        System.out.println("Validating credit card...");
    }
}