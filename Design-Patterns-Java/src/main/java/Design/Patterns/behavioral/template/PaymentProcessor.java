package Design.Patterns.behavioral.template;

public abstract class PaymentProcessor {


    public final void process(){
        validate();
        execute();;
        sendNotification();
    }

     abstract boolean validate();
    abstract void execute();
     void sendNotification(){

        System.out.println("Sending Notification to the email");
    }
}
