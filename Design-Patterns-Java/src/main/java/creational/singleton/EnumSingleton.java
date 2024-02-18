package creational.singleton;

public enum EnumSingleton {
    ENUM_SINGLETON

    /*
    In java enum constants are by default public static final
    the above line is compiled as
    public static final EnumSingleton ENUM_SINGLETON = new EnumSingleton();
    using enum for singleton pattern provides us safety from Reflection and multi threading

    this is lazy initialization of singleton design pattern
    the ENUM_SINGLETON is initialized only when the EnumSingleton class is referenced elsewhere

    refer this link to understand better why enum provides us with lazy initialization
    https://stackoverflow.com/questions/16771373/singleton-via-enum-way-is-lazy-initialized
     */
}
