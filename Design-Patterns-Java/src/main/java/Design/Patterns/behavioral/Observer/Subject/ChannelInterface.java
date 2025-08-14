package Design.Patterns.behavioral.Observer.Subject;

import Design.Patterns.behavioral.Observer.Observer;

public interface ChannelInterface {

     void addSubscribers(Observer observer);
     void unSubscribe(Observer observer);
     void notifySubscribers(String message);
}
