package Design.Patterns.behavioral.Observer.Subject;

import Design.Patterns.behavioral.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements ChannelInterface {

    public String name;

    public Channel(String name){
        this.name = name;
    }


    List<Observer> observers = new ArrayList<Observer>();

    public void addSubscribers(Observer observer){

         if (!observers.contains(observer)) {
             this.observers.add(observer);
             System.out.println(observer.name +
                     " is successfully subscribed to youtube channel" + this.name);
         }else{
             System.out.println(observer.name +
                     " is a existing subscriber to youtube channel" + this.name);
         }

    }

    public void unSubscribe(Observer observer){
        if(observers.contains(observer)) {
            this.observers.remove(observer);
            System.out.println(observer.name +
                    " is successfully subscribed to youtube channel" + this.name);
        }else{
            System.out.println(observer.name +
                    " is not a  subscriber to youtube channel" + this.name);
        }
    }

    public void notifySubscribers(String message){

         observers.forEach(observer -> observer.notify(this, message));
     }

     /*
     * Take care of exceptions in observers notify method as if one observer gets exception then others also
     * will stop receiving*/

}
