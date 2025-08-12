package Design.Principles.SOLID.LSP.Principle;

/**
 * Base abstraction: every payment method must be able to pay.
 * No assumption about refund capability here.
 */
public interface PaymentMethod {
    void pay(double amount);
}

/**
 * Separate interface for the refund capability.
 * Only payment methods that truly support refunds implement this.
 */
 interface RefundablePayment extends PaymentMethod {
    void refund(double amount);
}


