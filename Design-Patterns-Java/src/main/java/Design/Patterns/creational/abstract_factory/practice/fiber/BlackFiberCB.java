package Design.Patterns.creational.abstract_factory.practice.fiber;

import Design.Patterns.creational.abstract_factory.practice.metal.MetalCB;

public class BlackFiberCB implements FiberCB {
    @Override
    public FiberCB getCB() {
        return new BlackFiberCB();
    }
}
