package Design.Patterns.behavioral.template;

public class CreditCardPayment extends PaymentProcessor{
    @Override
    boolean validate() {

        System.out.println("Validation of card details of User");
        return true;
    }

    @Override
    void execute() {

        System.out.println("Making payment through Card");

    }
}
