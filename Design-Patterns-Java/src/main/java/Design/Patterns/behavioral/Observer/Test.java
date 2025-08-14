package Design.Patterns.behavioral.Observer;

import Design.Patterns.behavioral.Observer.Subject.Channel;

import java.sql.SQLOutput;

public class Test {

    public static void main(String[] args) {

        //Create Channels
        Channel RangaTechYoutube = new Channel("RangaTechYouTube");
        Channel SakshiNews = new Channel("Sakshi News");
        Channel Tseries = new Channel("Tseries");

        //Create Subscribers
        Subscriber Ranga = new Subscriber("Ranga");
        Subscriber Mahi = new Subscriber("Mahi");
        Subscriber Uday = new Subscriber("Uday");
        Subscriber Nano = new Subscriber("Nano");

        System.out.println("\n\n\t\t\t=========================== Adding Subscribers to YouTube channels =============================\n");
        //add subscribers to channels
        RangaTechYoutube.addSubscribers(Ranga);
        RangaTechYoutube.addSubscribers(Mahi);
        RangaTechYoutube.addSubscribers(Uday);
        RangaTechYoutube.addSubscribers(Nano);

        SakshiNews.addSubscribers(Ranga);
        SakshiNews.addSubscribers(Uday);

        Tseries.addSubscribers(Mahi);
        Tseries.addSubscribers(Uday);
        Tseries.addSubscribers(Ranga);

        //notify songs
        System.out.println("\n\n\t\t\t=========================== Sending notifications =============================\n");
        Tseries.notifySubscribers("Added Devara songs");
        SakshiNews.notifySubscribers("Jagan anna interview");
        RangaTechYoutube.notifySubscribers("Added Apple phone review");

        System.out.println("\n\n\t\t\t===========================  Unsubscribing the users =============================\n");
        //remove subscribers
        Tseries.unSubscribe(Uday);
        RangaTechYoutube.unSubscribe(Mahi);
        SakshiNews.unSubscribe(Nano);
    }
}
