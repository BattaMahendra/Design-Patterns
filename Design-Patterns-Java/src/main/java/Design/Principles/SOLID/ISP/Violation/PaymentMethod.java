package Design.Principles.SOLID.ISP.Violation;

/**
 * BAD: This interface lumps all possible payment-related actions together.
 * Not every payment type supports or needs ALL of these.
 */
public interface PaymentMethod {
    void pay(double amount);
    void validateCreditCard(); // needed only for credit cards
    void scanQrCode();         // needed only for UPI
    void doBankTransfer();     // needed only for bank transfer
}

/**
 *  Classes are forced to implement methods they don’t use.
 * This creates confusion and possible misuse (someone may call doBankTransfer() on a CashPayment instance).
 *
 * Solution
 * Segregate the Interfaces and make child classes implement what they only need
 *
 * Practical tip:
 * If you ever find yourself putting dummy return null; or empty {} bodies in a method
 * just to satisfy an interface, you might be violating ISP.
 **/

