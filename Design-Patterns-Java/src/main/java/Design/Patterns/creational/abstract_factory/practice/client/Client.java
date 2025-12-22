package Design.Patterns.creational.abstract_factory.practice.client;

import Design.Patterns.creational.abstract_factory.practice.factory.CBF;
import Design.Patterns.creational.abstract_factory.practice.factory.MCBF;
import Design.Patterns.creational.abstract_factory.practice.metal.SteelCB;

public class Client {

    public static void main(String[] args) {

        FactoryCreator fc = new FactoryCreator();

        SteelCB s = (SteelCB) fc.getCBF("Metal").getCB("Steel");
    }
}

class FactoryCreator{

    public CBF getCBF(String s ){
        if(s.equals("Metal")) return new MCBF();
        else return null;
    }
}
