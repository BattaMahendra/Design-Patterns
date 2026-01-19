package Design.Patterns.structural.proxy.practice;

public class Main {
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();

        internet.connectTo("google.com");       // allowed
        internet.connectTo("facebook.com");     // blocked
    }
}
