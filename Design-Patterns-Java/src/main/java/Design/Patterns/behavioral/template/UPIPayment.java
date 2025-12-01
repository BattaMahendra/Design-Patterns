package Design.Patterns.behavioral.template;

public class UPIPayment extends PaymentProcessor{
    @Override
    boolean validate() {

        System.out.println("Validation of upi details of User");
        return true;
    }

    @Override
    void execute() {

        System.out.println("Executing payment through QR code");

    }

    @Override
    void  sendNotification(){

    }


}
