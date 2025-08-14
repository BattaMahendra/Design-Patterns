package Design.Patterns.behavioral.Observer;

import Design.Patterns.behavioral.Observer.Subject.Channel;

public abstract class Observer {

    public String name;
    public abstract void notify(Channel channel, String videoName);
}
