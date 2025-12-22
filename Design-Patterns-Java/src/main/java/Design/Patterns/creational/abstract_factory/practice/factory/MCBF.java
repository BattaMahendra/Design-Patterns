package Design.Patterns.creational.abstract_factory.practice.factory;

import Design.Patterns.creational.abstract_factory.practice.CB;
import Design.Patterns.creational.abstract_factory.practice.metal.MetalCB;
import Design.Patterns.creational.abstract_factory.practice.metal.SteelCB;

public  class MCBF implements CBF {



    @Override
    public CB getCB(String s) {
       if(s.equals("steel")) return new SteelCB();
       else return null;
    }
}
