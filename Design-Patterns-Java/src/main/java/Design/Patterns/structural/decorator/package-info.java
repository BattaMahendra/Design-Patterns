package Design.Patterns.structural.decorator;
/**
 * we are changing the behaviour of the object at runtime without interfering other objects of same class
 * Here in this we are decorating Hema with different styles without interfering with original Hema object.
 *
 *
 * Main things to remember in Decorator design pattern
 *
 * Component Interface : Hema
 *  This is the common interface which will act as guide for overall implementation
 *
 * Concrete Base model : CasualHema ( must implement component interface)
 * This is the plain class or model on which you would like to add decorations
 *
 * Abstract Decorator : HemaDecorator ( must implement component interface)
 *  This is the abstract class for defining how to decorate
 *  This should have a reference of Component Interface(Hema) and it should be injected in the constructor
 *
 * Concrete Decorator: TraditionalHema ( will implement Abstract decorator)
 *  will refer to the super class constructor and in methods following add decorations to passed object
 */