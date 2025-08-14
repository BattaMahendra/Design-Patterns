package Design.Patterns.behavioral.Observer;

import Design.Patterns.behavioral.Observer.Subject.Channel;

public class Subscriber extends Observer {


    public Subscriber(String name){
        this.name = name;
    }


    @Override
    public void notify(Channel channel, String videoName) {
        System.out.println("Dear  "+ this.name +", youtube channel "+ channel.name+" added a new video "+ videoName);
    }
}
