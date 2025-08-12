package Design.Principles.SOLID.LSP.Principle;

/**
 * CashPayment implements PaymentMethod only. It does NOT claim to support refund.
 * This means CashPayment objects can be used anywhere a PaymentMethod is expected,
 * and there is no dangerous assumption about refund().
 */
 class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Cash collected: ₹" + amount);
    }
    // No refund() method — not supported, declared by design.
}

/**
 * CreditCardPayment implements RefundablePayment: it supports both pay() and refund().
 * Since it implements RefundablePayment, it can safely be used anywhere a RefundablePayment
 * is required — satisfying substitutability for that abstraction.
 */
class CreditCardPayment implements RefundablePayment {
    @Override
    public void pay(double amount) {
        System.out.println("Charged credit card: ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to credit card");
    }
}
