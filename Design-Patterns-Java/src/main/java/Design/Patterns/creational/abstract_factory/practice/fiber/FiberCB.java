package Design.Patterns.creational.abstract_factory.practice.fiber;

import Design.Patterns.creational.abstract_factory.practice.CB;
import Design.Patterns.creational.abstract_factory.practice.metal.MetalCB;

public interface FiberCB extends CB {

    @Override
    FiberCB getCB();
}
