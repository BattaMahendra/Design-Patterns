package Design.Patterns.creational.abstract_factory.practice.metal;

import Design.Patterns.creational.abstract_factory.practice.CB;

public interface MetalCB extends CB {

    @Override
    MetalCB getCB();
}
