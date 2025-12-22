package Design.Patterns.creational.abstract_factory.practice.metal;

public class SteelCB implements MetalCB{
    @Override
    public SteelCB getCB() {
        return new SteelCB();
    }
}
