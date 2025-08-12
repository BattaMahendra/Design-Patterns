package Design.Principles.SOLID.ISP.Principle;

/**
 * Keep base payment interface minimal — only the universal action.
 */
public interface PaymentMethod {
    void pay(double amount);
}

/**
 * Credit-card-specific operations separated.
 */
 interface CreditCardValidator {
    void validateCreditCard();
}

/**
 * UPI-specific operations separated.
 */
interface QRCodeScanner {
    void scanQrCode();
}

/**
 * Bank-transfer-specific operations separated.
 */
interface BankTransferHandler {
    void doBankTransfer();
}
