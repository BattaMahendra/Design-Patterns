package Design.Patterns.behavioral.template;

public class Test {

    public static void main(String[] args) {

        UPIPayment upiPayment = new UPIPayment();
        upiPayment.process();

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.process();
    }
}
